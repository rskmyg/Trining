package jp.co.brainnet.dolteng.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jp.co.brainnet.dolteng.dto.CartInfo;
import jp.co.brainnet.dolteng.form.CartInputForm;
import jp.co.brainnet.dolteng.service.BookService;

import org.apache.log4j.Logger;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class CartInputAction {

	Logger logger = Logger.getLogger(this.getClass());

	@Resource
	HttpServletRequest request;

	@Resource
	protected BookService bookService;

//	@Resource
	public CartInfo cartInfo;

	@ActionForm
	@Resource
	protected CartInputForm cartInputForm;

	@Execute(validator = false)
	public String index() {
		// ①フォーム値の取得(isbn)
		String isbn = cartInputForm.isbn;
		if (logger.isDebugEnabled()) {
			logger.debug("★★★★★★★★★★★★①フォーム値の取得[isbn=" + isbn + "]");
		}
		// TODO NULLチェック

		// ②セッションからisbnの一覧を取得する
		HttpSession session = request.getSession(false);
		List<String> isbns = (List<String>) session.getAttribute("isbns");
		if (logger.isDebugEnabled()) {
			logger.debug("★★★★★★★★★★★★②セッションからisbnの一覧を取得する[isbns=" + isbns + "]");
		}

		// ③セッションにフォームから取得したisbnをセットする
		if (isbns == null) {
			isbns = new ArrayList<String>();
		}
		if (logger.isDebugEnabled()) {
			logger.debug("★★★★★★★★★★★★③セッションにフォームから取得したisbnをセットする");
		}

		// すでに登録されていたら追加しない
		if (!isbns.contains(isbn)) {
			if (logger.isDebugEnabled()) {
				logger.debug("★★★★★★★★★★★★すでにisbnが登録済み");
			}
			isbns.add(isbn);
			session.setAttribute("isbns", isbns);
		}

		// ④セッションから取得したisbnに一致する本の情報をDBから取得する
		if (logger.isDebugEnabled()) {
			logger.debug("★★★★★★★★★★★★④セッションから取得したisbnに一致する本の情報をDBから取得する");
		}
		cartInfo=new CartInfo();
		cartInfo.books = bookService.findByAddBookId(isbns);

		// ⑤表示するjspに遷移する
		return "/shopping/cart_input.jsp";
	}

	@Execute(validator = true, input = "/shopping/cart_input.jsp")
	public String check() {
		return "/shopping/cart_confirm.jsp";
	}
}

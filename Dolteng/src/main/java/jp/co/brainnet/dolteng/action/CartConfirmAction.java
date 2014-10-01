package jp.co.brainnet.dolteng.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jp.co.brainnet.dolteng.dto.CartInfo;
import jp.co.brainnet.dolteng.form.CartConfirmForm;
import jp.co.brainnet.dolteng.form.CartInputForm;
import jp.co.brainnet.dolteng.service.BookService;

import org.apache.log4j.Logger;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class CartConfirmAction {

	Logger logger = Logger.getLogger(this.getClass());

	@Resource
	HttpServletRequest request;

	@ActionForm
	@Resource
	protected CartConfirmForm cartConfirmForm;

	@ActionForm
	@Resource
	protected CartInputForm cartInputForm;

	@Resource
	protected BookService bookService;

	public CartInfo cartInfo;

	public String resultZc;
	public String resultPref;
	public String resultAdd;

	@Execute(validator = true, input = "/shopping/cart_input.jsp")
	public String index() {
    	// 配送先住所の表示
    	resultZc = cartConfirmForm.zipCode;
    	resultPref = cartConfirmForm.prefecture;
    	resultAdd = cartConfirmForm.address;

		// ②セッションからisbnの一覧を取得する
		HttpSession session = request.getSession(false);
		List<String> isbns = (List<String>) session.getAttribute("isbns");
		if (logger.isDebugEnabled()) {
			logger.debug("★★★★★★★★★★★★②セッションからisbnの一覧を取得する[isbns=" + isbns + "]");
		}
		cartInfo = new CartInfo();
		cartInfo.books = bookService.findByAddBookId(isbns);

        return "/shopping/cart_confirm.jsp";
    }
}

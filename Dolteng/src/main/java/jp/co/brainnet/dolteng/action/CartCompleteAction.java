package jp.co.brainnet.dolteng.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jp.co.brainnet.dolteng.dto.CartInfo;
import jp.co.brainnet.dolteng.entity.Order_detail;
import jp.co.brainnet.dolteng.entity.Orders;
import jp.co.brainnet.dolteng.form.CartCompleteForm;
import jp.co.brainnet.dolteng.service.BookService;
import jp.co.brainnet.dolteng.service.Order_detailService;
import jp.co.brainnet.dolteng.service.OrdersService;

import org.apache.log4j.Logger;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class CartCompleteAction {

	Logger logger = Logger.getLogger(this.getClass());

	@Resource
	HttpServletRequest request;

	@ActionForm
	@Resource
	protected CartCompleteForm cartCompleteForm;

	@Resource
	protected BookService bookService;

	@Resource
	protected OrdersService ordersService;

	@Resource
	protected Order_detailService order_detailService;

	public CartInfo cartInfo;

	public Integer resultOrderNo;

	@Execute(validator = false)
	public String index() {
		String zipCode = cartCompleteForm.zipCode;
		String prefecture = cartCompleteForm.prefecture;
		String address = cartCompleteForm.address;
		if (logger.isDebugEnabled()) {
			logger.debug("★★★★★★★★★★★★①フォーム値の取得[郵便番号=" + zipCode + "]");
			logger.debug("★★★★★★★★★★★★②フォーム値の取得[都道府県名=" + prefecture + "]");
			logger.debug("★★★★★★★★★★★★③フォーム値の取得[それ以降の住所=" + address + "]");
		}

		HttpSession session = request.getSession(false);
		List<String> isbns = (List<String>) session.getAttribute("isbns");
		if (logger.isDebugEnabled()) {
			logger.debug("★★★★★★★★★★★★④セッションからisbnの一覧を取得する[isbns=" + isbns
					+ "]");
		}
		cartInfo = new CartInfo();
		cartInfo.books = bookService.findByAddBookId(isbns);

		// 注文テーブルINSERT
		Orders orders = new Orders();
		orders.zip_code = zipCode;
		orders.prefecture = prefecture;
		orders.address = address;
		ordersService.insert(orders);

		// 受注番号取得
		List<Orders> results = ordersService.findAllOrderById();
		Orders result = results.get(results.size() - 1);
		Integer order_no = result.order_no;

		Order_detail order_detail = new Order_detail();
		// isbnsからisbnを取り出す
		for (String isbn : isbns) {
			order_detail.order_no = order_no;
			order_detail.isbn = isbn;

			// INSERTをする
			order_detailService.insert(order_detail);
		}

		//order_noを表示する
		resultOrderNo = order_detail.order_no;

		return "/shopping/cart_complete.jsp";
	}
}

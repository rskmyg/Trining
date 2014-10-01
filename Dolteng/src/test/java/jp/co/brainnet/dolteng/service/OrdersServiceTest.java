package jp.co.brainnet.dolteng.service;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Generated;

import jp.co.brainnet.dolteng.entity.Orders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.unit.Seasar2;

/**
 * {@link OrdersService}のテストクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceTestModelFactoryImpl"}, date = "2014/09/12 16:01:16")
@RunWith(Seasar2.class)
public class OrdersServiceTest {//extends S2TestCase {

    private OrdersService ordersService;
    private  JdbcManager jdbcManager;

    public void testAvailable() throws Exception {
        assertNotNull(ordersService);
        assertNotNull(jdbcManager);
    }

//    @Override
//    protected void setUp() throws Exception {
//        super.setUp();
//        include("app.dicon");
//    }

	/**
	 * テスト実行前にテーブルを全て削除します。
	 */
	private void dropTable() {

		// 削除すべきテーブルがあるか否か確認します。
		long count = ordersService.getCount();
		if (count > 0) {
			// レコードが1件でもある場合、前件取得します。
			List<Orders> ordersList = ordersService.findAll();

			// 取得したレコードを削除します。
			for (Orders o : ordersList) {
				ordersService.delete(o);
			}
		}
	}

    @Test
    public void testInsert1()  throws Exception{

    	// レコードを削除します。
    	this.dropTable();

    	//テスト用データ
		String zipCode = "1234567";
		String prefecture = "東京都";
		String address = "千代田区";

		//INSERTのテスト
    	Orders orders = new Orders();
		orders.zip_code = zipCode;
		orders.prefecture = prefecture;
		orders.address = address;
		ordersService. insert(orders);

		//SELECT
		List<Orders> list = ordersService.findAll();

		//zipCodeを取り出す
    	int count = list.size(); // 件数

    	assertThat(count, is(1)); // 結果が1件であること

    	Orders order = list.get(0); // 1件取得

		//zipCodeが一致しているか？
    	assertThat(order.zip_code, is(zipCode));
    }

//    @Test
//    public void testInsert2()  throws Exception{
//    	//テスト用データ
//		String zipCode = "1234567";
//		String prefecture = "東京都";
//		String address = "千代田区";
//		String isbn1 ="ISBN000-1234-5678-1";
//		String isbn2 ="ISBN000-1234-5678-2";
//		Integer quantity1 = 1;
//		Integer quantity2 = 2;
//
//		//INSERTのテスト
//    	Orders o = new Orders(); //Orderを生成
//
//    	//Orderに値を設定
//    	o.zip_code = zipCode;
//		o.prefecture = prefecture;
//		o.address = address;
//
//		List<Order_detail> ods = new ArrayList<Order_detail>(); //リストを生成
//		Order_detail od1 = new Order_detail(); //注文明細1を生成
//
//		//注文明細1に値を設定
//		od1.isbn = isbn1;
//		od1.quantity = quantity1;
//		ods.add(od1); //リストに注文明細1を追加
//
//		Order_detail od2 = new Order_detail(); //注文明細2を生成
//
//		//注文明細2に値を設定
//		od2.isbn = isbn2;
//		od2.quantity = quantity2;
//		ods.add(od2); //リストに注文明細2を追加
//
//		o.order_detailList = ods; //Orderの注文明細リストに設定
////		ordersService. insert(ods); //INSERT実行
//		ordersService. insert(o); //INSERT実行
//
//		//SELECT
//		List<Orders> list = ordersService.findAll();
//
//    	int count = list.size(); // 件数
//    	assertThat(count, is(1)); // 結果が1件であること
//    	Orders order = list.get(0); // 1件取得
//
//		//zipCodeを取り出す
//    	String zipcode = order.zip_code;
//		//zipCodeが一致しているか
//    	assertThat(zipcode, is(zipCode));
//
//    	//orderから注文明細リストを取り出す
//    	List<Order_detail> odl =  order.order_detailList;
//    	Order_detail odl1 = odl.get(0); //注文明細リストから注文明細1を取り出す
//    	Order_detail odl2 = odl.get(1); //注文明細リストから注文明細2を取り出す
//    	String isbnOd1 = odl1.isbn; //注文明細1からisbnを取り出す
//    	String isbnOd2 = odl2.isbn; //注文明細2からisbnを取り出す
//    	assertThat(isbnOd1, is(isbn1)); //isbnが一致しているか
//    	assertThat(isbnOd2, is(isbn2)); //isbnが一致しているか
//    }
}
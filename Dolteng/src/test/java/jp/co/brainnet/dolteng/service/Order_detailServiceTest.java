package jp.co.brainnet.dolteng.service;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Generated;

import jp.co.brainnet.dolteng.entity.Order_detail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.unit.Seasar2;

/**
 * {@link Order_detailService}のテストクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceTestModelFactoryImpl"}, date = "2014/09/12 16:01:16")
	@RunWith(Seasar2.class)
    public class Order_detailServiceTest {//extends S2TestCase {

        private Order_detailService order_detailService;
        private  JdbcManager jdbcManager;

        public void testAvailable() throws Exception {
            assertNotNull(order_detailService);
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
    		long count = order_detailService.getCount();
    		if (count > 0) {
    			// レコードが1件でもある場合、前件取得します。
    			List<Order_detail> orderDetailsList = order_detailService.findAll();

    			// 取得したレコードを削除します。
    			for (Order_detail o : orderDetailsList) {
    				order_detailService.delete(o);
    			}
    		}
    	}

        @Test
        public void testInsert()  throws Exception{

        	// レコードを削除します。
        	this.dropTable();

        	//テスト用データ
    		String isbn = "ISBN4-87311-279-6";

    		//INSERTのテスト
    		Order_detail order_detail = new Order_detail();
    		order_detail.order_no=11;
    		order_detail.isbn = isbn;

    		order_detailService. insert(order_detail);

    		//SELECT
    		List<Order_detail> list = order_detailService.findAll();

    		//isbnを取り出す
        	int count = list.size(); // 件数

        	assertThat(count, is(1)); // 結果が1件であること

        	Order_detail od = list.get(0); // 1件取得

    		//isbnが一致しているか？
        	assertThat(od.isbn, is(isbn));
        }
}
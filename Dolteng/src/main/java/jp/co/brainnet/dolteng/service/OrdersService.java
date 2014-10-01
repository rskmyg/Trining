package jp.co.brainnet.dolteng.service;

import static jp.co.brainnet.dolteng.entity.OrdersNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import jp.co.brainnet.dolteng.entity.Orders;

/**
 * {@link Orders}のサービスクラスです。
 *
 */
@Generated(value = { "S2JDBC-Gen 2.4.46",
		"org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl" }, date = "2014/09/16 11:02:27")
public class OrdersService extends AbstractService<Orders> {

	public int insert(Orders orders) {
		Timestamp now = new Timestamp(System.currentTimeMillis());
		orders.order_date = now;
		orders.modify_datetime = now;
		orders.create_datetime = now;
//		return this.jdbcManager.insert(orders).execute();
		return super.insert(orders);
	}

	/**
	 * 識別子でエンティティを検索します。
	 *
	 * @param order_no
	 *            識別子
	 * @return エンティティ
	 */
	public Orders findById(Integer order_no) {
		return select().id(order_no).getSingleResult();
	}

	/**
	 * 識別子の昇順ですべてのエンティティを検索します。
	 *
	 * @return エンティティのリスト
	 */

	// public List<Orders> InsertFormData(String zipCode, String prefecture,
	// String address){
	// return insert(orders)
	// .includes("zip_code", "prefecture","address")
	// .execute();
	// }

	public List<Orders> findAllOrderById() {
		return select().orderBy(asc(order_no())).getResultList();
	}
}
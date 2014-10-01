package jp.co.brainnet.dolteng.service;

import static jp.co.brainnet.dolteng.entity.Order_detailNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import jp.co.brainnet.dolteng.entity.Order_detail;

/**
 * {@link Order_detail}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/09/16 11:02:27")
public class Order_detailService extends AbstractService<Order_detail> {

	public int insert(Order_detail order_detail) {
		Timestamp now = new Timestamp(System.currentTimeMillis());
		order_detail.modify_datetime = now;
		order_detail.create_datetime = now;
		return this.jdbcManager.insert(order_detail).execute();
	}

    /**
     * 識別子でエンティティを検索します。
     *
     * @param order_no
     *            識別子
     * @param isbn
     *            識別子
     * @return エンティティ
     */
    public Order_detail findById(Integer order_no, String isbn) {
        return select().id(order_no, isbn).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     *
     * @return エンティティのリスト
     */
    public List<Order_detail> findAllOrderById() {
        return select().orderBy(asc(order_no()), asc(isbn())).getResultList();
    }
}
package jp.co.brainnet.dolteng.service;

import java.util.List;
import javax.annotation.Generated;
import jp.co.brainnet.dolteng.entity.Customer;

import static jp.co.brainnet.dolteng.entity.CustomerNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link Customer}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/09/16 11:02:27")
public class CustomerService extends AbstractService<Customer> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param user_id
     *            識別子
     * @return エンティティ
     */
    public Customer findById(String user_id) {
        return select().id(user_id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Customer> findAllOrderById() {
        return select().orderBy(asc(user_id())).getResultList();
    }
}
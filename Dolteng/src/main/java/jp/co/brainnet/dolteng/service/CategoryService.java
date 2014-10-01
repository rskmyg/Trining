package jp.co.brainnet.dolteng.service;

import java.util.List;
import javax.annotation.Generated;
import jp.co.brainnet.dolteng.entity.Category;

import static jp.co.brainnet.dolteng.entity.CategoryNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link Category}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/09/16 11:02:27")
public class CategoryService extends AbstractService<Category> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param category_id
     *            識別子
     * @return エンティティ
     */
    public Category findById(Integer category_id) {
        return select().id(category_id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Category> findAllOrderById() {
        return select().orderBy(asc(category_id())).getResultList();
    }
}
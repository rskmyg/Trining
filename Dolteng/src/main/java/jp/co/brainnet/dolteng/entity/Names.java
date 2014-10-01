package jp.co.brainnet.dolteng.entity;

import javax.annotation.Generated;
import jp.co.brainnet.dolteng.entity.BookNames._BookNames;
import jp.co.brainnet.dolteng.entity.CategoryNames._CategoryNames;
import jp.co.brainnet.dolteng.entity.CustomerNames._CustomerNames;
import jp.co.brainnet.dolteng.entity.Joint_tablesNames._Joint_tablesNames;
import jp.co.brainnet.dolteng.entity.Order_detailNames._Order_detailNames;
import jp.co.brainnet.dolteng.entity.OrdersNames._OrdersNames;

/**
 * 名前クラスの集約です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2014/09/18 10:31:59")
public class Names {

    /**
     * {@link Book}の名前クラスを返します。
     * 
     * @return Bookの名前クラス
     */
    public static _BookNames book() {
        return new _BookNames();
    }

    /**
     * {@link Category}の名前クラスを返します。
     * 
     * @return Categoryの名前クラス
     */
    public static _CategoryNames category() {
        return new _CategoryNames();
    }

    /**
     * {@link Customer}の名前クラスを返します。
     * 
     * @return Customerの名前クラス
     */
    public static _CustomerNames customer() {
        return new _CustomerNames();
    }

    /**
     * {@link Joint_tables}の名前クラスを返します。
     * 
     * @return Joint_tablesの名前クラス
     */
    public static _Joint_tablesNames joint_tables() {
        return new _Joint_tablesNames();
    }

    /**
     * {@link Orders}の名前クラスを返します。
     * 
     * @return Ordersの名前クラス
     */
    public static _OrdersNames orders() {
        return new _OrdersNames();
    }

    /**
     * {@link Order_detail}の名前クラスを返します。
     * 
     * @return Order_detailの名前クラス
     */
    public static _Order_detailNames order_detail() {
        return new _Order_detailNames();
    }
}
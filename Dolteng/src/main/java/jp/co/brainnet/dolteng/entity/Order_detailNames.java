package jp.co.brainnet.dolteng.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import jp.co.brainnet.dolteng.entity.BookNames._BookNames;
import jp.co.brainnet.dolteng.entity.OrdersNames._OrdersNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Order_detail}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/09/18 10:31:59")
public class Order_detailNames {

    /**
     * order_noのプロパティ名を返します。
     * 
     * @return order_noのプロパティ名
     */
    public static PropertyName<Integer> order_no() {
        return new PropertyName<Integer>("order_no");
    }

    /**
     * isbnのプロパティ名を返します。
     * 
     * @return isbnのプロパティ名
     */
    public static PropertyName<String> isbn() {
        return new PropertyName<String>("isbn");
    }

    /**
     * quantityのプロパティ名を返します。
     * 
     * @return quantityのプロパティ名
     */
    public static PropertyName<Integer> quantity() {
        return new PropertyName<Integer>("quantity");
    }

    /**
     * modify_datetimeのプロパティ名を返します。
     * 
     * @return modify_datetimeのプロパティ名
     */
    public static PropertyName<Timestamp> modify_datetime() {
        return new PropertyName<Timestamp>("modify_datetime");
    }

    /**
     * create_datetimeのプロパティ名を返します。
     * 
     * @return create_datetimeのプロパティ名
     */
    public static PropertyName<Timestamp> create_datetime() {
        return new PropertyName<Timestamp>("create_datetime");
    }

    /**
     * ordersのプロパティ名を返します。
     * 
     * @return ordersのプロパティ名
     */
    public static _OrdersNames orders() {
        return new _OrdersNames("orders");
    }

    /**
     * bookのプロパティ名を返します。
     * 
     * @return bookのプロパティ名
     */
    public static _BookNames book() {
        return new _BookNames("book");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _Order_detailNames extends PropertyName<Order_detail> {

        /**
         * インスタンスを構築します。
         */
        public _Order_detailNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _Order_detailNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _Order_detailNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * order_noのプロパティ名を返します。
         *
         * @return order_noのプロパティ名
         */
        public PropertyName<Integer> order_no() {
            return new PropertyName<Integer>(this, "order_no");
        }

        /**
         * isbnのプロパティ名を返します。
         *
         * @return isbnのプロパティ名
         */
        public PropertyName<String> isbn() {
            return new PropertyName<String>(this, "isbn");
        }

        /**
         * quantityのプロパティ名を返します。
         *
         * @return quantityのプロパティ名
         */
        public PropertyName<Integer> quantity() {
            return new PropertyName<Integer>(this, "quantity");
        }

        /**
         * modify_datetimeのプロパティ名を返します。
         *
         * @return modify_datetimeのプロパティ名
         */
        public PropertyName<Timestamp> modify_datetime() {
            return new PropertyName<Timestamp>(this, "modify_datetime");
        }

        /**
         * create_datetimeのプロパティ名を返します。
         *
         * @return create_datetimeのプロパティ名
         */
        public PropertyName<Timestamp> create_datetime() {
            return new PropertyName<Timestamp>(this, "create_datetime");
        }

        /**
         * ordersのプロパティ名を返します。
         * 
         * @return ordersのプロパティ名
         */
        public _OrdersNames orders() {
            return new _OrdersNames(this, "orders");
        }

        /**
         * bookのプロパティ名を返します。
         * 
         * @return bookのプロパティ名
         */
        public _BookNames book() {
            return new _BookNames(this, "book");
        }
    }
}
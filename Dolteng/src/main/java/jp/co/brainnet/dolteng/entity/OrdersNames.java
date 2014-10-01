package jp.co.brainnet.dolteng.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import jp.co.brainnet.dolteng.entity.CustomerNames._CustomerNames;
import jp.co.brainnet.dolteng.entity.Order_detailNames._Order_detailNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Orders}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/09/18 10:31:59")
public class OrdersNames {

    /**
     * order_noのプロパティ名を返します。
     * 
     * @return order_noのプロパティ名
     */
    public static PropertyName<Integer> order_no() {
        return new PropertyName<Integer>("order_no");
    }

    /**
     * order_dateのプロパティ名を返します。
     * 
     * @return order_dateのプロパティ名
     */
    public static PropertyName<Timestamp> order_date() {
        return new PropertyName<Timestamp>("order_date");
    }

    /**
     * user_idのプロパティ名を返します。
     * 
     * @return user_idのプロパティ名
     */
    public static PropertyName<String> user_id() {
        return new PropertyName<String>("user_id");
    }

    /**
     * zip_codeのプロパティ名を返します。
     * 
     * @return zip_codeのプロパティ名
     */
    public static PropertyName<String> zip_code() {
        return new PropertyName<String>("zip_code");
    }

    /**
     * prefectureのプロパティ名を返します。
     * 
     * @return prefectureのプロパティ名
     */
    public static PropertyName<String> prefecture() {
        return new PropertyName<String>("prefecture");
    }

    /**
     * addressのプロパティ名を返します。
     * 
     * @return addressのプロパティ名
     */
    public static PropertyName<String> address() {
        return new PropertyName<String>("address");
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
     * customerのプロパティ名を返します。
     * 
     * @return customerのプロパティ名
     */
    public static _CustomerNames customer() {
        return new _CustomerNames("customer");
    }

    /**
     * order_detailListのプロパティ名を返します。
     * 
     * @return order_detailListのプロパティ名
     */
    public static _Order_detailNames order_detailList() {
        return new _Order_detailNames("order_detailList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _OrdersNames extends PropertyName<Orders> {

        /**
         * インスタンスを構築します。
         */
        public _OrdersNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _OrdersNames(final String name) {
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
        public _OrdersNames(final PropertyName<?> parent, final String name) {
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
         * order_dateのプロパティ名を返します。
         *
         * @return order_dateのプロパティ名
         */
        public PropertyName<Timestamp> order_date() {
            return new PropertyName<Timestamp>(this, "order_date");
        }

        /**
         * user_idのプロパティ名を返します。
         *
         * @return user_idのプロパティ名
         */
        public PropertyName<String> user_id() {
            return new PropertyName<String>(this, "user_id");
        }

        /**
         * zip_codeのプロパティ名を返します。
         *
         * @return zip_codeのプロパティ名
         */
        public PropertyName<String> zip_code() {
            return new PropertyName<String>(this, "zip_code");
        }

        /**
         * prefectureのプロパティ名を返します。
         *
         * @return prefectureのプロパティ名
         */
        public PropertyName<String> prefecture() {
            return new PropertyName<String>(this, "prefecture");
        }

        /**
         * addressのプロパティ名を返します。
         *
         * @return addressのプロパティ名
         */
        public PropertyName<String> address() {
            return new PropertyName<String>(this, "address");
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
         * customerのプロパティ名を返します。
         * 
         * @return customerのプロパティ名
         */
        public _CustomerNames customer() {
            return new _CustomerNames(this, "customer");
        }

        /**
         * order_detailListのプロパティ名を返します。
         * 
         * @return order_detailListのプロパティ名
         */
        public _Order_detailNames order_detailList() {
            return new _Order_detailNames(this, "order_detailList");
        }
    }
}
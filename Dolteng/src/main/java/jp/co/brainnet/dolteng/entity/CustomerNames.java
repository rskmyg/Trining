package jp.co.brainnet.dolteng.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import jp.co.brainnet.dolteng.entity.OrdersNames._OrdersNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Customer}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/09/18 10:31:59")
public class CustomerNames {

    /**
     * user_idのプロパティ名を返します。
     * 
     * @return user_idのプロパティ名
     */
    public static PropertyName<String> user_id() {
        return new PropertyName<String>("user_id");
    }

    /**
     * passwordのプロパティ名を返します。
     * 
     * @return passwordのプロパティ名
     */
    public static PropertyName<String> password() {
        return new PropertyName<String>("password");
    }

    /**
     * user_nameのプロパティ名を返します。
     * 
     * @return user_nameのプロパティ名
     */
    public static PropertyName<String> user_name() {
        return new PropertyName<String>("user_name");
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
     * tel_noのプロパティ名を返します。
     * 
     * @return tel_noのプロパティ名
     */
    public static PropertyName<String> tel_no() {
        return new PropertyName<String>("tel_no");
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
     * ordersListのプロパティ名を返します。
     * 
     * @return ordersListのプロパティ名
     */
    public static _OrdersNames ordersList() {
        return new _OrdersNames("ordersList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _CustomerNames extends PropertyName<Customer> {

        /**
         * インスタンスを構築します。
         */
        public _CustomerNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _CustomerNames(final String name) {
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
        public _CustomerNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
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
         * passwordのプロパティ名を返します。
         *
         * @return passwordのプロパティ名
         */
        public PropertyName<String> password() {
            return new PropertyName<String>(this, "password");
        }

        /**
         * user_nameのプロパティ名を返します。
         *
         * @return user_nameのプロパティ名
         */
        public PropertyName<String> user_name() {
            return new PropertyName<String>(this, "user_name");
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
         * tel_noのプロパティ名を返します。
         *
         * @return tel_noのプロパティ名
         */
        public PropertyName<String> tel_no() {
            return new PropertyName<String>(this, "tel_no");
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
         * ordersListのプロパティ名を返します。
         * 
         * @return ordersListのプロパティ名
         */
        public _OrdersNames ordersList() {
            return new _OrdersNames(this, "ordersList");
        }
    }
}
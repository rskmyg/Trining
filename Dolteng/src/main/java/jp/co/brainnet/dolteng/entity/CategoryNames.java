package jp.co.brainnet.dolteng.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import jp.co.brainnet.dolteng.entity.Joint_tablesNames._Joint_tablesNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Category}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/09/18 10:31:59")
public class CategoryNames {

    /**
     * category_idのプロパティ名を返します。
     * 
     * @return category_idのプロパティ名
     */
    public static PropertyName<Integer> category_id() {
        return new PropertyName<Integer>("category_id");
    }

    /**
     * category_nameのプロパティ名を返します。
     * 
     * @return category_nameのプロパティ名
     */
    public static PropertyName<String> category_name() {
        return new PropertyName<String>("category_name");
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
     * joint_tablesListのプロパティ名を返します。
     * 
     * @return joint_tablesListのプロパティ名
     */
    public static _Joint_tablesNames joint_tablesList() {
        return new _Joint_tablesNames("joint_tablesList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _CategoryNames extends PropertyName<Category> {

        /**
         * インスタンスを構築します。
         */
        public _CategoryNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _CategoryNames(final String name) {
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
        public _CategoryNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * category_idのプロパティ名を返します。
         *
         * @return category_idのプロパティ名
         */
        public PropertyName<Integer> category_id() {
            return new PropertyName<Integer>(this, "category_id");
        }

        /**
         * category_nameのプロパティ名を返します。
         *
         * @return category_nameのプロパティ名
         */
        public PropertyName<String> category_name() {
            return new PropertyName<String>(this, "category_name");
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
         * joint_tablesListのプロパティ名を返します。
         * 
         * @return joint_tablesListのプロパティ名
         */
        public _Joint_tablesNames joint_tablesList() {
            return new _Joint_tablesNames(this, "joint_tablesList");
        }
    }
}
package jp.co.brainnet.dolteng.entity;

import java.sql.Timestamp;
import java.util.Date;
import javax.annotation.Generated;
import jp.co.brainnet.dolteng.entity.Joint_tablesNames._Joint_tablesNames;
import jp.co.brainnet.dolteng.entity.Order_detailNames._Order_detailNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Book}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/09/18 10:31:59")
public class BookNames {

    /**
     * isbnのプロパティ名を返します。
     * 
     * @return isbnのプロパティ名
     */
    public static PropertyName<String> isbn() {
        return new PropertyName<String>("isbn");
    }

    /**
     * book_nameのプロパティ名を返します。
     * 
     * @return book_nameのプロパティ名
     */
    public static PropertyName<String> book_name() {
        return new PropertyName<String>("book_name");
    }

    /**
     * author_nameのプロパティ名を返します。
     * 
     * @return author_nameのプロパティ名
     */
    public static PropertyName<String> author_name() {
        return new PropertyName<String>("author_name");
    }

    /**
     * publisher_nameのプロパティ名を返します。
     * 
     * @return publisher_nameのプロパティ名
     */
    public static PropertyName<String> publisher_name() {
        return new PropertyName<String>("publisher_name");
    }

    /**
     * priceのプロパティ名を返します。
     * 
     * @return priceのプロパティ名
     */
    public static PropertyName<Integer> price() {
        return new PropertyName<Integer>("price");
    }

    /**
     * release_dateのプロパティ名を返します。
     * 
     * @return release_dateのプロパティ名
     */
    public static PropertyName<Date> release_date() {
        return new PropertyName<Date>("release_date");
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
     * categoryListのプロパティ名を返します。
     * 
     * @return categoryListのプロパティ名
     */
    public static _Joint_tablesNames categoryList() {
        return new _Joint_tablesNames("categoryList");
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
    public static class _BookNames extends PropertyName<Book> {

        /**
         * インスタンスを構築します。
         */
        public _BookNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _BookNames(final String name) {
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
        public _BookNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
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
         * book_nameのプロパティ名を返します。
         *
         * @return book_nameのプロパティ名
         */
        public PropertyName<String> book_name() {
            return new PropertyName<String>(this, "book_name");
        }

        /**
         * author_nameのプロパティ名を返します。
         *
         * @return author_nameのプロパティ名
         */
        public PropertyName<String> author_name() {
            return new PropertyName<String>(this, "author_name");
        }

        /**
         * publisher_nameのプロパティ名を返します。
         *
         * @return publisher_nameのプロパティ名
         */
        public PropertyName<String> publisher_name() {
            return new PropertyName<String>(this, "publisher_name");
        }

        /**
         * priceのプロパティ名を返します。
         *
         * @return priceのプロパティ名
         */
        public PropertyName<Integer> price() {
            return new PropertyName<Integer>(this, "price");
        }

        /**
         * release_dateのプロパティ名を返します。
         *
         * @return release_dateのプロパティ名
         */
        public PropertyName<Date> release_date() {
            return new PropertyName<Date>(this, "release_date");
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
         * categoryListのプロパティ名を返します。
         * 
         * @return categoryListのプロパティ名
         */
        public _Joint_tablesNames categoryList() {
            return new _Joint_tablesNames(this, "categoryList");
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
package jp.co.brainnet.dolteng.entity;

import javax.annotation.Generated;
import jp.co.brainnet.dolteng.entity.BookNames._BookNames;
import jp.co.brainnet.dolteng.entity.CategoryNames._CategoryNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Joint_tables}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/09/18 10:31:59")
public class Joint_tablesNames {

    /**
     * isbnのプロパティ名を返します。
     * 
     * @return isbnのプロパティ名
     */
    public static PropertyName<String> isbn() {
        return new PropertyName<String>("isbn");
    }

    /**
     * category_idのプロパティ名を返します。
     * 
     * @return category_idのプロパティ名
     */
    public static PropertyName<Integer> category_id() {
        return new PropertyName<Integer>("category_id");
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
     * categoryのプロパティ名を返します。
     * 
     * @return categoryのプロパティ名
     */
    public static _CategoryNames category() {
        return new _CategoryNames("category");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _Joint_tablesNames extends PropertyName<Joint_tables> {

        /**
         * インスタンスを構築します。
         */
        public _Joint_tablesNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _Joint_tablesNames(final String name) {
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
        public _Joint_tablesNames(final PropertyName<?> parent, final String name) {
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
         * category_idのプロパティ名を返します。
         *
         * @return category_idのプロパティ名
         */
        public PropertyName<Integer> category_id() {
            return new PropertyName<Integer>(this, "category_id");
        }

        /**
         * bookのプロパティ名を返します。
         * 
         * @return bookのプロパティ名
         */
        public _BookNames book() {
            return new _BookNames(this, "book");
        }

        /**
         * categoryのプロパティ名を返します。
         * 
         * @return categoryのプロパティ名
         */
        public _CategoryNames category() {
            return new _CategoryNames(this, "category");
        }
    }
}
package jp.co.brainnet.dolteng.service;

import static jp.co.brainnet.dolteng.entity.BookNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.util.List;

import javax.annotation.Generated;

import jp.co.brainnet.dolteng.entity.Book;

import org.apache.commons.lang3.StringUtils;
import org.seasar.extension.jdbc.where.SimpleWhere;

/**
 * {@link Book}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/09/16 11:02:27")
public class BookService extends AbstractService<Book> {

	/**
	 * 識別子でエンティティを検索します。
	 *
	 * @param isbn
	 *            識別子
	 * @return エンティティ
	 */
	public Book findById(String isbn) {
//		if(isbn == null || isbn.equals("")){
		if(StringUtils.isBlank(isbn)){
			return null;
		}
		return select().id(isbn).getSingleResult();
/*    	Book book = new Book();
		book.isbn = "xxxxxxxxxxx";
		return book;*/
	}

	/**
	 * @param book_name
	 * @param author_name
	 * @return
	 */
	public List<Book> findByContains(String book_name, String author_name){
//		long count = select()
//				.where(
//						new SimpleWhere()
//						.excludesWhitespace().contains(book_name(), book_name)
//						.excludesWhitespace().contains(author_name(), author_name)
//				)
//				.getCount();

		return select()
				.where(
						new SimpleWhere()
						.excludesWhitespace().contains(book_name(), book_name)
						.excludesWhitespace().contains(author_name(), author_name))
				.getResultList();
	}

	public List<Book> findByBook_name(String book_name){
		return select().where(new SimpleWhere().eq(book_name(),book_name)).getResultList();
	}

	public List<Book> findByBook_name_like(String book_name){
		return select().where(new SimpleWhere().like(book_name(),book_name)).getResultList();
	}

	public List<Book> findByAuthor_name(String author_name){
		return select().where(new SimpleWhere().eq(author_name(),author_name)).getResultList();
	}

	public List<Book> findByAuthor_name_like(String author_name){
		return select().where(new SimpleWhere().like(author_name(),author_name)).getResultList();
	}

	public List<Book> findByPublisher_name(String book_name){
		return select().where(new SimpleWhere().eq(publisher_name(),book_name)).getResultList();
	}

	public List<Book> findByAddBookId(List<String> isbns){
		return select().where(new SimpleWhere().in(isbn(), isbns)).getResultList();
	}

//	pu8blic List<Book> findByCategory_name(String category_name) {
//		return select()
//				.innerJoin("categoryList")
//				.innerJoin("category", 	new SimpleWhere().eq("category.category_id", category_name))
////				.where(new SimpleWhere().eq("category_id", category_name)		)
//				.getResultList();
//	}

	/**
	 * 識別子の昇順ですべてのエンティティを検索します。
	 *
	 * @return エンティティのリスト
	 */
	public List<Book> findAllOrderById() {
		return select().orderBy(asc(isbn())).getResultList();
	}
}

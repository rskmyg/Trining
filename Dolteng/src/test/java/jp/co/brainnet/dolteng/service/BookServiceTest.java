package jp.co.brainnet.dolteng.service;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import jp.co.brainnet.dolteng.entity.Book;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.framework.unit.Seasar2;

/**
 * {@link BookService}のテストクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceTestModelFactoryImpl"}, date = "2014/09/16 13:08:31")
@RunWith(Seasar2.class)
public class BookServiceTest {//extends S2TestCase {

    private BookService bookService;
    private  JdbcManager jdbcManager;

    public void testAvailable() throws Exception {
        assertNotNull(bookService);
        assertNotNull(jdbcManager);
    }

//    @Test
    public void testFindById_1() {
		try {
			bookService.findById("");
		} catch (Exception e) {
			fail("例外処理をしてください。");
			e.printStackTrace();
		}
    }

//	String isbn = "ISBN978-4-87311-369-2";
//    @Before
//    public void before(){
////    	String isbn = "ISBN978-4-87311-369-2";
//    	Book in=new Book ();
//    	in.isbn=isbn;
//    	jdbcManager.insert(in).execute();
//    }

//    @After
//    public void after(){
//    	jdbcManager.delete(isbn).execute();
//    }


    /**
     * @param isbn ISBN
     */
    private void insertDumyBook(final String isbn) {
    	Book in = new Book();
    	in.isbn = isbn;
    	jdbcManager.insert(in).execute();
}

    @Test
	public final void testFindById_2() throws Exception{
    	String isbn = "xyz";
    	this.insertDumyBook(isbn);

    	Book book = bookService.findById(isbn);

    	// ISBNが一致しているか否か？
    	assertThat(book.isbn, is(isbn));
    }

	@Test
    public void testFindById_3() throws Exception{
    	String isbn = null;
		try {
			bookService.findById(isbn);
		} catch (Exception e) {
			fail("例外処理をしてください。");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
    }

    @Test
    public void testFindByBook_name_1() {
		try {
			bookService.findByBook_name("");
		} catch (Exception e) {
			fail("例外処理をしてください。");
			e.printStackTrace();
		}
    }

//  書籍名で検索できるか
    @Test
    public void testFindByBook_name_2() throws Exception{
    	String bookName = "xxxxxxxxxxx";
    	List<Book> books = bookService.findByBook_name(bookName);

    	int count = books.size(); // 件数

    	assertThat(count, is(1)); // 結果が1件であること

    	Book book = books.get(0); // 1件取得

    	assertThat(book.book_name, is(bookName)); // 書籍名が一致しているか？
    }

//  書籍名の一部で検索できるか
    @Test
    public void testFindByBook_name_like_1() throws Exception{
    	String bookName = "x";
    	List<Book> books = bookService.findByBook_name_like("%"+bookName+"%");

    	int count = books.size(); // 件数

    	assertThat(count, is(1)); // 結果が1件であること

    	Book book = books.get(0); // 1件取得

    	assertThat(book.book_name, containsString(bookName)); // 書籍名の一部を含んでいるか？
    }

//    著者名で検索できるか
    @Test
    public void testFindByAuthor_name_1() throws Exception{
    	String authorName = "xxxxxxxxxxx";
    	List<Book> books = bookService.findByAuthor_name(authorName);

    	int count = books.size(); // 件数

    	assertThat(count, is(1)); // 結果が1件であること

    	Book book = books.get(0); // 1件取得

    	assertThat(book.author_name, is(authorName)); // 著者名が一致しているか？
    }

//    著者名の一部で検索できるか
    @Test
    public void testFindByAuthor_name_like_1() throws Exception{
    	String authorName = "x";
    	List<Book> books = bookService.findByAuthor_name_like("%"+authorName+"%");

    	int count = books.size(); // 件数

    	assertThat(count, is(1)); // 結果が1件であること

    	Book book = books.get(0); // 1件取得

    	assertThat(book.author_name, containsString(authorName)); // 著者名の一部を含んでいるか？
    }

//    出版社名で検索できるか
    @Test
    public void testFindByPublisher_name() throws Exception{
    	String publisherName = "xxxxxxxxxxx";
    	List<Book> books = bookService.findByPublisher_name(publisherName);

    	int count = books.size(); // 件数

    	assertThat(count, is(1)); // 結果が1件であること

    	Book book = books.get(0); // 1件取得

    	assertThat(book.publisher_name, is(publisherName)); // 出版社名が一致しているか？
    }

    @Test
    public void testFindByAddBookId() throws Exception{

    	//テスト用ISBN
    	String[] testIsbns={"ISBN4-87311-279-8","ISBN978-4-7980-3745-7"};

//    	テスト対象のメソッドを呼ぶ
    	List<String> isbns = new ArrayList<String>();
    	for (int i = 0; i < testIsbns.length; i++) {
    		isbns.add(testIsbns[i]);
		}
    	List<Book> xxx=bookService.findByAddBookId(isbns);

    	// ISBNが一致しているか否か？
        	assertThat(xxx.get(0).isbn, is(testIsbns[0]));
        	assertThat(xxx.get(1).isbn, is(testIsbns[1]));
    }

//    カテゴリで検索できるか
//    @Test
//    public void testFindByCategory_name() throws Exception{
//    	String categoryName = "xyz";
//    	List<Book> books = bookService.findByCategory_name(categoryName);
//
//    	int count = books.size(); // 件数
//
//    	// 結果がn件であること
//    	int n = 3;// TODO 実際の件数を入れる
//    	assertThat(count, is(n));
//
//    	for (Book b: books) {
//    		List<Joint_tables> categoryList = b.categoryList;
//    		Joint_tables join = categoryList.get(0);
//    		String category_name = join.category.category_name;
//
//    		assertThat(category_name, is(categoryName));
//		}
////    	// 1件取得
////    	Book book = books.get(0);
////
////    	List<Joint_tables> categoryList = book.categoryList;
//
////    	// 著者名が一致しているか？
////    	assertThat(book.category_name, is(categoryName));
//    }
}

/*
 * MySQLに接続できるか
 * 書籍名で検索できるか
 * 書籍名の一部で検索できるか
 * 著者名で検索できるか
 * 著者名の一部で検索できるか
 * 出版社名で検索できるか
 * カテゴリで検索できるか
 *
 * 検索条件を満たさない場合エラーを返すか
 * 検索結果が正しいか(書籍名、著者名、出版社名、税抜価格が表示されるか？)
 *
 */
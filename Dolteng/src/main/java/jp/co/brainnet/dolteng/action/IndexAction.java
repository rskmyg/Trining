package jp.co.brainnet.dolteng.action;

import java.util.List;

import javax.annotation.Resource;

import jp.co.brainnet.dolteng.entity.Book;
import jp.co.brainnet.dolteng.form.IndexForm;
import jp.co.brainnet.dolteng.service.BookService;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class IndexAction {

	@ActionForm
	@Resource
	protected IndexForm indexForm;

	@Resource
	protected BookService bookService;

	public List<Book> xz; //AND検索用

    @Execute(validator = false)
	public String index() {
        return "index.jsp";
	}

    @Execute(validator = true, input = "index.jsp")
	public String serch() {
        	xz = bookService.findByContains(indexForm.book_name,indexForm.author_name);
        return index();
	}
}

//public String result_bn;
//public String result_bn_like;
//public String result_an;
//public String result_an_like;

//public List<Book> books; //書籍名完全一致用
//public List<Book> xxx; //とりあえず(書籍名部分一致用)
//public List<Book> yyy; //とりあえず(著者名完全一致用)
//public List<Book> zzz; //とりあえず(著者名部分一致用)

//    	//書籍名の完全一致検索
//    	result_bn = indexForm.book_name;
//    	books = bookService.findByBook_name(result_bn);

    	//書籍名の部分一致検索
//    	result_bn_like = indexForm.book_name;
//    	xxx = bookService.findByBook_name_like(result_bn_like);
//    	if(result_bn_like!=null&&!result_bn_like.equals(result_bn_like)){
//    	if (StringUtils.isNotBlank(result_bn_like)) {
//    	xxx = bookService.findByBook_name_like("%" + result_bn_like + "%");
//    	}

//    	//著者名の完全一致検索
//    	result_an = indexForm.author_name;
//    	yyy = bookService.findByAuthor_name(result_an);

    	//著者名の部分一致検索
//    	result_an_like = indexForm.author_name;
//    	if (StringUtils.isNotBlank(result_an_like)) {
//        	zzz = bookService.findByAuthor_name_like("%" + result_an_like + "%");
//    	}

    	//出版社名の検索(セカンダリなのでとりあえず今は無視する)
//    	result_pn = indexForm.publisher_name;

    	//カテゴリの検索(セカンダリなのでとりあえず今は無視する)
//    	result_cl = indexForm.categoryList;

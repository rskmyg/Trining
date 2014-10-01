package jp.co.brainnet.dolteng.form;

import org.seasar.struts.annotation.Arg;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Msg;
import org.seasar.struts.annotation.Validwhen;

public class IndexForm {

	@Maxlength(maxlength = 50)
	@Validwhen(test = "((author_name != null) or (*this* != null))", msg = @Msg(key = "errors.validwhen"),
	args = {@Arg(key = "labels.book_name",position=0), @Arg(key = "labels.author_name",position=1)})
	public String book_name;

	@Maxlength(maxlength = 30)
	public String author_name;

	@Maxlength(maxlength = 30)
	public String publisher_name;

	@Maxlength(maxlength = 30)
	public String categoryList;

}

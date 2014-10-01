package jp.co.brainnet.dolteng.action;

import javax.annotation.Resource;

import jp.co.brainnet.dolteng.form.AddForm;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

public class AddAction {

	@ActionForm
	@Resource
	protected AddForm addForm;

	public Integer result;

	@Execute(validator = false)
	public String index(){
		return "index.jsp";
	}

	@Execute(input = "index.jsp")
		public String submit(){
			result = Integer.valueOf(addForm.arg1)
					+ Integer.valueOf(addForm.arg2);
			return "index.jsp";
		}
}

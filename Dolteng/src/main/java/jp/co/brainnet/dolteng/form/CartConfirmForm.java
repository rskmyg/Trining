package jp.co.brainnet.dolteng.form;

import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Maxbytelength;
import org.seasar.struts.annotation.Msg;
import org.seasar.struts.annotation.Required;


public class CartConfirmForm {

	@Required
	@Mask(mask = "^[0-9]+$", msg = @Msg(key = "errors.bytenumber"))
	@Maxbytelength(maxbytelength = 7)
	public String zipCode;

	@Required
	public String prefecture;

	@Required
	public String address;

}

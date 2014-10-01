package jp.co.brainnet.dolteng.dto;

import java.io.Serializable;
import java.util.List;

import jp.co.brainnet.dolteng.entity.Book;

//@Component(instance = InstanceType.SESSION)
public class CartInfo implements Serializable {
	private static final long serialVersionUID = 1L;

//	public List<String> isbns;

	public List<Book> books;

	//税抜合計
	static int totalPrice;

	//支払合計
	static int allTotal;

	//送料
	public  int postage = 500;

	//消費税
	static double taxTotal;

	//税抜合計の計算
	public Integer getTotalPrice() {
		for(Book x : books){
			totalPrice += x.price;
		}
		return totalPrice;
	}

	//消費税の計算
	public Integer getTaxTotal(){
		taxTotal = totalPrice * 0.08;
		return (int)taxTotal;
	}

	//支払合計の計算
	public Integer getAllTotal() {
		return (int)(totalPrice + taxTotal + postage);
	}
}

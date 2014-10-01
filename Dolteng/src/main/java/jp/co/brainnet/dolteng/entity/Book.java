package jp.co.brainnet.dolteng.entity;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "book")
public class Book {

	@Id
	public String isbn;

	public String book_name;

	public String author_name;

	public String publisher_name;

	public Integer price;

	public Integer getPriceIntax() {
		return (int)(price * tax);
	}

	@Transient
	public double tax = 1.08;

	@Temporal(TemporalType.DATE)
	public Date release_date;

//	public Integer category_id;

	@OneToMany(mappedBy = "book")
	public List<Joint_tables> categoryList;

	public Timestamp modify_datetime;

	public Timestamp create_datetime;

	@OneToMany(mappedBy = "book")
	public List<Order_detail> order_detailList;
}

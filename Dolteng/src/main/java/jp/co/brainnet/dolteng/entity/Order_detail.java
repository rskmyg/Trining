package jp.co.brainnet.dolteng.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_detail")
public class Order_detail {

	@Id
	public Integer order_no;

	@Id
	public String isbn;

	public Integer quantity;

	public Timestamp modify_datetime;

	public Timestamp create_datetime;

	@ManyToOne
	@JoinColumn(name="order_no", referencedColumnName="order_no")
	public Orders orders;

	@ManyToOne
	@JoinColumn(name="isbn", referencedColumnName="isbn")
	public Book book;
}

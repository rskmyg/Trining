package jp.co.brainnet.dolteng.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer order_no;

	public Timestamp order_date;

	public String user_id;

	public String zip_code;

	public String prefecture;

	public String address;

	public Timestamp modify_datetime;

	public Timestamp create_datetime;

	@ManyToOne
	@JoinColumn(name="user_id", referencedColumnName="user_id")
	public Customer customer;

	@OneToMany(mappedBy = "orders")
	public List<Order_detail> order_detailList;
}

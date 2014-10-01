package jp.co.brainnet.dolteng.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	public String user_id;

	public String password;

	public String user_name;

	public String zip_code;

	public String prefecture;

	public String address;

	public String tel_no;

	public Timestamp modify_datetime;

	public Timestamp create_datetime;

	@OneToMany(mappedBy = "customer")
	public List<Orders> ordersList;
}

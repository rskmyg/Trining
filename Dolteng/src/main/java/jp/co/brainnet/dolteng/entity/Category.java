package jp.co.brainnet.dolteng.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {

	@Id
	public Integer category_id;

	public String category_name;

	public Timestamp modify_datetime;

	public Timestamp create_datetime;

	@OneToMany(mappedBy = "category")
	public List<Joint_tables> joint_tablesList;
}

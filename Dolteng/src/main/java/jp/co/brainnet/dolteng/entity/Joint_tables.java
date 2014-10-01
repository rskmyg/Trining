package jp.co.brainnet.dolteng.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "joint_tables")
public class Joint_tables {

	public String isbn;

	public Integer category_id;

	@ManyToOne
	@JoinColumn(name="isbn", referencedColumnName="isbn")
	public Book book;

	@ManyToOne
	@JoinColumn(name="category_id", referencedColumnName="category_id")
	public Category category;
}

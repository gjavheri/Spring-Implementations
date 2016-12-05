package org.gsssoft.springframework.HibernateImplementation.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="contactnumber")
public class ContactNumber {
	
	public ContactNumber(int id,String num) {
		// TODO Auto-generated constructor stub
		this.id=id;
		mob_num=num;
	}
	
	@Id
	private int id;
	
	@Column(name="number")
	private String mob_num;
	
	@ManyToOne
//	@JoinColumn(name="emp_id", referencedColumnName="id")
	private Employee emp;
	
	

}

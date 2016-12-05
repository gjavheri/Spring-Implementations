package org.gsssoft.springframework.HibernateImplementation.entities;

import java.util.Set;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;



@Entity
@Table(name="Employee")
public class Employee {
	
	public Employee(int id,String nm,String dsg,Set<ContactNumber> cnumbers){
		this.id=id;
		empname=nm;
		designation=dsg;
		cnum=cnumbers;
	}
	
	@Id
	@Column(name="id")
	private long id;
	
	@Column(name="name")
	private String empname;
	
	@Column(name="designation")
    private String designation;
	
	@OneToMany()//mappedBy="emp")
	@Cascade(CascadeType.SAVE_UPDATE)
	@JoinColumn(name="emp_id",referencedColumnName="id")
	private Set<ContactNumber> cnum;
	
		
	

}

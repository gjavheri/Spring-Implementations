package org.gsssoft.springrestful.pojos;

public class Student {
	
	private String name;
	private int id;
	
	public Student(){
		
	}
	
	public Student(int i, String nm){
		id=i;
		name=nm;
		
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}

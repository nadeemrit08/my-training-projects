package com.nadeem.entity;

import org.springframework.stereotype.Component;

@Component()
public class Employee {
	private Integer id;
	private String name;
	private String addreess;
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(Integer id) {
		
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getAddreess() {
		return addreess;
	}
	public void setAddreess(String addreess) {
		this.addreess = addreess;
	}
	public Employee(Integer id,  String addreess,String name) {
		super();
		this.id = id;
		this.name = name;
		this.addreess = addreess;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String string) {
		this.id=id;
		addreess=string;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addreess=" + addreess + "]";
	}
	
	
}

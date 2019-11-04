package com.souvik.DemoRestService.Model;

import java.util.List;

public class Student {
	 public int id;
	 public String name;
	 public List<Course> l;
	 
	public Student(int id, String name, List<Course> l) {
		super();
		this.id = id;
		this.name = name;
		this.l = l;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", l=" + l + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Course> getL() {
		return l;
	}
	public void setL(List<Course> l) {
		this.l = l;
	}
	 

}

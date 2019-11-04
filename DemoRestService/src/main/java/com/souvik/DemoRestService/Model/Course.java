package com.souvik.DemoRestService.Model;

import java.util.List;

public class Course {
	 public int id;
	 public String name;
	 public List<String> tools;
	 
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int id, String name, List<String> tools) {
		super();
		this.id = id;
		this.name = name;
		this.tools = tools;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getTools() {
		return tools;
	}
	public void setL(List<String> l) {
		this.tools = tools;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", l=" + tools + "]";
	}

}

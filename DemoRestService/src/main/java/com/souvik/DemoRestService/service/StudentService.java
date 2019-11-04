package com.souvik.DemoRestService.service;

import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;
import org.springframework.stereotype.Component;

import com.souvik.DemoRestService.Model.*;

@Component
public class StudentService {
	static List<Student> s=new ArrayList<Student>();
	static {
		Course c1=new Course(1,"java",Arrays.asList("spring","hibernate","maven"));
		Course c2=new Course(2,".NET",Arrays.asList("ADO","ListBox","TextBox"));
		Course c3=new Course(3,"AWS",Arrays.asList("EC2","CI/CD","Server"));
		
		List<Course> l1=new ArrayList<Course>();
		l1.add(c1);
		l1.add(c3);
		
		List<Course> l2=new ArrayList<Course>();
		l2.add(c1);
		l2.add(c2);
		
		Student s1=new Student(1,"souvik",l1);
		Student s2=new Student(2,"baban",l2);
		s.add(s1);
		s.add(s2);
		
}
	public List<Course> coursesOfStudent(int id)
	{
		List<Course> c=null;
		for(Student sc : s)
		{
			if(sc.id==id)
			{
				c=sc.l;
			}
		}
		if(c==null)
			return null;
		else
			return c;
		
	}
	public Course courseOfStudent(int sid,int cid)
	{
		Course c=null;
		for(Student sc : s)
		{
			if(sc.id==sid)
			{
				List<Course> l=sc.l;
				for(Course d:l)
				{
					if(d.id==cid)
					{
						c=d;
					}
					
				}
			}
		}
		if(c==null)
			return null;
		else
			return c;
	}
	public Course addCourseToStudent(int sid, Course c) {
		// TODO Auto-generated method stub
		for(Student sc : s)
		{
			if(sc.id==sid)
			{
				sc.l.add(c);
			}
		}
		return c;
		
	}
	public Course deleteCourseOfStudent(int sid,int cid)
	{
		Course cl=null;
		for(Student sc : s)
		{
			if(sc.id==sid)
			{
				List<Course> lc=sc.l;
				for(Course cc : lc)
				{
					if(cc.id==cid)
					{
						sc.l.remove(cc);
						cl= cc;
					}
				}
				
			}
		}
		return cl;
		
	}
	
}
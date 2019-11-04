package com.souvik.DemoRestService.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.souvik.DemoRestService.service.*;
import com.souvik.DemoRestService.Model.*;

@RestController
public class StudentController {
@Autowired
StudentService ss;

@GetMapping("/students/{sid}/courses")
public List<Course> showCourses(@PathVariable int sid){
	 return ss.coursesOfStudent(sid);
	
}
@GetMapping("/students/{sid}/courses/{cid}")
public Course showCourse(@PathVariable int sid,@PathVariable int cid){
	return ss.courseOfStudent(sid,cid);
	
}
@PostMapping("/students/{sid}")
public   ResponseEntity<Object> addCourseToStudent(@PathVariable int sid,@RequestBody Course c)

{
	Course c1=ss.addCourseToStudent(sid,c);
	//URI u=null;
	if(c1==null)
		return ResponseEntity.noContent().build();
	else {
		
		System.out.println("resouse created");
		return ResponseEntity.created(null).build();
	}
	
	   
}
@DeleteMapping("/students/{sid}/courses/{cid}")
public String deleteCourseofStudent(@PathVariable int sid,@PathVariable int cid)
{
	Course c=ss.deleteCourseOfStudent(sid, cid);
	if(c==null)
		return "resource not deleted";
	else
		return "resource deleted";
	
}

}


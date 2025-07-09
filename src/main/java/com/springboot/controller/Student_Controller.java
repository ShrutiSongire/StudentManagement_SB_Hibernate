package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Student;
import com.springboot.service.Student_Service;

@RestController
public class Student_Controller {

	@Autowired
	Student_Service service;

	@PostMapping("/Save")
	public String insetData(@RequestBody Student s) {
		String msg = service.insertData(s);
		return msg;
	}
	@DeleteMapping("/Delete/{stud_id}")
	public String deleteData(@PathVariable int stud_id) {
		String msg = service.deleteData(stud_id);
		return msg;
	}
	@PutMapping("/Update/{stud_id}")
	public String updateData(@RequestBody Student s,@PathVariable int stud_id) {
		return service.updateData(s, stud_id);
	}
	@GetMapping("/getSingleRecord/{stud_id}")
	public Student getSingleData(@PathVariable int stud_id) {
	Student s1=	service.getSingleData(stud_id);
	return s1;
	}
	@GetMapping("/getAllRecord")
	public List<Student> getAllRecord(){
	List<Student> list=	service.getAllRecord();
	return list;
	}


}

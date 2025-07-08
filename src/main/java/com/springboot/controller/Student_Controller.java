package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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


}

package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.Student_Dao;
import com.springboot.entity.Student;

@Service
public class Student_Service {
	
	@Autowired
	Student_Dao dao;
	
	public String insertData(Student s) {
		String msg=dao.insertData(s);
		
		return msg;
		
	}

	public String deleteData(int stud_id) {
		String msg=dao.deleteData(stud_id);
		return msg;
	}
}

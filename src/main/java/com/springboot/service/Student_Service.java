package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.Student_Dao;
import com.springboot.entity.Student;

@Service
public class Student_Service {

	@Autowired
	Student_Dao dao;

	public String insertData(Student s) {
		String msg = dao.insertData(s);

		return msg;

	}

	public String deleteData(int stud_id) {
		String msg = dao.deleteData(stud_id);
		return msg;
	}

	public String updateData(Student s, int stud_id) {

		String msg = dao.updateData(s, stud_id);

		return msg;
	}
	public Student getSingleData(int stud_id) {
		Student s1=dao.getSingleRecord(stud_id);
		return s1;
	}
	public List<Student> getAllRecord(){
	List<Student> list=	dao.GetAllData();
	return list;
	}
}

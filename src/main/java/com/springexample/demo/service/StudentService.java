package com.springexample.demo.service;

import java.util.List;
import com.springexample.demo.pojo.Student;

public interface StudentService {

	List<Student> getStudents();

	Student getStudentById(int studentId);

	void saveStudentDetails(Student student);

	void updateStudentDetails(Student student, int studentId);

	void removeStudent(int studentId);
}

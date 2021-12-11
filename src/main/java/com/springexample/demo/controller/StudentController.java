package com.springexample.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springexample.demo.exceptions.RequestViolationException;
import com.springexample.demo.pojo.Student;
import com.springexample.demo.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/")
	public List<Student> getStudents() {
		return studentService.getStudents();
	}

	@GetMapping("/{student_id}")
	public Student getStudentById(@PathVariable String student_id) {
		return studentService.getStudentById(parseQueryParamToInteger(student_id));
	}

	@PostMapping("/")
	void saveStudent(@RequestBody Student student) {
		studentService.saveStudentDetails(student);
	}

	@PutMapping("/{student_id}")
	void updateStudent(@RequestBody Student student, @PathVariable String student_id) {
		studentService.updateStudentDetails(student, parseQueryParamToInteger(student_id));
	}

	@DeleteMapping("/{student_id}")
	void removeStudent(@PathVariable String student_id) {
		studentService.removeStudent(parseQueryParamToInteger(student_id));
	}

	int parseQueryParamToInteger(String studentId) {
		try {
			return Integer.parseInt(studentId);
		} catch (Exception exception) {
			throw new RequestViolationException("Invalid student id provided in path variable");
		}
	}
}

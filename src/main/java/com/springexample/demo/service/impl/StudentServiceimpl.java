package com.springexample.demo.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.springexample.demo.dao.StudentDao;
import com.springexample.demo.exceptions.RequestFailedException;
import com.springexample.demo.exceptions.ResourceNotFoundException;
import com.springexample.demo.pojo.Student;
import com.springexample.demo.service.StudentService;

@Service
public class StudentServiceimpl implements StudentService {

	@Autowired
	StudentDao studentDao;

	@Override
	public List<Student> getStudents() {
		return studentDao.findAll();
	}

	@Override
	public Student getStudentById(int studentId) {
		return getStudentDetailsById(studentId);
	}

	@Override
	public void saveStudentDetails(Student student) {
		try {
			studentDao.save(student);
		} catch (Exception exception) {
			throw new RequestFailedException("There are some internal erros that could not proceed request");
		}
	}

	@Override
	public void updateStudentDetails(Student studentUpdateRequest, int studentId) {
		Student existingStudent = getStudentDetailsById(studentId);
		if (studentUpdateRequest.getName() != null && !studentUpdateRequest.getName().trim().isEmpty()) {
			existingStudent.setName((studentUpdateRequest.getName()));
		}
		if (studentUpdateRequest.getLocation() != null && !studentUpdateRequest.getLocation().trim().isEmpty()) {
			existingStudent.setLocation(studentUpdateRequest.getLocation());
		}
		studentDao.save(existingStudent);
	}

	@Override
	public void removeStudent(int studentId) {
		try {
			studentDao.deleteById((studentId));
		} catch (EmptyResultDataAccessException emptyResultDataAccessException) {
			throw new ResourceNotFoundException(emptyResultDataAccessException.getMessage());
		}
	}

	Student getStudentDetailsById(int studentId) {
		Optional<Student> student = studentDao.findById(studentId);
		if (!student.isPresent()) {
			throw new ResourceNotFoundException("Student is not available with given id:: " + studentId);
		}
		return new Student(student.get().getId(), student.get().getName(), student.get().getLocation());
	}
}

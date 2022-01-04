package com.springexample.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springexample.demo.pojo.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {
}

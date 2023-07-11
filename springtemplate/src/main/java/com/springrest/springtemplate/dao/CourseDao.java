package com.springrest.springtemplate.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springtemplate.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}

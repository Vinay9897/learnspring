package com.springrest.springtemplate.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springrest.springtemplate.dao.CourseDao;

//import java.util.ArrayList;

import com.springrest.springtemplate.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@ Autowired
	private CourseDao courseDao;
//	List<Course> list;

	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(1, "Spring Boot 2.0", "This is a full Course of Spring boot 2.0"));
//		list.add(new Course(2, "Spring Boot 3.0", "This is a full Course of Spring boot 3.0"));
	}

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
//		Course c = null;
//		for (Course c1 : list) {
//			if (c1.getId() == courseId) {
//				c = c1;
//				break;
//			}
//		}
		return courseDao.findById(courseId).get();
	}

	@Override
	public Course addCourse(Course course) {

//		list.add(course);
		courseDao.save(course);
		return course;

	}

	@Override
	public Course updateCourse(Course course) {
//		list.forEach((cour) -> {
//			if (cour.getId() == course.getId()) {
//				cour.setTitle(course.getTitle());
//				cour.setDescription(course.getDescription());
//			}
//		});
		
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
//		list = this.list.stream().filter((cour) -> cour.getId() != parseLong).collect(Collectors.toList());
	Course del = courseDao.findById(parseLong).get();
	courseDao.delete(del);
	}
}

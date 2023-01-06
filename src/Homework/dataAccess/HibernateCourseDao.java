package Homework.dataAccess;

import java.util.List;

import Homework.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course,List<Course> courses) {
		System.out.println("Hibernate ile Course Sınıfına Eklendi");
		
	}

}

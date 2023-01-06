package Homework.dataAccess;

import java.util.List;

import Homework.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course,List<Course> courses) {
		System.out.println("JDBC ile Course Sınıfına Eklendi");
		
	}

}

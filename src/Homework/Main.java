package Homework;

import java.util.ArrayList;
import java.util.List;

import Homework.business.CategoryManager;
import Homework.business.CourseManager;
import Homework.business.InstructorManager;
import Homework.core.DatabaseLogger;
import Homework.core.FileLogger;
import Homework.core.Logger;
import Homework.core.MailLogger;
import Homework.dataAccess.HibernateCategoryDao;
import Homework.dataAccess.HibernateInstructorDao;
import Homework.dataAccess.JdbcCourseDao;
import Homework.entities.Category;
import Homework.entities.Course;
import Homework.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Category category1=new Category(1,"Programa Dilleri");
		Category category2=new Category(2,"Databaseler");
		
		
		Course course1=new Course(1,"Java",1000);
		Course course2=new Course(2,"C++",-1);
	
			
		
		Instructor instructor1=new Instructor(1,"Engin DEMİROĞ","Java");
		
		List<Course> courses=new ArrayList<>();
		List<Category> categories=new ArrayList<>();
		
		
		List<Logger> loggers1=new ArrayList<>();
		loggers1.add(new FileLogger());
		
		List<Logger> loggers2=new ArrayList<>();
		loggers2.add(new DatabaseLogger());
		
		List<Logger> loggers3=new ArrayList<>();
		loggers3.add(new FileLogger());
		loggers3.add(new MailLogger());
		
		CategoryManager categoryManager1=new CategoryManager(new HibernateCategoryDao(),loggers1 );
		categoryManager1.add(category1,categories);
		CategoryManager categoryManager2=new CategoryManager(new HibernateCategoryDao(),loggers2 );
		categoryManager2.add(category2,categories);
		
		CourseManager courseManager1=new CourseManager(new JdbcCourseDao(),loggers2);
		courseManager1.add(course1,courses);
		CourseManager courseManager2=new CourseManager(new JdbcCourseDao(),loggers3);		
		courseManager2.add(course2,courses);
	
		InstructorManager instructorManager=new InstructorManager(new HibernateInstructorDao(), loggers3);
		instructorManager.add(instructor1);

	}

}

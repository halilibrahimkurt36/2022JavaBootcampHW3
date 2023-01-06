package Homework.business;


import java.util.List;

import Homework.core.Logger;
import Homework.dataAccess.CourseDao;
import Homework.entities.Course;

public class CourseManager {
 private CourseDao courseDao;
 private List<Logger> loggers;



public CourseManager(CourseDao courseDao,List<Logger> loggers) {
	
	this.courseDao = courseDao;
	this.loggers=loggers;

}
 
public void add(Course course,List<Course> courses) throws Exception {
	
	for (int i=0;i<courses.size();i++) {
		
	if(course.getPrice()<0) {
		throw new Exception(course.getSectionName() + " isimli kursun fiyatı 0'dan küçük olamaz!!!");
	}
	if(course.getSectionName().equals(courses.get(i).getSectionName())) {
		throw new Exception(course.getSectionName() +"=>"+ " Bu isimde Kurs Daha Önce Eklenmiştir!!!");
		
	}
	
	}
	courseDao.add(course,courses);
	courses.add(course);
	
	System.out.println(course.getSectionName() + " Kurs Başarılı Bir Şekilde Eklenmiştir.");
	for (Logger logger : loggers) {
		logger.log(course.getSectionName());
		System.out.println("--------------------------------");
	
}
}
}

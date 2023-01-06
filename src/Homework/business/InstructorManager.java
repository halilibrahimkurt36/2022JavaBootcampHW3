package Homework.business;

import java.util.List;

import Homework.core.Logger;
import Homework.dataAccess.InstructorDao;
import Homework.entities.Instructor;

public class InstructorManager {
private InstructorDao instructorDao;
private List<Logger> loggers;

public InstructorManager(InstructorDao instructorDao,List<Logger> loggers) {
	
	this.instructorDao = instructorDao;
	this.loggers=loggers;
}

public void add(Instructor instructor) {
	instructorDao.add(instructor);
	System.out.println(instructor.getName() + " Eğitmen Başarılı Bir Şekilde Eklenmiştir");
	for (Logger logger : loggers) {
		logger.log(instructor.getName());
		System.out.println("--------------------------------");
	}
	
}
}

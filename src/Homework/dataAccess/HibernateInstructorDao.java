package Homework.dataAccess;

import Homework.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile Instructor Sınıfına Eklendi");
		
	}

}

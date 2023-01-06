package Homework.dataAccess;

import Homework.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC ile Instructor Sınıfına Eklendi");
		
	}

}

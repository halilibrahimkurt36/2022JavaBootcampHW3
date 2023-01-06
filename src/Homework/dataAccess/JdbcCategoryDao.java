package Homework.dataAccess;

import java.util.List;

import Homework.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category,List<Category> categories) {
		System.out.println("JDBC ile Category Sınıfına Eklendi");
		
	}

}

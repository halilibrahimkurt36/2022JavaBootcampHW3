package Homework.dataAccess;

import java.util.List;

import Homework.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category,List<Category> categories) {
		System.out.println("Hibernate ile Category Sınıfına Eklendi");
		
	}

}

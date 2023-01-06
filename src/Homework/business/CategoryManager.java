package Homework.business;


import java.util.List;

import Homework.core.Logger;
import Homework.dataAccess.CategoryDao;
import Homework.entities.Category;

public class CategoryManager {
 private CategoryDao categoryDao;
 private List<Logger> loggers;


public CategoryManager(CategoryDao categoryDao,List<Logger> loggers) {
	
	this.categoryDao = categoryDao;
	this.loggers=loggers;
}

public void add(Category category,List<Category> categories) throws Exception {
	
	for (int i=0;i<categories.size();i++) {
	
	
	if(category.getCategoryName().equals(categories.get(i).getCategoryName())) {
		
		throw new Exception(category.getCategoryName() + " Bu isimde Kategori Daha Önce Eklenmiştir");
	}
	}
	categoryDao.add(category,categories);

	categories.add(category);
	
	System.out.println(category.getCategoryName() + " Kategori Başarılı Bir Şekilde Eklenmiştir.");
	for (Logger logger : loggers) {
		logger.log(category.getCategoryName());
		System.out.println("--------------------------------");
	}
	}
}


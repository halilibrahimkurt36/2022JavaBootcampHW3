package Homework.entities;

public class Course {
private int id;
private String sectionName;
private int price;


public Course() {
	
}


public Course(int id, String sectionName,int price) {
	super();
	this.id = id;
	this.sectionName = sectionName;
	this.price=price;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getSectionName() {
	return sectionName;
}


public void setSectionName(String sectionName) {
	this.sectionName = sectionName;
}


public int getPrice() {
	return price;
}


public void setPrice(int price) {
	this.price = price;
}
}

package com.floormap.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Department")
public class Department {
	@Id
	private long id;
	private String name;
	private String color;
	private String description;
	public static String DEPARTMENT_SEQUENCE = "department_sequence";
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", color=" + color + ", description=" + description + "]";
	}
	
}

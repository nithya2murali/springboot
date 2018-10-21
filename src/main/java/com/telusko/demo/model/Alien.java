package com.telusko.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {
	@Id
	private int id;
	private String name;
	private String description;
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
}

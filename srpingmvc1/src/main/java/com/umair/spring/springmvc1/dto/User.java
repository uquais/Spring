package com.umair.spring.springmvc1.dto;

public class User {
	
	private int id;
	private String Name;
	private String Email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", Name=" + Name + ", email=" + Email + "]";
	}
}

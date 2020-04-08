package com.umair.spring.springcore.lc;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("This is setter");
		this.id = id;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	public void hi() {
		System.out.println("This is hi");
	}
	
	public void bye() {
		System.out.println("This is bye");
	}
	
	

}

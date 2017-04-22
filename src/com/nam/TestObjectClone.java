package com.nam;

public class TestObjectClone implements Cloneable{
	
	String name;
	
	int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TestObjectClone(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
	
	public TestObjectClone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		TestObjectClone test = new TestObjectClone("nam", 1);
		TestObjectClone test1 = (TestObjectClone) test.clone();
		System.out.println(test.id);
		System.out.println(test1.getId());
	}

}

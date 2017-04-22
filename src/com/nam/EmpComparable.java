package com.nam;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EmpComparable implements Comparable<EmpComparable>{
	
	private int id;
	
	private String name;

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

	public EmpComparable(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public EmpComparable() {
		super();
		
	}
	
	

	@Override
	public String toString() {
		return "EmpComparable [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(EmpComparable emp) {
		// TODO Auto-generated method stub
		return (this.name.compareTo(emp.name));
	}
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		EmpComparable[] emprr = new EmpComparable[4];
		emprr[0] = new EmpComparable(1, "namratha");
		emprr[1] = new EmpComparable(3, "vinamratha");
		emprr[2] = new EmpComparable(2, "priyanka");
		emprr[3] = new EmpComparable(4, "ranjitha");
		Arrays.sort(emprr);
		System.out.println(Arrays.toString(emprr));
		
	}
	

}

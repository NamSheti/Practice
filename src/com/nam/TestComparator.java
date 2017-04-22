package com.nam;

import java.util.Arrays;
import java.util.Comparator;

//import com.home.EmployeeComparator;

public class TestComparator implements Comparator<TestComparator> {
	
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



	public TestComparator(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	@Override
	public String toString() {
		return "TestComparator [id=" + id + ", name=" + name + "]";
	}



	/*public TestComparator() {
		super();
		// TODO Auto-generated constructor stub
	}

*/
	
	

	public static Comparator<TestComparator> idcompare = new Comparator<TestComparator>() {
		
		@Override
		public int compare(TestComparator o1, TestComparator o2) {
			System.out.println("the id iss=="+o1.getId());
			return (o1.getId() - o2.getId());
		}
	};
	
	public static Comparator<TestComparator> namecompare = new Comparator<TestComparator>() {

		@Override
		public int compare(TestComparator o1, TestComparator o2) {
			return (o1.getName().compareTo(o2.name));
		}
	};
	
	
	public static void main(String[] args) {
		TestComparator[] emparr = new TestComparator[4];
		emparr[0] = new TestComparator(1, "nam");
		emparr[1] = new TestComparator(4, "akh");
		emparr[2] = new TestComparator(2, "prema");
		emparr[3] = new TestComparator(3, "vina");
		Arrays.sort(emparr, TestComparator.idcompare);
		System.out.println("id sorting=="+Arrays.toString(emparr));
		Arrays.sort(emparr, TestComparator.namecompare);
		System.out.println("id sorting=="+Arrays.toString(emparr));
	}



	@Override
	public int compare(TestComparator o1, TestComparator o2) {
		System.out.println("Inside Id Comparator");
		return(o1.getId() - o2.getId());
	}

}

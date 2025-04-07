package EmployeeApp;

public class Employee {
	private int id;
	private String name;
	private long sal;
	
	void setDetails(String n ,int i , long s) {
		name=n;
		id=i;
		sal=s;
	}
	
	void showDetails() {
		System.out.println(name+"\t"+id+"\t"+sal);
	}
}

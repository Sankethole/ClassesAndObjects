package Encapsulation;
class Employee{
	private int id;
	private String name;
	private int sal;
	
	void setDetail(String n ,int i ,int s) {
		name=n;
		id=i;
		sal=s;
	}
	
	void showDetail(String type) {
		if(type.equals("manager")) {
			System.out.println(id+"\t"+name+"\t"+sal);
		}
		else {
			System.out.println(id+"\t"+name);		}
	}
}

public class EmployeeApplication {
	public static void main(String x[]) {
		
		Employee emp = new Employee();
		emp.setDetail("Sanket", 1, 15000);
		emp.showDetail("manager");
	}

}

package ClassandObject;
import java.util.*;

class Employee{
	private int id;
	private String name;
	private int sal;
	int incsal;
	
	void setDetails(String n ,int i , int s) {
		name=n;
		id=i;
		sal=s;
	}
	 void setPrograss(int pval) {
		  if(pval>60) {
			  incsal=(sal*30/100);
		  }
	 }
	 void show() {
		 int total=sal+incsal;
		 System.out.println("NAme is : "+name);
		 System.out.println("Id is : "+id);
		 System.out.println("Salary is : "+sal);
		 System.out.println("Incremental Salary : "+incsal);
		 System.out.println("Total salary : "+total);
	 }
}

public class EmployeeApplication1 {
	public static void main(String x[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name id and salary");
		String name=sc.nextLine();
		int id =sc.nextInt();
		int sal=sc.nextInt();
		Employee emp=new Employee();
		emp.setDetails(name,id,sal);
		System.out.println("Enter the Progress ");
		int pval=sc.nextInt();
		emp.setPrograss(pval);
		
		emp.show();
	}

}

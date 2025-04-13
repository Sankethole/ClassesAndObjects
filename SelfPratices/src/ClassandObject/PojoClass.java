package ClassandObject;
class Employees{
	private int id;
	private String name;
	private int sal;
	
	public void setId(int i) {
		id=i;
	}
	public int getId() {
		return id;
	}
	public void setName(String n) {
		name=n;
	}
	public String getName() {
		return name;
	}
	public void setSal(int s) {
		sal=s;
	}
	public int getSal() {
		return sal;
	}
}

public class PojoClass {
	public static void main(String x[]) {
		Employees emp =new Employees();
		emp.setId(1);
		emp.setName("Sanket");
		emp.setSal(15000);
		
		
		System.out.println("id\t :"+emp.getId());
		System.out.println("Name\t :"+emp.getName());
		System.out.println("Salary\t :"+emp.getSal());
	}
}

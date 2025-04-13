package ClassandObject;

public class AddimissionApplication {
	public static void main(String x[]) {
		 
		Addmission ad=new Addmission();
		
		Student s=new Student();
		s.setId(1);
		s.setName("Sanket");
		s.setAddress("Pune");
		s.setDgree("Bca");
		
		ad.addNewStudent(s);
		ad.show();
	}

}

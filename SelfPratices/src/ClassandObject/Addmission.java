package ClassandObject;

public class Addmission {
	Student stud;
	
	void addNewStudent(Student student){
		stud=student;
	}
	
		void show() {
			System.out.println("Id\t : "+stud.getId()+"\nName\t : "+stud.getName()+"\nAddress\t : "+stud.getAddress()+"\nDgree\t : "+stud.getDgree());
		}

}

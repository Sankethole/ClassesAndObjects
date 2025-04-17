package ProgramPractices;
import java.util.*;
class InsertArrayEle{
	char ch[];
	
	void setCharArray(char c[]) {
		ch=c;
	}
	void InsertValueOnIndex(int index , char c) {
		
		System.out.println("Before Inserting Character");
		for(int i=0 ; i<ch.length ;i++) {
			System.out.println("Insert Char : "+i+"\s"+ch[i]);
		}
		
		
		for(int i=(ch.length-2); i>=index ;i--) {
			ch[i+1]=ch[i];
		}
		ch[index]=c;
		System.out.println("After Inserting Character");
		for(int i=0 ; i<ch.length ;i++) {
			System.out.println("Insert Char : "+i+"\s"+ch[i]);
	}
  }
}

public class InsertArrayEleApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		InsertArrayEle iae=new InsertArrayEle();
		                                                                                                                    
		char ch[]=new char[6];
		System.out.println("Enter the Array Input");
		for(int i=0 ;i<(ch.length-1) ;i++) {
			
			ch[i]=sc.nextLine().charAt(0);
		}
		iae.setCharArray(ch);
		System.out.println("Enter the vlaue and Index");
		char value=sc.nextLine().charAt(0);
		int index=sc.nextInt();
		sc.nextLine();
		
		
		iae.InsertValueOnIndex(index,value);

	}

}

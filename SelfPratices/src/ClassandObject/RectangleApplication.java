package ClassandObject;

import java.util.Scanner;
import java.util.*;
class Rectangle{
	int length ,width;
	
	void setRectangle(int y,int z) {
		length=y;
		width=z;
	}
	void showRectangle() {
		int area=length*width;
		System.out.println("Area of Rectangle = "+area);
		
	}
}

public class RectangleApplication {
	public static void main(String x[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and width");
		int length=sc.nextInt();
		int width=sc.nextInt();
		Rectangle r=new Rectangle();
		r.setRectangle(length,width);
		r.showRectangle();
	}

}

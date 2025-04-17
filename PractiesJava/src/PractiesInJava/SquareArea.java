package PractiesInJava;

import java.util.*;

public class SquareArea {
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Square side");
		int side = sc.nextInt();
		int area = side * side;
		System.out.println("Square area is " + area);
	}

}

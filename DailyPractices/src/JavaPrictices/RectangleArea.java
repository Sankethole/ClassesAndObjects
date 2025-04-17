package JavaPrictices;

import java.util.Scanner;

public class RectangleArea {
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breadth");
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		int area = length * breadth;
		System.out.println("Rectangle Area : " + area);
	}

}

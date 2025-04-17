package PractiesInJava;

import java.util.*;

public class CricleDaimeterCircumferenceArea {
	public static void main(String x[]) {
		float power = 3.14f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Redius");
		float redius = sc.nextInt();

		float daimeter = 2 * redius;
		System.out.println("Cricle Redius : " + daimeter);
		float circumference = 2 * power * redius;
		System.out.println("Cricle Circumference : " + circumference);
		float area = power * redius * redius;
		System.out.println("Cricel Area : " + area);
	}

}

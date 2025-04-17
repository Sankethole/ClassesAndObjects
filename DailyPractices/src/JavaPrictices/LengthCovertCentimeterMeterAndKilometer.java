package JavaPrictices;

import java.util.Scanner;

public class LengthCovertCentimeterMeterAndKilometer {
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length");
		float length = sc.nextInt();

		float centimeter = length / 10;
		System.out.println("Centimeter : " + centimeter);

		float meter = length / 100;
		System.out.println("Meter : " + meter);

		float kilometer = length / 100000;
		System.out.println("Kilometer : " + kilometer);

	}

}

package JavaPrictices;

import java.util.Scanner;

public class FahrenheitConvertCelsius {
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fehrenheit");
		float fahrenheit = sc.nextInt();

		float celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Celsius : " + celsius);
	}

}

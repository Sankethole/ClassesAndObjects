package ClassandObject;

import java.util.*;

class Cricle {
	float radius, pi = 3.14f, area;

	void setRedius(float r) {
		radius = r;
	}

	void showCricle() {
		area = radius * radius * pi;
		System.out.println("Cricle area is : " + area);
	}
}

public class CricleApplication {
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the redius");
		float radi = sc.nextFloat();
		Cricle c = new Cricle();
		c.setRedius(radi);
		c.showCricle();
	}

}

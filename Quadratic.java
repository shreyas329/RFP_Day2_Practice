package operator_programs;

import java.util.*;

public class Quadratic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eter the value of a: ");
		double a = sc.nextDouble();
		System.out.println("Enter the value of b: ");
		double b = sc.nextDouble();
		System.out.println("Enter the value of c: ");
		double c = sc.nextDouble();

		double delta = ((b * b) - (4 * a * c));
		if (delta > 0.0) {
			double r1 = (-b + Math.sqrt(delta)) / (2 * a);
			double r2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("The roots are " + r1 + " and " + r2);
		} else if (delta == 0.0) {
			double r1 = -b / (2.0 * a);
			System.out.println("The root is " + r1);
		} else {
			System.out.println("Roots are not real.");
		}

	}

}

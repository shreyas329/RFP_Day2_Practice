package operator_programs;

import java.util.*;

public class Distance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x value: ");
		double x = sc.nextDouble();
		System.out.println("Enter y value: ");
		double y = sc.nextDouble();
		
		double distance = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		System.out.println("The distance is: "+distance);
	}

}

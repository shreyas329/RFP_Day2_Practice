package day2;

import java.util.Scanner;

public class DisplayUnit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		if(num>=0 && num<=9)
		{
			System.out.println("Single digit");
		}
		else if(num>=10 && num<=99)
		{
			System.out.println("Tens");
		}
		else if(num>=100 && num<=999)
		{
			System.out.println("Hundreds");
		}
		else if(num>=1000 && num<=9999)
		{
			System.out.println("Thousands");
		}
	}

}

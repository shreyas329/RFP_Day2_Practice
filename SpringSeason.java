package operator_programs;

import java.util.*;

public class SpringSeason {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date: ");
		int date = sc.nextInt();
		System.out.println("Enter month [e.g January- 1]: ");
		int month = sc.nextInt();
		if(date>=20 && date<=31 && month == 3)
		{
			System.out.println("True");
		}
		else if(date>=1 && date<=31 && month>3 && month<6)
		{
			System.out.println("True");
		}
		else if(date>=1 && date<=20 && month == 6)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

	}

}

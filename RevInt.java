package forloop;

import java.util.Scanner;

public class RevInt {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int reverse = 0;
		for(;num != 0; num=num/10)
		{
			int rem = num % 10;
			reverse = reverse * 10 + rem;
		}
		System.out.println("The reverse of the number is: "+reverse);
	}

}

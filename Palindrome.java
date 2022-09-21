package forloop;

import java.util.Scanner;

public class Palindrome {

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
		if(num == reverse)
		{
			System.out.println("The given number is a palindrome..");
		}
		else
		{
			System.out.println("The given number is not a palindrome..");
		}

	}

}

package operator_programs;
import java.util.*;


public class ArithOperations {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value: ");
		int a = sc.nextInt();
		System.out.println("Enter b value: ");
		int b = sc.nextInt();
		System.out.println("Enter c value: ");
		int c = sc.nextInt();
		
		int op1 = a+(b*c);
		int op2 = c+(a/b);
		int op3 = (a%b)+c;
		int op4 = (a*b)+c;
		
		System.out.println("Answer to 1st operation [ a+b*c ]: "+op1);
		System.out.println("Answer to 2nd operation [ c+a/b ]: "+op2);
		System.out.println("Answer to 3rd operation [ a%b+c ]: "+op3);
		System.out.println("Answer to 4th operation [ a*b+c ]: "+op4);
		
		//To find greatest value
		if(op1>op2 && op1>op3 && op1>op4)
		{
			System.out.println("\nThe greatest value is : "+op1);
		}
		else if(op2>op3 && op2>op4 && op2>op1)
		{
			System.out.println("\nThe greatest value is : "+op2);
		}
		else if(op3>op4 && op3>op1 && op3>op2)
		{
			System.out.println("\nThe greatest value is : "+op3);
		}
		else
		{
			System.out.println("\nThe greatest value is : "+op4);
		}
		
		
		//To find smallest value
		if(op1<op2 && op1<op3 && op1<op4)
		{
			System.out.println("\nThe smallest value is : "+op1);
		}
		else if(op2<op3 && op2<op4 && op2<op1)
		{
			System.out.println("\nThe smallest value is : "+op2);
		}
		else if(op3<op4 && op3<op1 && op3<op2)
		{
			System.out.println("\nThe smallest value is : "+op3);
		}
		else
		{
			System.out.println("\nThe smallest value is : "+op4);
		}

	}

}

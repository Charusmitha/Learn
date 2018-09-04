package Addition;

import java.util.Scanner;

public class addition {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1,num2,total;
		System.out.print("Enter number1 = ");
		num1=sc.nextInt();
		System.out.print("Enter number2 = ");
		num2=sc.nextInt();
		total=num1+num2;
		System.out.println("Sum of number1 and number2 is = " +total);
	}

}

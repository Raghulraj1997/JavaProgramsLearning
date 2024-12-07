package javaLearning;

import java.util.Scanner;

public class SwitchstatmentCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first vale: ");
		int a=sc.nextInt();
		System.out.println("Enter the second vale: ");
		int b=sc.nextInt();
		System.out.print("Enter only one char: -,+,*,/,%");
		char operator=sc.next().charAt(0);
		int c;
		switch(operator)
		{
		case '+':
			c=a+b;
			System.out.println("The addition of value is: "+c);
			break;
		case '-':
			c=a-b;
			System.out.println("The subsration of value is: "+c);
			break;
		case '*':
			c=a*b;
			System.out.println("The multiplication of value is: "+c);
			break;
		case '%':
			c=a%b;
			System.out.println("The division of value is: "+c);
			break;
		default:
			System.out.println("Invalid value provide");
		
		}
		
		

	}

}

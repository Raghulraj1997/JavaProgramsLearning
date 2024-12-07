package javaLearning;

import java.util.Scanner;

public class OddorEvenCheck {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number :");
		int a=scan.nextInt();
		if(a%2==0)
		{
			System.out.println("The given number is prime");
		}
		else
		{
			System.out.println("The given number is not prime");
		}

	}

}

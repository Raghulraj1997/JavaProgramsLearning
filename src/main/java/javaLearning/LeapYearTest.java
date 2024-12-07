package javaLearning;

public class LeapYearTest {

	public static void main(String[] args) {
		int year=2022;
		if(year%4==0)
		{
			System.out.println("Leap year");
		}
		else if(year%400==0)
		{
			System.out.println("Leap year");
		}
		else if(year%100==1) {
		System.out.println("Leap year");	
		}
		else
		{
			System.out.println("Not a Leap Year");
		}

	}

}

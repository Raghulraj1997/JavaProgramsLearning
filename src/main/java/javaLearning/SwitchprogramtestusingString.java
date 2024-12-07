package javaLearning;
import java.util.Scanner;

public class SwitchprogramtestusingString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day");
		String day=sc.next();
		switch(day){
		case "Monday":
			System.out.println("Its working day");
			break;
		case "Tuesday":
			System.out.println("Its working day");
			break;
		case "Wednesday":
			System.out.println("Its working day");
			break;
		case "Saturday":
			System.out.println("Its Holiday day");
			break;
		case "Sunday":
			System.out.println("Its Holday day");
			break;
		default:
			System.out.println("Invalid day provided");
		}
		
		

	}

}

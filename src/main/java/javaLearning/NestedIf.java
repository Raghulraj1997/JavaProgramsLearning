package javaLearning;

public class NestedIf {

	public static void main(String[] args) {
	int a=50;
	if(a==50)
	
		System.out.println("FIrst nested if is pass");
	
	if(a!=50)
	{
		System.out.println("The second nested if is pass");
	
	}
	else
	{
		System.out.println("One of the if condition failed so catched in else block");
	}
	
	

	}

}

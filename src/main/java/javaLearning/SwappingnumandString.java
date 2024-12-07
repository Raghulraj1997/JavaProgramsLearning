package javaLearning;

public class SwappingnumandString {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int temp;
		
		temp=a; /// temp=10
		a=b;   //a=20;
		b=temp;  //b=10;
		
		System.out.println("The swapped numbers of a: "+a);
		System.out.println("The swapped numbers of  b: "+b);
		
		
		// swapping of number with temp varibable
		int d=50;
		int e=20;
		d=d+e;  // d=50+20=70
		e=d-e;    //e=70-20=50
		d=d-e;   // d=70-50=20
		
		System.out.println("The value of d: "+d);
		System.out.println("The value of e: "+e);
		
		
		

	}

}

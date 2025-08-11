package java_code;

public class FinalKeyword {
	static final int wheels = 4; // Class variable --> can also be final and static

	public static void main(String[] args) {
//		static int price =100; //Static is not applicable for local variable
		final int price = 100;
		final int days = 7;// Local variable --> can also be final
		System.out.println(days * price);

//		 days = 10;
//		 System.out.println(days*100);

//		why main method is static in nature
//		- Main method is called by JVM
//		- if main method is not static Unnecessary JVM has to create object of main method
//		- static: no need to create the object by JVM

//		why main method is Void in nature
//		- It is caller/user method --> We don't write any business logic in it so it does not return anything

//		why main method is Public in nature
//		- if we restrict it with private we can't access that

	}

}

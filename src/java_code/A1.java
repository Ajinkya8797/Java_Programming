package java_code;

public class A1 {

	// StackOverflowError example:
	
	public static void main(String[] args) {
		System.out.println("A1 --- Main Method");
		A2.main(args);
	}

}

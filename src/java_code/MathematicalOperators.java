package java_code;

public class MathematicalOperators {

	public static void main(String[] args) {
		
		System.out.println(10 / 2);// 5   int/int=int
		System.out.println(9 / 2);// 4.5-->4  int/int=int
		
		System.out.println(9 / 2.0);// 4.5 int/float=float
		System.out.println(9.0 / 2);// 4.5 float/int=float
		System.out.println(9.0 / 2.0);// 4.5 float/float=float

		// Mathematically Any no divided by zero is infinity
		// System.out.println(9/0);//ArithmeticException: / by zero
		System.out.println(0 / 9);// 0
		// System.out.println(0/0);////ArithmeticException: / by zero

		//Java treats floating values differently instead of Exception when floating no are divide by zero it will give Infinity.
		System.out.println(9.0 / 0);// Infinity
		System.out.println(9 / 0.0);// Infinity
		System.out.println(9.0 / 0.0);// Infinity
		System.out.println(9.3 / 0);// Infinity
		
		System.out.println(0 / 0.0);// NaN --> Not a number
		System.out.println(0.0 / 0.0);// NaN --> Not a number

		System.out.println('a' / 2);// 97/2=48.5 -->48
		// System.out.println('a'/0);//97/0 = AE

		System.out.println('a' / 2 + 100);// 48+100=148
		
		//Modulus % - it will give u remainder after dividing
		System.out.println(10 % 2); 
		System.out.println(9 % 2); 
		System.out.println(100 % 3);
		System.out.println(10 % 3);
		
		System.out.println(10.0/3);//3.3333333333333335
		System.out.println(10.0 % 3);//1.0

	}

}

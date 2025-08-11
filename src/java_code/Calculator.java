package java_code;

public class Calculator {

	public int Addition(int a, int b) {

		System.out.println("Addition :");
		int Add = a + b;
		return Add;
	}

	public int Subtraction(int a, int b) {
		System.out.println("Subtraction :");
		int Sub = a - b;
		return Sub;
	}

	public int Division(int a, int b) {
		System.out.println("Division :");
		int Div = a / b;
		return Div;
	}

	public int multiplication(int a, int b) {
		System.out.println("Multiplication :");
		int Mul = a * b;
		return Mul;
	}

	public static void main(String[] args) {

		Calculator c = new Calculator();
		int A = c.Addition(10, 20);
		System.out.println(A);

		int B = c.Subtraction(30, 10);
		System.out.println(B);

		int C = c.Division(30, 5);
		System.out.println(C);

		int D = c.multiplication(5, 6);
		System.out.println(D);
	}

}

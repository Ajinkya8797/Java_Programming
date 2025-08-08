package java_code;

public class ConditionalOperatorsConcept {

	// == Comparison Operator
	public static void main(String[] args) {
		int a = 20;
		if (a == 10) {
			System.out.println("condition is True");
		} else {
			System.out.println("Condition is False");
		}

		// ------------------------------------------------
		int x = 100;
		int y = 100;
		if (x == y) {
			System.out.println("True");
		}

		// ------------------------------------------------
		if (true) {
			System.out.println("Hello selenium");
		} else { // Dead code
			System.out.println("Bye selenium");
		}

		// ------------------------------------------------
		boolean flag = true; // Value of flag can change so it don't show dead code here
		if (flag) {
			System.out.println("Hello World");
		} else {
			System.out.println("Bye World");
		}

		// ------------------------------------------------
		int G = 100;
		int H = 200;
		if (H >= G) {
			System.out.println("H is greater than G");
		} else {
			System.out.println("G is greater than H");
		}

		// ------------------------------------------------
		// Write A Program - Three different values ---> Find Maximum value
		int X = 700;
		int Y = 900;
		int Z = 600;
		// && --> short circuit operator
		// true && true && false && true && true -->Short circuit will happen after one condition get false.
		if (X > Y && X > Z) { // False && True = False
			System.out.println("X is the greatest");
		} else if (Y > Z) { // True
			System.out.println("Y is the greatest");
		} else {
			System.out.println("Z is the greatest");
		}

		// -------------Assignment-----------------------------------

		// Write A Program - Five different values ---> Max value
		int M = 700;
		int N = 900;
		int O = 2200;
		int P = 1600;
		int Q = 2100;

		if (M > N && M > O && M > P && M > Q) {
			System.out.println("M is Greatest");
		} else if (N > O && N > P && N > Q) {
			System.out.println("N is Greatest");
		} else if (O > P && O > Q) {
			System.out.println("O is Greatest");
		} else if (P > Q) {
			System.out.println("P is Greatest");
		} else {
			System.out.println("Q is Greatest");
		}

	}

}

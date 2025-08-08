package java_code;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {

//		with new keyword: ---> when you are not sure about the values, like u declare 10 segments but u have only 4 values at first
		int i[] = new int[10];// 0-9

//		Array literals: without new keyword ---> when you are already having the values in advance, when you are sure about the values

//		int array:
		int num[] = { 1, 2, 3, 4, 5, 6 };// 0-5
		System.out.println(num[2]);// -->3
		System.out.println(num[5]);// -->6
//		System.out.println(num[6]);//AIOB
		System.out.println(num.length);// -->6

		System.out.println(num);// -->[I@4517d9a3
		System.out.println(Arrays.toString(num));// -->[1, 2, 3, 4, 5, 6]

		System.out.println("--------Print Using for each loop-----------");
		for (int e : num) {
			System.out.println(e);
		}

		System.out.println();

		String stNames[] = { "Anusha", "Ajinkya", "Akshay", "Deepak" };
		System.out.println(Arrays.toString(stNames));

		Object empInfo[] = { "Neha", 25, 34.55, true, 'f' };
		System.out.println(Arrays.toString(empInfo));

		System.out.println();
		
		System.out.println("--------Print Reverse order Using for loop-----------");
		int number[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int r = number.length - 1; r >= 0; r--) {
			System.out.println(number[r]);
		}

		System.out.println("--------Print Reverse order Using for each loop-----------");
		int I[] = { 1, 2, 3, 4, 5 };
		int count = I.length - 1;// 4
		for (int e : I) {
			e = count;
			System.out.println(I[e]);
			count--;
		}

	}

}

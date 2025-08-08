package java_code;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {

//		  Array: 
//  			- collection of similar types of data
//  			- It is Non-Primitive data type
// 	 Limitations:
//		 1. Size is fixed: Static array: to overcome this, we use dynamic array (ArrayList)
//		 2. can store only similar types of data
//		 3. when u declare size of array 4 and try to store the 5th value in array it will give Excp. AIOB- AIOB is RunTIme Exception

//-------------------Declaration of Array-------------------:

//		1. Using new keyword:
//		li=0 , Hi=3 , Len=Hi+1 = 3+1 =4
		int i[] = new int[4];// Range - 0-3
//		i[-1] = 60;//AIOB
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
//		i[4] = 50;//AIOB

		System.out.println(i.length);// 4
		System.out.println(i[0]); // 10
		System.out.println(i[1]); // 20
		System.out.println(i[2]); // 30
		System.out.println(i[3]); // 40
//		System.out.println(i[4]);//ArrayIndexOutOfBoundsException: AIOB
		System.out.println(i[0] + i[1]); // 30

//		 How to Fetch/Print all the values of array without Loop
		System.out.println(i);// Garbage Value - memory address of the array -[I@4517d9a3
		System.out.println(Arrays.toString(i)); // [10, 20, 30, 40]

//		 How to Fetch/Print all the values of array using for loop:
		for (int k = 0; k <= i.length - 1; k++) {
			System.out.println(i[k]);
		}

		System.out.println("----------------------------------");
		int pop[] = new int[5];
		pop[0] = 100;
		pop[1] = 200;
		pop[2] = 200;
		pop[4] = 500;
		System.out.println(Arrays.toString(pop));
//    In the pop[3] position no value is inserted so the it take default value - def value of int is 0.
//																											  def value of string is null
//																											  def value of float is 0.0

		String S[] = new String[3];
		System.out.println(S[0]); // Null

		float f[] = new float[3];
		System.out.println(f[0]); // 0.0

		char c[] = new char[3];
		System.out.println(c[0]); // blank spaces

		System.out.println();
		
		 String[] s = new String[5];
		 s[0] = "Aj";
		 s[1] = "la";
		 System.out.println(s);
		 System.out.println(Arrays.toString(s));

		 System.out.println();
		 
		char[] c1 = new char[4];
		c1[0] = 'a';
		c1[1] = 'b';
		System.out.println(c1); // ab
		System.out.println(Arrays.toString(c1)); // [a, b,

	}

}

package java_code;

import java.util.Arrays;

public class ArrayConceptPart2 {

	public static void main(String[] args) {

		byte b[] = new byte[3];// 0-2
		short sh[] = new short[4];// 0-3
		double d[] = new double[5];// 0-4

		float marks[] = new float[3];// 0-2
		marks[0] = 12.33f;
		marks[1] = 23.44f;
		marks[2] = 100;// 100.0
		System.out.println(Arrays.toString(marks));

		System.out.println();

		String empNames[] = new String[3];// 0-2
		System.out.println(Arrays.toString(empNames)); // [null, null, null]
		empNames[0] = "Akshay";
		empNames[1] = "Ajinkya";
		empNames[2] = "Anusha";
		System.out.println(Arrays.toString(empNames)); // [Akshay, Ajinkya, Anusha]
		System.out.println(empNames.length);// 3

		System.out.println("-----------------Print Using Index based loop--------------------------");
		for (int i = 0; i <= empNames.length - 1; i++) {
			System.out.println(empNames[i]);
			if (empNames[i].equals("Ajinkya")) {
				System.out.println("promote this emp to SDET 2");
			}
		}

		System.out.println("-----------------For each loop:Enhanced For loop--------------------------");
		for (String e : empNames) {
			System.out.println(e);
			if (e.equals("Ajinkya")) {
				System.out.println("promote this emp to SDET 2");
			}
		}

		System.out.println("-----------------Print int array Using For each loop--------------------------");
		int i[] = new int[4];// 0-3
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		for (int e : i) {
			System.out.println(e);
		}

		System.out.println("-----------------Print float array Using For each loop--------------------------");
		float numbers[] = new float[3];// 0-2
		numbers[0] = 12.33f;
		numbers[1] = 23.44f;
		numbers[2] = 100.22f;
		for (float e : numbers) {
			System.out.println(e);
		}

		System.out.println("-----------------Print char array Using For each loop--------------------------");
		char ch[] = new char[4];// 0-3
		System.out.println((byte) ch[0]); // '\u0000' -->ASCII--> 0
		ch[0] = 'a';
		ch[1] = 'A';
		ch[2] = '9';
		ch[3] = '$';
		System.out.println(ch);// no garbage value: concatenated values of char array
		System.out.println(Arrays.toString(ch));

		System.out.println("-----");
		for (char e : ch) {
			System.out.println(e);
		}
		System.out.println("-----");
		for (char e : ch) {
			System.out.println((byte) e);
		}
		System.out.println("-----");
		for (int e : ch) {
			System.out.println(e);
		}

		System.out.println("-------Object Array-----------");
//		Emp info: name(string), age(int), salary(double), dob(String),isActive(boolean), gender(char)

// Object Array: it Holds any type of data. Default value of non-primitive data type is null.
		Object empInfo[] = new Object[6];
		System.out.println(Arrays.toString(empInfo));// null
		empInfo[0] = "Ajinkya";
		empInfo[1] = 30;
		empInfo[2] = 35.55;
		empInfo[3] = "26-02-1994";
		empInfo[4] = true;
		empInfo[5] = 'f';
		System.out.println(Arrays.toString(empInfo));

		System.out.println();

		System.out.println("----------Print Using Index based loop--------------------------");
		for (int e = 0; e <= empInfo.length - 1; e++) {
			System.out.println(e + " = " + empInfo[e]);
		}

		System.out.println("----------Print Using For each loop--------------------------");
		int count = 0;
		for (Object e : empInfo) {
			System.out.println(count + " = " + e);
			count++;
		}

	}

}

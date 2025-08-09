package java_code;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Pract {

	public static void main(String[] args) {

//	-------------------------------------
		ArrayList<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");

		for (String color : colors) {
			System.out.println(color);
			if (color.equals("Blue")) {
				System.out.println("color is found....");
				break;
			}
		}

		System.out.println("-----------Reverse AL-----------");

		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("Ajinkya");// 0
		studentNames.add("Akshay");// 1
		studentNames.add("Sneha");// 2
		studentNames.add("Isha");// 3
		studentNames.add("Rohit");// 4

		System.out.println("-----------Reverse Using for loop-----------");
//		for (int st = studentNames.size() - 1; st >= 0; st--) {
//			System.out.println(studentNames.get(st));
//		}

		System.out.println("-----------Reverse Using Collections-----------");
//		System.out.println(studentNames);
//		Collections.reverse(studentNames);
//		System.out.println(studentNames);

		System.out.println("-----------Swapping using Collections-----------");
//		System.out.println(studentNames);
//		Collections.swap(studentNames, 2, 3);
//		System.out.println(studentNames);

		System.out.println("-----------Sort using Collections-----------");
		System.out.println(studentNames);
		Collections.sort(studentNames);
		System.out.println(studentNames);

		System.out.println("-----------Clear Method-----------");
		System.out.println(studentNames);
		studentNames.clear();
		System.out.println(studentNames);

//		List<String> newList = Collections.EMPTY_LIST;
//		System.out.println(newList.size());

//		List<Integer> marksList = Collections.emptyList();// Immutable List - empty
//		System.out.println(marksList);
//		marksList.add(200);//UnsupportedOperationException
//		marksList.add(300);
//		System.out.println(marksList);

		System.out.println();
		ArrayList<String> colorsList = new ArrayList<>(20);// vc=20, pc=0
		colorsList.add("Red");
		colorsList.add("Green");
		colorsList.add("Blue");
		colorsList.add("Yellow");// vc = 16, pc = 4

		colorsList.trimToSize();// vc=16-->4 ---> it will trim the al to current size
		System.out.println(colors.size());
		System.out.println(colorsList);

		System.out.println("Iterate AL in format --> 0=Red-----Using For Loop");
		// 0 = Red
		for (int x = 0; x < colorsList.size(); x++) {
			System.out.println(x + " = " + colorsList.get(x));
		}

		System.out.println("Iterate AL in format --> 0=Red-----Using For each Loop");
		int counter = 0;
		for (String e : colorsList) {
			System.out.println(counter + " = " + e);
			counter++;
		}

//		 10 colors --> print all even numbers colors 
//		 10 colors --> print all Odd numbers colors

		System.out.println();
//		 Write a program in Java to print "Hello World" ten times using while loop
		int p = 1;
		while (p <= 10) {
			System.out.println("Hello World");
			p++;
		}

		System.out.println();
		int x = 1;
		while (true) {
			System.out.println("Hello World");
			x++;// 11
			if (x == 11) {
				break;
			}
		}
		
		System.out.println();
		System.out.println("---- Print Respective ASCII Values of 0-9 ----");
		for (char ch = '0'; ch <= '9'; ch++) {
			System.out.println( ch + " = " +(byte) ch);

		}
	}

}

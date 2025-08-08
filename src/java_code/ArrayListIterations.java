package java_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListIterations {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(100);// 0
		numList.add(200);// 1
		numList.add(300);// 2
		numList.add(400);// 3
		numList.add(500);// 4

		System.out.println(numList.get(0) + numList.get(2));
		System.out.println(numList);

		System.out.println("Iterate the ArrayList using for loop:------------------");
		for (int i = 0; i < numList.size(); i++) {
			System.out.println(numList.get(i));// 100 200 300 400 500
		}

		System.out.println("Iterate the ArrayList using for each loop:------------------");
		for (Integer e : numList) {
			System.out.println(e);
		}

		System.out.println();
		ArrayList<String> empNamesList = new ArrayList<String>();// vc=10.pc=0
		empNamesList.add("Ajinkya");// 0
		empNamesList.add("Anusha");// 1
		empNamesList.add("Akshay");// 2
		empNamesList.add("Abhi");// 3
		empNamesList.add("Abhi");// we can add Duplicates and null value also
		empNamesList.add("Abhi");
		empNamesList.add(null);
		empNamesList.add(null);

		System.out.println(empNamesList);
		System.out.println();

		System.out.println("Iterate the ArrayList using for each loop:------------------");
		for (String e : empNamesList) {
			System.out.println(e);
		}

		System.out.println();
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("Rakesh");// 0
		studentList.add("Avinash");// 1
		studentList.add("Priya");// 2    
		System.out.println(studentList.size());
		
//		studentList.add(4,"Ajinkya");
//		System.out.println(studentList.get(4));  // if u add 4th index value and skip 3rd and try to fetch it, it gives IOB . there is continuous memory allocation in java
		
		studentList.add(3,"Ajinkya");
		System.out.println(studentList.get(3));
		
		studentList.add(0,"Anusha");
		System.out.println(studentList.get(0));//Anusha --> Here anusha takes position of Rakesh , and Rakesh shifted to next position
		
		System.out.println(studentList); //[Anusha, Rakesh, Avinash, Priya, Ajinkya]
		
		studentList.remove(0);
		System.out.println(studentList);
		studentList.add(0,"Anusha");
		System.out.println(studentList);
		
		System.out.println(studentList.size());
		studentList.set(2, "Neha");  //--> Set used to replace -- here neha will take the position of Avinash - and Avinash is gone
		System.out.println(studentList);
		

//		//
//		// 1. ArrayList ar = new ArrayList();
//		// 2. ArrayList<> ar = new ArrayList<>();
//		// 3. asList: ArrayList Literals
//
//		ArrayList<String> langList = new ArrayList<String>(Arrays.asList("Java", "Python", "C#"));// vc=10-->7
//		System.out.println(langList.size());
//		langList.add("Javascript");
//		System.out.println(langList.size());
//
//		// footer section: Contact Us, Privacy Policy, NewLetters
//		// ActualList = Contact Us, Privacy Policy, NewLetters
//		// ExpectedList =
//		ArrayList<String> footerList = new ArrayList<String>(
//				Arrays.asList("Contact Us", "Privacy Policy", "NewLetters"));// vc=10-->7
//		// If(ActualList is eq to ExpectedList){
//		// PASS
//		// }
//
//		//
//		ArrayList<String> list = new ArrayList<String>() {
//			{
//				add("Ajinkya");
//				add("Akshay");
//			}
//		};
//
//		//
//		ArrayList<String> colors = new ArrayList<>();
//		colors.add("Red");
//		colors.add("Green");
//		colors.add("Blue");
//		colors.add("Yellow");
//
//		for (String color : colors) {
//			System.out.println(color);
//			if (color.equals("Blue")) {
//				System.out.println("color is found....");
//				break;
//			}
//		}
//
//		//
//		ArrayList<String> studentNames = new ArrayList<String>();
//		studentNames.add("Ajinkya");// 0
//		studentNames.add("Akshay");// 1
//		studentNames.add("Sneha");// 2
//		studentNames.add("Isha");// 3
//		studentNames.add("Rohit");// 4
//		// studentNames.clear();
//
//		// for(int st = studentNames.size()-1; st>=0; st--) {
//		// System.out.println(studentNames.get(st));
//		// }
//
//		System.out.println(studentNames);
//		// Collections.reverse(studentNames);
//		// System.out.println(studentNames);
//
//		Collections.swap(studentNames, 2, 3);
//		System.out.println(studentNames);
//
//		Collections.sort(studentNames);
//		System.out.println(studentNames);
//
//		List<String> newList = Collections.EMPTY_LIST;
//		System.out.println(newList.size());
//
//		List<Integer> marksList = Collections.emptyList();// Immutable List - empty
//		// System.out.println(marksList);
//		// marksList.add(200);//UnsupportedOperationException
//		// marksList.add(300);
//		// System.out.println(marksList);
//
//		ArrayList<String> colorsList = new ArrayList<>(20);// vc=20, pc=0
//		colorsList.add("Red");
//		colorsList.add("Green");
//		colorsList.add("Blue");
//		colorsList.add("Yellow");
//
//		// vc = 16, pc = 4
//
//		// colorsList.trimToSize();//vc=16-->4
//
//		// System.out.println(colors.size());
//
//		// 0 = Red
//		for (int x = 0; x < colorsList.size(); x++) {
//			System.out.println(x + " = " + colorsList.get(x));
//		}
//
//		//
//		int counter = 1;
//		for (String e : colorsList) {
//			System.out.println(counter + " = " + e);
//			counter++;
//		}
//
//		// 10 colors --> print all even numbers colors
//
//		// Write a program in Java to print "Hello World" ten times using while loop
//		int p = 1;
//		// while(p<=10) {
//		// System.out.println("Hello World");
//		// p++;
//		// }
//
//		int x = 1;
//		while (true) {
//			System.out.println("Hello World");
//			x++;// 11
//			if (x == 11) {
//				break;
//			}
//		}
//		for (char ch = '0'; ch <= '9'; ch++) {
//			System.out.println((byte) ch + " = " + ch);
//
//		}

	}

}

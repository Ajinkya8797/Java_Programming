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

		studentList.add(3, "Ajinkya");
		System.out.println(studentList.get(3));

		studentList.add(0, "Anusha");
		System.out.println(studentList.get(0));// Anusha --> Here anusha takes position of Rakesh , and Rakesh shifted
												// to next position

		System.out.println(studentList); // [Anusha, Rakesh, Avinash, Priya, Ajinkya]

		studentList.remove(0);
		System.out.println(studentList);
		studentList.add(0, "Anusha");
		System.out.println(studentList);

		System.out.println(studentList.size());
		studentList.set(2, "Neha"); // --> Set used to replace -- here neha will take the position of Avinash - and
									// Avinash is gone
		System.out.println(studentList);

		System.out.println("------------------------------");
//		Declaration of ArrayList  - 3 ways
//			1. ArrayList ar = new ArrayList();
//			2. ArrayList<> ar = new ArrayList<>();
//			3. asList: ArrayList Literals

		ArrayList<String> langList = new ArrayList<String>(Arrays.asList("Java", "Python", "C#"));// vc=10-->7
		System.out.println(langList.size());
		System.out.println(langList);
		langList.add("Javascript");
		System.out.println(langList.size());
		System.out.println(langList);

//		Use case of asList in Selenium : 
//			footer section: Contact Us, Privacy Policy, NewLetters
//			ActualList = Contact Us, Privacy Policy, NewLetters
//			ExpectedList = Contact Us, Privacy Policy, NewLetters
//			ArrayList<String> footerList = new ArrayList<String>(Arrays.asList("Contact Us", "Privacy Policy", "NewLetters"));// vc=10-->7
//					If(ActualList is equal to ExpectedList){
//									PASS
//						}

		System.out.println();
		ArrayList<String> list = new ArrayList<String>() {
			{
				add("Ajinkya");
				add("Akshay");
			}
		};
		System.out.println(list);

	}

}

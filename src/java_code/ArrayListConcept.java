package java_code;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
/*	 	Dynamic Array: 
				- Size is not fixed
			 	- ArrayList -- default class in java
			 		- Different Methods in AL
			 		- Default Virtual Capacity of AL in Java - 10
			 		- Current size of AL = PC of AL
			 		- Load Factor(New VC) = PC/2 = Current Siz/2
			 		- AL is always index based
			 		- we can add duplicates, null in AL
			 		- Load Factor = PC/2 = Current Siz/2

   			ar.add();  --> To add the element in the AL
   			ar.get()    --> To Fetch the element in the AL
   			ar.size()   --> To get the current size of AL
   			
   		The Yellow warning in the code is  - declare the req what kind of al you want like number,sting etc
 */
		ArrayList ar = new ArrayList();// Empty array list -- size = 0
		System.out.println(ar.size());
		System.out.println(ar);

		ar.add(100);// 0
		ar.add(200);// 1
		
		System.out.println(ar);
		System.out.println(ar.size());

		ar.add(300);// 2
		ar.add(400);// 3
		ar.add(500);// 4

		System.out.println(ar.size());

		ar.add(600);// 5
		ar.add(700);// 6

		System.out.println(ar.size());

		ar.add(12.33);// 7
		ar.add(true);// 8
		ar.add("selenium");// 9

		System.out.println(ar.size());

		System.out.println(ar.get(0));
		System.out.println(ar.get(9));
//		System.out.println(ar.get(10));//IndexOutOfBoundsException - IOB
//		System.out.println(ar.get(-1));//IOB

		ar.add(1000);// 10
		System.out.println(ar.get(10));
		
		ar.add("selenium");// 11
		ar.add(null);// 12

		System.out.println(ar.size());
		System.out.println(ar);

System.out.println("-----------------------");

		ArrayList ar1 = new ArrayList();// vc=10,pc=0
		System.out.println(ar1.size());// 0
		ar1.add(10);
		System.out.println(ar1.size());// pc=1, vc=9

System.out.println("-----------------------");

// 	We Can define our own VC by mentioning the size inside bracket at the start. 
		ArrayList ar2 = new ArrayList(20);// pc=0,vc=20 [0-19]--> 19th -- added ---> pc/2=20/2=10
		ArrayList ar3 = new ArrayList(7);// pc=0,vc=7--->7/2=3




//		 Generics- diamond bracket and mention type of data. it can't be written in primitive data type - write Integer instead of int.

		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(100);

		ArrayList<Double> li = new ArrayList<Double>();
		li.add(12.33);
		li.add(100.0);

		ArrayList<String> empNamesList = new ArrayList<String>();// vc=10.pc=0
		empNamesList.add("Ajinkya");// 0
		empNamesList.add("Anusha");// 1           2-9 are VC
		System.out.println(empNamesList);

System.out.println();		

		ArrayList<Object> infoList = new ArrayList<Object>();
		infoList.add("Selenium");
		infoList.add(4.33);
		infoList.add(true);
		infoList.add(2007);
		infoList.add('A');        // pc=5 vc=5

		System.out.println(infoList);
		
		
//		int co = 0;
//		for (Object e : infoList) {
//			if (co % 2 == 0 && co != 0) {
//				System.out.println(infoList.get(co));
//			}
//			co++;
//		}

	}

}

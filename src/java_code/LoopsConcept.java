package java_code;

import java.util.Arrays;

public class LoopsConcept {

	public static void main(String[] args) {

// 1. while loop:------------------------------
		
		System.out.println("Print 1 to 10");
		int i = 1;
		while (i <= 10) {
			System.out.println(i);// 12345678910
			i++;
			// ++i;
			// i=i+1;
			// break;
		}

		System.out.println("Odd Numbers between 1 to 10");
		int O = 1;
		while (O <= 10) {
			System.out.println(O);// 13579
			O = O + 2;
			// break;
		}
		
		System.out.println("Even Numbers between 1 to 10");
		int E = 2;
		while (E <= 10) {
			System.out.println(E);// 246810
			E = E + 2;
			// break;
		}

		System.out.println("--------------");
		int j = 1;
		while (j <= 20) { 
			System.out.println(j);
			if (j % 5 == 0) {
				System.out.println("Hi");
				break;
			}
			j++;
		}

/* 		 when to use while loop: use cases:
		 - when number of iterations are not fixed
		 - waiting for the web element on the page
		 - waiting for the page loading
		 - Linkdin/Facebook/Swiggy/Zomato: infinite scrolling
		 - payment: waiting for the confirmation alert
		 - pagination
		 - calendar
		 - file download : 5 secs, 10 secs, 50 secs
*/
System.out.println("--------------------------------------------------------------------");

// 2. For loop:------------------------------
		
		System.out.println("Print 1 to 10");
		for (int k = 1; k <= 10; k++) {
			System.out.println(k);
		}
		
		System.out.println("--------------");
		System.out.println("Print 1 to 5 using byte");
		for (byte b = 1; b <= 5; b++) {
			System.out.println(b);
		}
		
		System.out.println("--------------");
		System.out.println("Odd Numbers between 1 to 10");
		for (int o = 1; o <= 10; o=o+2) {
			System.out.println(o);
		}
		
		System.out.println("--------------");
		System.out.println("Even Numbers between 1 to 10");
		for (int e = 2; e <= 10; e=e+2) {
			System.out.println(e);
		}
		
		System.out.println("--------------");
		System.out.println("Print 1 to 5 using float");
		for (float f = 1.1f; f <= 5.5; f++) {
			System.out.println(f);
		}
		
		System.out.println("--------------");
		System.out.println("Print a to z with ASCII Table using char");
		// a-z:97-122
		// a = 97
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch + " = " + (byte) ch);
		}
		
		System.out.println("--------------");
		System.out.println("Print A to Z with ASCII Table using char");
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch + " = " + (byte) ch);
		}
		
		System.out.println("--------------");
		System.out.println("Print 0 to 9 with ASCII Table using char");
		for (char ch = '0'; ch <= '9'; ch++) {
			System.out.println(ch + " = " + (byte) ch);
		}

System.out.println("-------------------------------------------------------");	
		
		System.out.println("------Assignments--------");
		for (;;) {
			System.out.println("welcome to Hotel Taj");
			break;
		}
		
		System.out.println("--------");
		// for -- break:
		for (int n = 1; n <= 50; n++) {
			System.out.println(n);
			if (n % 5 == 0) {
				System.out.println("Bye");// Bye
				break;
			}
		}

		System.out.println("---------------");
		System.out.println("Print Even-Odd Numbers between 1 to 10");
		for (int n = 1; n <= 10; n++) {
			if (n % 2 == 0) {
				System.out.println(n + " - Even number");
			} else {
				System.out.println(n + " - Odd number");
			}
		}
		
/* 		 when to use for loop: Use cases :
		 - when number of iterations are already fixed:
		 - Arrays
		 - drop down: month: 12
		 - menu items:
		 - read excel sheet: 10 rows: for loop
*/
		
		
System.out.println("--------------------------------------------------------------------");

// 3. Do-While:------------------------------

		System.out.println("Print 1 to 10");
		int s = 1;
		do {
			System.out.println(s);
			s++;
		} while (s <= 10);
		
		
		System.out.println("---------------");
		System.out.println("Print Even Numbers between 1 to 10");
		int e1 = 2;
		do {
			System.out.println(e1);	
			e1+=2;
		} while (e1 <= 10);
		
		
		System.out.println("---------------");
		System.out.println("Print Odd Numbers between 1 to 10");
		int o1 = 1;
		do {
			System.out.println(o1);	
			o1+=2;
		} while (o1 <= 10);

/*		when to use do-while loop:Use cases:
		 when number of iterations are not fixed
		 web Page: link: 10 secs to be loaded -->
		 1st: 0 sec: link is available: no need to go the loop part - click on it
		 2nd: 2 4 6 8
*/
		
System.out.println("------Assignments--------");
	
//WAP to print 10 to 1 using for loop
		System.out.println("Print 10 to 1 using for Loop");
		for(int I=10 ;I>=1 ;I--) {
			System.out.println(I);
		}
		
		System.out.println("---------------");
// WAP to print 10 to 1 using while loop
		System.out.println("Print 10 to 1 using while Loop");
		int x = 10;
		while (x >= 1) {
			System.out.println(x);
			x--;
		}

		System.out.println("---------------");
// WAP to print 10 to 1 using for loop
		System.out.println("Print 10 to 1 using for do-while");
		int L = 10;
		do {
			System.out.println(L);
			L--;
		} while (L >= 1);
		
		System.out.println("---------------");
		boolean flag = false;
		while (flag) {
			System.out.println("Hello World");
		}
		do {
			System.out.println("Hello World");
		} while (false);


	}

}

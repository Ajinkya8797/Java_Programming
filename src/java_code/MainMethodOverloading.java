package java_code;

public class MainMethodOverloading {
//	 Can we overload a main method?? -- Yes

			public static void main(String[] args) {
				System.out.println("Main Method");
				MainMethodOverloading.main("Selenium");
				MainMethodOverloading.main(07);
				MainMethodOverloading.main(10, 20);
			}
			public static void main(String a) {
				System.out.println("Main Method 1-"+" "+a);
			}
			public static void main(int a) {
				System.out.println("Main Method 2 -"+" " +a);
			}
			public static void main(int a, int b) {
				System.out.println("Main Method 3 -"+" "+a+b);
			}


}

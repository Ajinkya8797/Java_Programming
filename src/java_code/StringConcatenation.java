package java_code;

public class StringConcatenation {

	// String is Non-Primitive DataType
	public static void main(String[] args) {
		String s = "Hi this is Ajinkya here";
		String s1 = "200";

		String x = "Hello";
		String y = "Selenium";

		int a = 100;
		int b = 200;
		double c = 12.33;
		double d = 22.22;

		System.out.println(s + s1); //Hi this is Ajinkya here200
		System.out.println(a + b); //300 - here + is addition operator
		System.out.println(x + y);//HelloSelenium - here + is Concatenation operator
		System.out.println(a + x); //100Hello - Concatenation
		System.out.println(a + x + b); //100Hello200
		System.out.println(a + b + x + y);//300HelloSelenium
		System.out.println(x + y + a + b);// HelloSelenium100200
		System.out.println(x + y + (a + b));// HelloSelenium300
		System.out.println(a + b + x + y + a + b);// 300HelloSelenium100200
		System.out.println(c + d + x + y); //34.55HelloSelenium
		System.out.println(c + d + x + y + c + d);// 34.55HelloSelenium12.3322.22
		System.out.println(a + b + c + d + x + y);//334.54999999999995HelloSelenium

		System.out.println("The value of a : " + a);//100
		System.out.println("The value of b : " + b);//200
		System.out.println("The sum is : " + (a + b));//300
		System.out.println("The sum is : " + a + b);//The sum is : 100200

		char c1 = 'a';
		char c2 = 'b';
		System.out.println(c1);// a
		System.out.println((byte) c1);// 97
		System.out.println(c1 + c2);// 97+98=195
		System.out.println(c1 + 1);// 97+1=98
		System.out.println(c1 + "1");// a1
		System.out.println(c1 + c2 + x + y);// 195HelloSelenium

		System.out.println(c1 + "" + c2);// ab
		System.out.println(c1 + " " + c2);// a b
		System.out.println("c1" + "c2");//c1c2

	}

}

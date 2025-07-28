package java_code;

public class DataTypes {

	// Strict Type :
	// Static + Dynamic
	// Compile + RunTIme
	public static void main(String[] args) {

		// DataTypes: type of data:
		// 1. Primitive type :you don't need any object/reference
		// 2. Non Primitive type : need object/reference:
		// Array, Class, Interface, Objects, String

		// primitive:
		// 1. Boolean Type: true/false
		// 2. Numeric Type:
					// 2.a: Character: char: a $ 1
					// 2.b: Integral Value:
								// Integer : byte, short, int, long
								// Floating-point: float, double

		// 1. byte:
		// size: 1 byte = 8 bits
		// range: -128 to 127 =>  -2^7 to 2^7-1
		// Ex where to use : Age 
		byte a = 10;
		a = 20;
		a = 30;
		byte b = 40;

		System.out.println(a);
		System.out.println(b);
		System.out.println(a + b);

		
		// 2. short:
		// size: 2 bytes = 2x8 = 16 bits
		// range: -32768 to 32767 => -2^15 to 2^15-1
		// Ex where to use : comapny Employee ,Students no in college
		short s1 = 1000;
		short s2 = -900;
		short s3 = 1;

		
		// 3. int:
		// size: 4 bytes = 4x8 = 32 bits
		// range: -2147483648 to 2147483647 => -2^31 to 2^31-1
		// Ex where to use : comapny revenue , share price
		int i = 10;
		int j = 35000;

		
		// 4. long:
		// size: 8 bytes = 8x8 = 64 bits
		// range: - 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807  => -2^63 to 2^63-1
		// Ex: where to use : blood cells in body , world population , distance between sun and earth
		long l = 10;
		long num = 178788788899L;  //explicitly need to write L at postfix
		System.out.println(num);

		// long phone = 919898989898L; //phone, account , Social Security Number, Aadhar number
		// String phone = "919898989898";
		// We are storing it in string because we don't do any arithmetic operation on it

		
		// 5. float:
		// size: 4 bytes = 4x8 = 32 bits
		// range: after . can take upto 7 digits
		// Ex: where to use : Salary like 15.44 LPA
		float f1 = 12.33f;
		float f2 = (float) 45.44;
		System.out.println(f1);
		System.out.println(f2);

		
		// 6. double:
		// size: 8 bytes = 8x8 = 64 bits
		// range: after . can take upto 15 digits
		// Ex: where to use : Value of pi =3.14 , BMI
		double d1 = 12.45555d;
		double d2 = 100;
		System.out.println(d2);

		
		// char:
		// size: 2 bytes = 16 bits
		// Unicode --> special + language char + ASCII
		char c1 = 'a'; // a-z: 97 to 122
		char c11 = 'b'; // a-z
		char c2 = '0';// 0-9: 48 to 57
		char c3 = 'G';// A-Z: 65 to 90
		char c4 = '$';

		System.out.println(c1);// a
		System.out.println(c2);// 0
		System.out.println(c1 + c11);// 97+98=195
		System.out.println(c11 - c1);//98-97=1
		System.out.println('0' + '9');// 48+57 = 105

		
		// boolean: true/false: not keywords they are called boolean literals
		// size: ~1 bit
		// range: true/false
		boolean flag = true;
		boolean isActive = false;

		System.out.println(flag);
		System.out.println(isActive);

		short studentCollegeMarks = 100;
		int number = 20;

		//Naming Conventions
		int defaultTimeOut = 10; //Recommended
		int pop_value_number = 20; // Not Recommended

		byte p1 = 101;
		byte p2 = 102;
		//byte p3 =  p1 + p2; // Both p1 and p2 are in range of byte but their mathematical resultant will go beyond range thats why it show error
		int p3 = p1 + p2; // 203
		// range: -128 to 127
		

		System.out.println("--------Assignment-------");
		
		byte P1 = 127;
		byte P2 = 125;
		int K2 = (P1 + P2);// 127+125 = 252
		System.out.println(K2);// 3

		int I = -2147483648;
		int J = -2147483648;
		long K1 = (long) (I + J); // (I+J = -4294967296 ==> 0)
		System.out.println(K1);// -4294967296

		int x = 200;
		byte u = (byte) 128;
		System.out.println(x + u);

		String ui = "Hello Selenium";
		System.out.println(ui + " " + 90);

	}

}

package java_code;

public class IncrementalDecrementalPrct {

	public static void main(String[] args) {
		int i = 11;
		i = i++ + ++i;
		System.out.println(i);

		int a = 11, b = 22, c;
		c = a + b + a++ + b++ + ++a + ++b;
		// 11+ 22 + 11+ 22 + 13 + 24
		System.out.println("a=" + a);// 13
		System.out.println("b=" + b);// 24
		System.out.println("c=" + c);// 103

		int j = 0;// 0->1->0->1->0
		int k = j++ - --j + ++j - j--;
		// k = 0 - 0 + 1 - 1
		System.out.println(k);
		System.out.println(j);

		boolean g = true;
//		 System.out.println(g++);   Syntax Error

		int p = 19, q = 29, r = 0;
		int m = p-- - q-- - r--;
		// m =19 - 29 - 0
		System.out.println("p = " + p);// 18
		System.out.println("q = " + q);// 28
		System.out.println("r = " + r);// -1
		System.out.println("m = " + m);// -10

		int x =2;
//		System.out.println(--(x++)); 	Wrong argument --> does not apply on bracket.
//		System.out.println(--x++); 	Wrong argument-->don't apply -- & ++ at the same time.
		
		int M = 0, N = 0;
		int P = --M * --N * N-- * M--;
//			 P = -1 * -1 * -1 * -1 =1
		System.out.println("P = " + P);
		System.out.println("M = " + M);
		System.out.println("N = " + N);

		int A = 1;
		int B = A++ + ++A * --A - A--;
		System.out.println(A);
		System.out.println(B);

		int ch = 'A';// 65
		System.out.println(ch++);
		System.out.println(ch);
		System.out.println((char) ch);

		char ch1 = 'A';
		System.out.println(++ch1);
		System.out.println(ch1);
		System.out.println((int) ch1);

		double d1 = 1.5, d2 = 2.5;
		double D = d1++ + ++d2;
		// d1 = 1.5 + 3.5 = 5.0
		System.out.println("D = " +D);
		System.out.println("d1 = " +d1);
		System.out.println("d2 = " +d2);

	}

}

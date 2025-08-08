package java_code;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {
		// ++ and --

		System.out.println("-----------Post Increment-------------");
		// 1. post increment: ++
		int a1 = 1;
		int a2 = a1++;
		System.out.println(a1);
		System.out.println(a2);

		int b1 = 10;
		int b2 = b1++;
		System.out.println(b1);
		System.out.println(b2);

		int c1 = -99;
		int c2 = c1++;
		System.out.println(c1);
		System.out.println(c2);
		
		int d1 = 1;
		int d2 = d1+1;
		System.out.println(d1);
		System.out.println(d2);

		System.out.println("-----------Pre Increment-------------");
		// 2. Pre increment:
		int h1 = 1;
		int h2 = ++h1;
		System.out.println(h1); // 2
		System.out.println(h2); // 2

		int j1 = -999;
		int j2 = ++j1;
		System.out.println(j1);//-998
		System.out.println(j2);//-998

		System.out.println("-----------Post Decrement-------------");
		// 1. post decrement:
		int t1 = 2;
		int t2 = t1--;
		System.out.println(t1);//1
		System.out.println(t2);//2
		
		int x1 = 21;
		int x2 = x1--;
		System.out.println(x1);//20
		System.out.println(x2);//21

		System.out.println("-----------Pre Decrement-------------");
		// 2. pre decrement:
		int u1 = 2;
		int u2 = --u1;
		System.out.println(u1); // 1
		System.out.println(u2); // 1

		int pop = 1;
		System.out.println(pop++);// 1 --> Here initial value of pop=1 is given to println then increased in memory so it first gives 1 and then 2.
		System.out.println(pop);// 2

		int top = 5;
		System.out.println(++top);//6
		System.out.println(top);//6

	}

}

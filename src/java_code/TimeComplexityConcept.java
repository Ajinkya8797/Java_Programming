package java_code;

public class TimeComplexityConcept {

	public static void main(String[] args) {
		
/*		 Time Complexity: Time & data/input data:
		 Big O -> Oh
*/
		int i = 10;
		System.out.println(i); // constant time: O(1)

		String s = "Ajinkya";// Constant Time O(1)

// 	Calculate Time Complexity 
		for (int p = 1; p <= 10000000; p++) {
			System.out.println(p);
			int q = 10;
		}
		// 1 + n + n + n ==> 3n+1 ==> Linear Equation
		// 3n+1 ~ 3n ==> O(n)

		
//		Calculate Time Complexity
		int num[][] = { 
						{ 1, 2, 3 }, 
						{ 2, 3, 4 }, 
						{ 4, 5, 6 } 
					};
		for (int row = 0; row < num.length; row++) {
			for (int col = 0; col < num[0].length; col++) {
				System.out.print(num[row][col] + " ");
				// [0][0]=1 2 3
			}
			System.out.println();
		}
//		 (1+n+n+n)(1+n+n+n)=> (1+3n)(1+3n)=>1+3n+3n+9n^2
//		 9n^2+6n+1 (Quadratic eq) => 9n^2+6n => 3n(3n+2)=> 3n(3n)=>9n^2 ==> O(n^2)
										
/*		(1 + n + n + n)(1 + n + n + n)
		(1 + 3n)(1 + 3n)
		(1 + 3n)^2
		
		    (a+b)^2 = a^2 +2ab+b^2
		 (1 + 3n)^2 = 1^2 + 2 * 1 * 3n + (3n)^2
        				= 1 + 6n + 9n^2 ( ignore constant & Lower Term)
        				= n^2
        				O(n^2)  
*/

		
//		Calculate Time Complexity
		for (int row = 0; row <= 5; row++) {
			for (int col = 0; col <= 5; col++) {
				for (int dim = 0; dim <= 5; dim++) {
					System.out.print(row + "" + col + "" + dim);
				}
			}
			System.out.println();
		}

//		 (1+n+n+n)(1+n+n)(1+n+n+n)=> (1+3n)(1+2n)(1+3n)=> n^3+n^2+n+1 (Qubic eq)
//		 O(n^3)

/*
 		(1+n+n+n)(1+n+n)(1+n+n+n)
 		(1+3n)(1+2n)(1+3n)
 		Multiply the first two parts
 		=(1+3n)(1+2n)
 		=1⋅1+1⋅2n+3n⋅1+3n⋅2n
 		=1+2n+3n+6n^2
 		=1+5n+6n^2
 		Multiply that result with the third part
 		(1+5n+6n^2)(1+3n)
 		=1.1+1.3n+5n.1+5n.3n +6n^2.1+6n^2.3n
 		= 1  + 3n  + 5n  +15n^2+6n^2   +18n^3	( ignore constant & Lower Term)
 		= n^3
 		=O(n^3)
 */
		
//		 Binary Search: O(log n) -->

//		 1 to 100 Employees:
//		 Anusha: 0th: Best case
//		 Anusha: 50th: Avg case
//		 Anusha: 99th: worst case ---> Big O

//		 Binary Search: O(log n) -->
//		 Linear Search: O(n)
/*		 0 to 15: 16 elements
		 n --> n/2 ---> n/4 --> n/8
		 k = n/2
		 log k = log(n/2)
		 log k = log n - log 2
		 log k = log n
		 TC = O(log n): with base k
*/
		
//		 Space complexity: variables space
//		 Auxiliary Space: class + variables + all other spaces


	}

}

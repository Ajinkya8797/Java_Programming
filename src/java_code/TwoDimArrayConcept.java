package java_code;

import java.util.Arrays;

public class TwoDimArrayConcept {

	public static void main(String[] args) {

//		2D array
		int arr[][] = new int[2][3];
		arr[0][0] = 100;
		arr[0][1] = 200;
		arr[0][2] = 300;
		arr[1][0] = 400;
		arr[1][1] = 500;
		arr[1][2] = 600;

		System.out.println(arr.length);
		System.out.println(Arrays.deepToString(arr));
		
System.out.println("--------");
		
//		2D Array Literals:
		int num[][] = { 
						{ 1, 2, 3 },
						{ 2, 3, 4 },
						{ 4, 5, 6 } 
					};

		System.out.println(num.length);
		System.out.println(Arrays.deepToString(num));

System.out.println();

//		To iterate 2D array: use two loops: outer-inner loops
		for (int row = 0; row <num.length; row++) {
			for (int col = 0; col <num[0].length; col++) {
				System.out.print(num[row][col] + " "); // [0][0]=1 2 3
			}
			System.out.println();
		}

System.out.println();

//		2D Object Array
		Object empInfo[][] = { 
						{ "Ajinkya", 29, "SDET1", true },
						{ "Vishal", 27, "SDET2", false },
						{ "Anusha", 28, "SDET Manager", true } 
					};

					for (int row = 0; row < empInfo.length; row++) {
						for (int col = 0; col < empInfo[0].length; col++) {
							System.out.print(empInfo[row][col] + " ");
						}
						System.out.println();
					}

	}

}

package java_code;

public class IfElseConcept {

	public static void main(String[] args) {

		int marks = 71;

			if (marks >100 || marks < 0) {
				System.out.println("Incorrect marks");
			} 
			else {
					if (marks >= 90) {
						System.out.println("Grade A");
							if (marks == 100) {
								System.out.println("Eligible for scholarship");
							}
					} else {
							System.out.println("less than 90 marks");
							if (marks >= 80) {
								System.out.println("Grade B");
							} else {
								System.out.println("less than 80 marks");
								if (marks >= 70) {
									System.out.println("Grade C");
								}
							}
					}
			}

	}

}

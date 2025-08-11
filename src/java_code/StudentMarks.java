package java_code;

public class StudentMarks {

//	 WAF: to return the student marks
//	 function name: getStudentMarks(String stName)
//	 return: marks(int): 0-100

	public int getStudentMarks(String studentName) {
		System.out.println("Getting marks for student: " + studentName);
		int marks = -1;

		if (studentName.equals("Anusha")) {
			// return 90;
			marks = 90;
		} else if (studentName.equals("Ajinkya")) {
			// return 95;
			marks = 95;
		} else if (studentName.equals("Akshay")) {
			// return 100;
			marks = 100;
		} else if (studentName.equals("Neha")) {
			// return 0;
			marks = 0;
		} else {
			System.out.println("Please Pass the right student name..." + studentName);
			// return -1;
		}
		return marks;
	}

	public static void main(String[] args) {
			StudentMarks st = new StudentMarks();
			int stMarks = st.getStudentMarks("Anusha");
			System.out.println(stMarks);
			
			if(stMarks>0) {
				System.out.println("Print The Marksheet");
			}
			
	}

}

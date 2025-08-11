package java_code;
import java.util.ArrayList;
import java.util.Arrays;

public class MethodsInJava {

	String name;

	// You can not create a method inside a method
	// You can call a method inside a method
	// Methods are always independent/Parallel to each other
	// Methods are class data members
	// Purpose of Method: Define the behavior of the object/class
	// duplicate Methods are not allowed
	// void & return can not be together.

	// 1. no input and no return:
	// void: can not return any value
	// return type: void
	public void test() {// 0 parameters -- no input
		System.out.println("Test method");
	}

	// 2. no input but some return:
	// return type: int
	public int getInfo() {
		System.out.println("Get Info method");
		int a = 10;
		int b = 20;
		int c = a + b;// 30
		return c;
	}

	// return type: String
	public String getName() {
		System.out.println("Get Name method");
		String name = "Ajinkya";
		return name;
	}

//	 Can we return multiple values from the method? --> No we can't

	// return type: ArrayList<String>
	public ArrayList<String> getEmpNames() {
		System.out.println("Get Emp Names...");
		String em1 = "Ajinkya";
		String em2 = "Anusha";

		ArrayList<String> empList = new ArrayList<String>();
		empList.add(em1);// 0
		empList.add(em2);// 1
		return empList;
	}

	// return type: String[]
	public String[] getEmployee() {
		System.out.println("Get Employee Method");
		String emp[] = { "Ajinkya", "Anusha", "Neha" };
		return emp;
	}

	// 3. some input and some return:
	public int Addition(int a, int b) {// 2 parameters --> When we declare int a & b at method level they are called as parameters
		System.out.println("Addition method");
		int Add = a + b;
		return Add;
	}

	public int Subtraction(int a, int b) {// 2 parameters
		System.out.println("Subtraction method");
		int sub = b - a;
		return sub;
	}

	
	public float getBillAmount(int foodBill, int drinksBill, float tax) {
		System.out.println("Generating Bill Amount..");
		float totalBill = foodBill + drinksBill + tax;
		return totalBill;
	}

	
//	If you are passing 3 parameters you should use all of them in logic --> so this bad practice approach
	public int calculateMarks(int subjectMarks, int attendance, int handwriting) {
		int totalMarks = subjectMarks + attendance;
		return totalMarks;
	}
	

	public int calculateMarks(int subjectMarks) {
		int totalMarks = subjectMarks;
		return totalMarks;
	}

	public Object[] getEmpInfo() {
		Object empInfo[] = { "Ajinkya", 30, 12.33, true };
		return empInfo;
	}

	public static void main(String[] args) {
//		Main Method is Void in nature and dont return anything -->becoz we dont write any business logic inside it
//		call the method: create the object of the class
		MethodsInJava obj = new MethodsInJava();
		obj.name = "Ajinkya";
		obj.test();

//		1st Approach
		int s = obj.getInfo();
		System.out.println(s);// 30
		System.out.println(s + 20 - 10);// 40
		System.out.println(s + 20 - 10 - 2);// 38

//    2nd Approach - Avoid this approach -->in this we call method multiple time so there might be performance issue
//		System.out.println(obj.getInfo() + 20);
//		System.out.println(obj.getInfo() + 20 - 10);

		String n1 = obj.getName();
		System.out.println(n1);// Ajinkya
		System.out.println(n1 + " Landge ");

		ArrayList<String> eList = obj.getEmpNames();
		System.out.println("Total No emp: " + eList.size());
		System.out.println(eList);

		String employee[] = obj.getEmployee();
		System.out.println(employee.length);
		System.out.println(Arrays.toString(employee));

		int A1 = obj.Addition(10, 20);// When we call the function and passing values of int a & b as 10 &20 they are called as arguments /value
		System.out.println(A1);
		int A2 = obj.Addition(30, 40);
		System.out.println(A2);

		float FinalBill = obj.getBillAmount(100, 50, 0.5f);
		System.out.println(FinalBill - 20 + 5);
		
		int totalMark =obj.calculateMarks(45, 13, 5);// args/value --> calling a function/method by passing the value/arg--> call by value/arg
		System.out.println(totalMark);
		
		int totalm = obj.calculateMarks(65);
		System.out.println(totalm);
		
		Object[] eInfo =obj.getEmpInfo();
		System.out.println(Arrays.toString(eInfo));
	}

}

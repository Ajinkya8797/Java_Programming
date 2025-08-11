package java_code;

public class MethodOverloading {
//	 Method Overloading: OOP: Poly(many) +Morphism (forms): CompileTime(Static,early binding)
//	 	When in the same class, we have different methods:
//	 		1. with the same name
//	 		2. with different number of parameters
//	 		3. with different type of parameters
//	 		4. return type does not matter
//	 		5. sequence of the parameter should be different
//		If we have same feature and there are multiple ways of doing it then in that case we can use methodOverloading. ex. Login
//		we use it for better code readability and maintenance

	public void test() {// 0 param
		System.out.println("Test method");
	}

	public void test(int a) {// 1 param
		System.out.println("Test method: " + a);
	}

//	 return type does not matter
//	 public int test(int a) { //1 param
//	 	System.out.println("test method: " + a);
//	 	return 100;
//	 }

	public void test(String a) {// 1 param
		System.out.println("Test method: " + a);
	}

	public void test(int a, int b) {// 2 params
		System.out.println("Test method: " + a + b);
	}

	public void test(int b, String a) {// 2 params
		System.out.println("Test method: " + a + b);
	}

	public void test(String a, int b) {// 2 params
		System.out.println("Test method: " + a + b);
	}

	public void test(int c, float d) {// 2 params
		System.out.println("Test method: " + c + d);
	}

	// ecomm:
	public void login(String un, String pwd) {
	}

	public void login(String un, String pwd, int otp) {
	}

	public void login(String un, String pwd, String ph) {
	}

	public void login(String emailId) {
	}

	// search:
	public void search() {
	}

	public void search(String productName) {
	}

	public void search(String productName, int price) {
	}

	public void search(String productName, int price, String seller) {
	}

	// Payment:
	public void doPayment(String upi) {
	}

	public void doPayment(String cc, int cvv) {
	}

	public void doPayment(String paypalId, String pwd) {
	}

	// Uber: booking():
	public void booking(String carType, String startPoint, String endPoint) {
	}

	public void booking(String carType, String startPoint, String endPoint, int passangers) {
	}

	public static void main(String[] args) {

		MethodOverloading M = new MethodOverloading();
		M.test(10);
		M.test(10, 20);
	}
}

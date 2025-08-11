package java_code;

public class Customer {

//	 Customer class variables:
	String firstName;
	String lastName;
	String email;
	String telephone;
	String password;
	boolean subscribe;

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.firstName = "Neha";
		c1.lastName = "Yadav";
		c1.password = "Neha@123";
		c1.subscribe = true;

		Customer c2 = new Customer();
		c2.firstName = "Ajinkya";
		c2.lastName = "Landge";

		Customer c3 = new Customer();
		c3.firstName = "Akshay";

		Customer c4 = new Customer();
		c4.firstName = "Anusha";
		c4.email = "Anusha@gmail.com";
		c4.lastName = "Patil";
		c4.telephone = "9898989898";
		c4.subscribe = false;
		c4.password = "Anusha@123";


	}

}

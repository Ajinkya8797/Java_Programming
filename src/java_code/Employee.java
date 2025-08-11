package java_code;

public class Employee {

//	 Class variables(Global Variable): Class attributes
	String name;
	int empId;
	String dept;
	boolean isPerm;
	double salary;

	public static void main(String[] args) {
		int i = 10;// local variable --> 4 bytes --> primitive --> it will stored in stack memory
		System.out.println(i);

//		 class: is a blueprint/template/category of the objects
//		 Object/Instance: is a Physical entity created from class template/category

//		Creating Object - with new keyword
//		Objects gets stored in Heap Memory
		Employee e1 = new Employee();
//		 Employee :--> class/ type of e1
//		 e1:--> object reference variable
//		 new :--> keyword
//		 new Employee():--> Object

//		Before adding values---> it will give default values
//		System.out.println(e1.name); //null
//		System.out.println(e1.empId);//0
//		System.out.println(e1.dept);//null
//		System.out.println(e1.isPerm);//false
//		System.out.println(e1.salary);//0.0

		e1.name = "Ajinkya";
		e1.empId = 1;
		e1.dept = "QA";
		e1.isPerm = true;
		e1.salary = 23.44;

		System.out.println(e1.name);
		System.out.println(e1.empId);
		System.out.println(e1.dept);
		System.out.println(e1.isPerm);
		System.out.println(e1.salary);

		Employee e2 = new Employee();
		e2.name = "Anusha";
		e2.empId = 2;
		e2.salary = 12.33;

		System.out.println(e2.name);
		System.out.println(e2.empId);
		System.out.println(e2.dept);
		System.out.println(e2.isPerm);
		System.out.println(e2.salary);

//		 No Reference Object: --> Bad practice to create object. we can't even access as they don't have reference variable .
		new Employee().name = "Neha";
		new Employee().empId = 3;

//		 Null Reference object
		Employee e3 = new Employee();
		e3 = null;
		e3.name = "Ajinkya";// Null Pointer Exception
//		 whenever we write null. something it will start giving Null Pointer Exception

//		JVM gives instruction to Garbage Collector & GC Will destroy No reference and Null Reference object when heap memory get full 
		System.gc();// We can call GC but there is No guarantee that Garbage Collector will go to heap memory

		Employee e5;// stack
		e5 = new Employee();

	}

}

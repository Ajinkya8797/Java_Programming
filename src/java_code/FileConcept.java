package java_code;

public class FileConcept {

//	 StaticMethod:-
	
	static String name;// class static variable
	int fileSize;// instance variable

	public static void readFile() {
		System.out.println("read file");
	}

	public void writeFile() {
		System.out.println("write file");
	}

	public static void main(String[] args) {
//		 call static method:
//		 1. directly:
		readFile();
//		 2. using class name:
		FileConcept.readFile();

		FileConcept Fc = new FileConcept();
		Fc.writeFile();
		Fc.readFile(); // not recommended

	}

}

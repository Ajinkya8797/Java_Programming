package java_code;

public class IfElseType {

	public static void main(String[] args) {

			 String test = "Ajinkya";
			 if(test.equals("Ajinkya")) {
			 System.out.println("Pass");
			 } else {
			 System.out.println("Fail");
			 }
			 
//------------------------------------------
			 
/*		 String browser = "chrome";
		 if(browser.equals("chrome")) {
		 System.out.println("Launch chrome");
		 }
		 if(browser.equals("firefox")) {
		 System.out.println("Launch firefox");
		 }
		 if(browser.equals("edge")) {
		 System.out.println("Launch edge");
		 }
		 if(browser.equals("safari")) {
		 System.out.println("Launch safari");
		 }
		 else { // This else is associated with the if condition of safari  so it will execute when cases are chrome,ff,edge
		 System.out.println("Please pass the right browser...." + browser);
		 }
*/	 

//----------------------------------------------------------------------
		 
		String browser = "Brave";

		if (browser.equals("chrome")) {
			System.out.println("Launch chrome");
		} else if (browser.equals("firefox")) {
			System.out.println("Launch firefox");
		} else if (browser.equals("edge")) {
			System.out.println("Launch edge");
		} else if (browser.equals("safari")) {
			System.out.println("Launch safari");
		} else {
			System.out.println("plz pass the right browser...." + browser);
		}

	}

}

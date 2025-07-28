package java_code;

public class SwitchCaseConcept {

	// Boolean Cases Not allowed in cases like marks>=90
	// byte,short,int,char,String --> allowed 
	// long,float,double,boolean --> not allowed 
	public static void main(String[] args) {
		
	 		String browser = "Chrome";
			
			switch (browser.toLowerCase().trim()) {
			case "chrome":
				System.out.println("Launch chrome");
				break;
			case "firefox":
				System.out.println("Launch firefox");
				break;
			case "edge":
				System.out.println("Launch edge");
				break;
			case "safari":
				System.out.println("Launch safari");
				break;

			default:
				System.out.println("Please Pass the Right Browser... " + browser);
				break;
				
			}
	
			
//-----------------------------------------------------------------
		
//		Write a Program to Check Vowel/Consonant
		char ch = 'E';

		switch (ch) {
		case 'a':
			System.out.println(ch +" is a vowel");
			break;
		case 'e':
			System.out.println(ch +" is a vowel");
			break;
		case 'i':
			System.out.println(ch +" is a vowel");
			break;
		case 'o':
			System.out.println(ch +" is a vowel");
			break;
		case 'u':
			System.out.println(ch +" is a vowel");
			break;
		case 'A':
			System.out.println(ch +" is a vowel");
			break;
		case 'E':
			System.out.println(ch +" is a vowel");
			break;
		case 'I':
			System.out.println(ch +" is a vowel");
			break;
		case 'O':
			System.out.println(ch +" is a vowel");
			break;
		case 'U':
			System.out.println(ch +" is a vowel");
			break;

		default:
			System.out.println(ch +" is a Consonant");
			break;
		}
		
/*
 		  Usecases of Switch Cases:
 		* Cross browser logic 
 		* Cross platform/OS/devices: Linux, mac, windows, android,ios 
 		* User access based permission : RBAC: admin/seller/vendor/customer/distributor 
 		* Multi env execution:dev/qa/stage/uat/prod 
 		* payment options: CC/UPI/mobile app/online/COD 
 		* Lang Cases: English, Arabic,Japanese,German
 		* Web Page: Electronics, Fashion.
 */
//----------------------------------------------
		String Browser = "firefox";
		int version = 116;
		String mode = "incognito";
		
		switch (Browser.toLowerCase().trim()) {
		case "chrome":
					if (version == 115) {
						System.out.println("Give the Permission");
					} else {
						System.out.println("No Need to Give Permission");
					}
					System.out.println("Launch chrome");
			break;
			
		case "firefox":
			System.out.println("Launch firefox");
					switch (mode) {
					case "headless":
						System.out.println("Opening in headless Mode");
						break;
					case "incognito":
						System.out.println("Opening in incognito Mode");
						break;

					default:
						break;
					}
			
			break;
		case "edge":
			System.out.println("Launch edge");
			break;
		case "safari":
			System.out.println("Launch safari");
			break;

		default:
			System.out.println("Please Pass the Right Browser... " + browser);
			break;
			
		}
		
	}

}

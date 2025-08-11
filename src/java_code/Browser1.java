package java_code;

public class Browser1 {

	public boolean LaunchBrowserTest(String browserName) {
		System.out.println("Browser name is : " + browserName);
		browserName = browserName.toLowerCase().trim();
		boolean flag = true;

		if (browserName.equals("chrome")) {
			System.out.println("Chrome is Launched");
		} else if (browserName.equals("firefox")) {
			System.out.println("Firefoxf is Launched");
		} else {
			System.out.println("Please Pass The Right Browser..." + browserName);
			flag = false;
		}
		return flag;
	}

	public static void main(String[] args) {

		Browser1 Br = new Browser1();

		boolean isOpen = Br.LaunchBrowserTest("Brave");
		if(isOpen) {
			System.out.println("Enter url");
		}
	}

}

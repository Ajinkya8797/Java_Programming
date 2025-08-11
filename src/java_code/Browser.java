package java_code;

public class Browser {
	// WAF: to launch the browser
	// function name: launchBrowser : chrome/firefox/safari/edge
	// Parameter: browserName(String)
	// return: boolean

	public boolean launchBrowser(String browserName) {
		System.out.println("browser name is : " + browserName);
		boolean flag = true;

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Chrome is launched");
			break;
		case "firefox":
			System.out.println("Firefox is launched");
			break;
		case "edge":
			System.out.println("Edge is launched");
			break;
		case "safari":
			System.out.println("Safari is launched");
			break;
		default:
			System.out.println("Please Pass the right browser name -->" + browserName);
			flag = false;
			break;
		}

		return flag;
	}

	public static void main(String[] args) {
		// caller method // user
		Browser br = new Browser();
		boolean flag = br.launchBrowser("Brave");
		if (flag) {
			System.out.println("Enter URL");
		} else {
			System.out.println("Error - No Browser is there");
		}

	}
}

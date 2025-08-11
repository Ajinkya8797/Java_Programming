package java_code;

public class Language {

	public static void useLang(Language obj) {
		System.out.println("Use this Language");
//		obj = null;  //NullPointerException
		obj.readLang();
	}

	public void readLang() {
		System.out.println("Read Language");
	}

	public static void main(String[] args) {
		Language lg = new Language();
		lg.readLang();
		Language.useLang(lg);

	}

//	 Call by reference example in Selenium :-->
//	 POM -- page chaining model -- supply webdriver driver
}

package java_code;

public class CallByReference {

	public static void sendMail(CallByReference a) {
		System.out.println("Send mail");
		a.readMail();
	}
	
	public void readMail() {
		System.out.println("Read mail");
	}

	public static void main(String[] args) {
		CallByReference obj = new CallByReference();
		CallByReference.sendMail(obj);
	}
}

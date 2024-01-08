package oopsConcept;

public class CallByReference {
	public static void readmail(CallByReference ref) {
		System.out.println("Read Mail");
		ref.sendmail();
	}

	public void sendmail() {
		System.out.println("Send Mail");

	}

	public static void main(String[] args) {
		CallByReference obj = new CallByReference();
		// obj.sendmail();
		// readmail();
		// obj.readmail();//The static method readmail() from the type CallByReference
		// should be accessed in a static way
		CallByReference.readmail(obj);
		// readmail(obj); above & below both are right
	}

}

package exceptionhandling;

//PROPERTY OF EXCEPTION:=after exception it will terminate it doesn't execute further.
public class Employee {

	String name;

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
//exception always terminate the program we can handle it through try catch 
		try {
			int i = 9 / 0;
//even if we write 1000 lines of code here it will never be executed... ,better to write after catch block
			System.out.println("HELLO JAVA");
			System.out.println("HELLO JAVA");
			System.out.println("HELLO JAVA");
			System.out.println("HELLO JAVA");
//after exception jvm immediately jump to catch block--it is property of try catch block
//try & catch should be together we can not write anything between them
			// int i = 9/3;
//		}catch(Exception e) {
//		 System.out.println("some exception is coming..");
//		 e.printStackTrace();}
		} catch (ArithmeticException e) {
			// }catch(NullPointerException e) {//we are getting AE and we are writing
			// NPE,--jvm doesn't go inside catch
			System.out.println("AE is coming...");
			e.printStackTrace();// it works on LIFO
		}
// lines of code here be executed with exception handling
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");

		try {
			Employee obj = new Employee();
			obj = null;
			obj.name = "Tom";// it doesn't go to next line directly jump to catch block
			int i = 9 / 0;
			System.out.println("hi");
		} catch (ArithmeticException e) {// we can write multiple catch blocks here but duplicate name is not allowed
			System.out.println("AE is coming...");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("AE is coming...");
			e.printStackTrace();
		}
		System.out.println("hello selenium");

		try {
			Thread.sleep(5000);// sleep the script for 5 secs ---compile time/checked exception
		} catch (InterruptedException e) {
			System.out.println("IE is coming....");
			e.printStackTrace();
		}

	}

}

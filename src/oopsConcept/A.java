package oopsConcept;
//StackOverflowError
//to call B class method inside the A class /outside the class ./here within package
public class A {

	public static void main(String[] args) {
		System.out.println("A-- main method");
		B.main(args);
	}

}

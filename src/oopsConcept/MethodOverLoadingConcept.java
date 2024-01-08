package oopsConcept;

public class MethodOverLoadingConcept {
//generally duplicate method is not allowed in any programming language.
//if we really want to create 2 methods with exactly same name we can change the no of parameters.
	public void test() {
		System.out.println("test method");
	}
//	public int test() {duplicate even though return type is different
//		System.out.println("test method");
//	}

//public void test() {duplicate method not allowed
//	System.out.println("test method");
//}	
	public void test(int a) {// test method with one parameter
		System.out.println("test method: " + a);
	}
//public static void test (int a ) {
//	System.out.println("static method: " +" " + a );
//}
	public void test(String name) {
		System.out.println("test method: " + name);
	}

	public void test(String name, int a) {// test method with 2 parameter
		System.out.println("test method: " + name + " " + a);
	}

	public void test(int a, String name) {
		System.out.println("test method: " + a + " " + name);
	}

	public void test(int a, int b) {
		System.out.println("test method: " + a + " "+ b);
	}

//public void test (int c , int d) {duplicate with 2 int parameter
//	System.out.println("test method: " + c + d);
//}
	public void test(int a, float b) {
		System.out.println("test method: " + a + b);
	}
//all the above methods having common name [test()] with different parameter & no. of parameter-- this concept is called
//METHOD OVERLOADING IN JAVA
//METHOD OVERLOADING ---this is part of POLYMORPHISM (poly--many, morphism--different forms)
//when in the same class, we have different method with :
//a)name should be same.
//b)different no. of parameter.
//c)different type of parameter
//d)return type doesn't matter in method overloading
//e) sequence of parameter should be different
//method overloading will be decided on the basis of your method name & what kind of parameter we are passing or we can 
//say that at compile time
//method overloading also called
//a) compile time polymorphism
//b)static polymorphism 
//c) early binding
// the moment we change method name then method overloading concept is not applicable.	
	

	public static void main(String[] args) {
		MethodOverLoadingConcept m = new MethodOverLoadingConcept();
		m.test();//compile already aware of which method is to call i.e compile time polymorphism /early binding
		m.test("pooja");
		m.test(10, "Vihu");
		m.test(10, 78);
		
		
		

	}

}

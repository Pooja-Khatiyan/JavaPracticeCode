package oopsConcept;

//there is no need to create object to have communication b/w m1(),m2(),m3()as all are part of same object
//they have direct access to each other.
public class MethodCall {
	public void m1() {
		System.out.println("m1 method");
		m2();
	}

	public void m2() {
		System.out.println("m2 method");
		m3();
	}

	public void m3() {
		System.out.println("m3 method");
		// m1();StackOverflowError
		t2();
	}

//to call m1(non-static) from t1(static) object creation is mandatory	
	public static void t1() {
//scope of obj is with in the method only
		System.out.println("t1 method");
		t2();
// to avoid this unnecessary object creation  we can use the call by reference 
		MethodCall obj = new MethodCall();
		obj.m1();
	}

	public static void t2() {
		System.out.println("t2 method");
	}

	public static void main(String[] args) {

		MethodCall m = new MethodCall();
		m.m1();
		t1();
	}
//object will be created & method,space,everything will be allocated by JAVA--when we run this program --java create one 
//stack memory or called execution stack-one entry will be created for execution in stack.,main method is allocated in CMA
//execution stack is based on LIFO-last in first out	
}

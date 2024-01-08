package oopsConcept;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MethodCallByCallByRef {
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
		t2();
	}

	public static void t1(MethodCallByCallByRef ref) {
//by call by reference
		System.out.println("t1 method");
		t2();
		ref.m1();
	}

	public static void t2() {
		System.out.println("t2 method");
	}

	public static void writelang(MethodCallByCallByRef call) {
		System.out.println("Write Language...");
		call.readlang();
	}

	public void readlang() {
		System.out.println("Read Language...");
	}

	public static void main(String[] args) {
		MethodCallByCallByRef obj = new MethodCallByCallByRef();
		// obj.m1();
		MethodCallByCallByRef.t1(obj);
		MethodCallByCallByRef.writelang(obj);
	}
}

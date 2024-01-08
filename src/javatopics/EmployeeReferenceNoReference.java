package javatopics;

public class EmployeeReferenceNoReference {
	// global variable
	String name;
	int empId;
	String dept;
	boolean isperm;
	double salary;

	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		EmployeeReferenceNoReference e = new EmployeeReferenceNoReference();
		e.name = "Pooja";
		e.empId = 1;
		e.salary = 25.88;
		e.dept = "QA";
		System.out.println(e.name + " , " + e.empId + " , " + e.salary + " , " + e.dept);
		// no REFERENCE Object --- eligible for GC
		new EmployeeReferenceNoReference().name = "Priya";
		new EmployeeReferenceNoReference().empId = 5;
		// NULL REFERENCE Object---eligible for GC
		EmployeeReferenceNoReference e1 = new EmployeeReferenceNoReference();
		e1 = null;
		// e1.name= "Siya";//NPE--NullPointerException
		System.gc();// no guarantee that GC will go to heap memory
//we can create the reference also --e2 is reference not pointing to any object--GC will not destroy it
//becz GC will not come inside the stack.
//e2 is just a reference --it is not an object & it's type is EmployeeReferenceNoReference--created inside stack

		EmployeeReferenceNoReference e2;
//we can create object with reference in this way also
//1st we have created a  & java will create a new brand object in heap & e3 starts pointing to it 
		EmployeeReferenceNoReference e3;
		e3 = new EmployeeReferenceNoReference();
		e3.salary = 12.90;
	}

}

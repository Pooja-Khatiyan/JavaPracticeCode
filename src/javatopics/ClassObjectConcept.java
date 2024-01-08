package javatopics;

public class ClassObjectConcept {
//class is a blue print/template of the object or we can say class is a category
//Object-physical entity created from class template---object for a class there is no limit
//to create object we use new keyword,another name for Object is Instance
//global variable	
//never initialize template variable at the class level,becz these template is given to each
//& every object that we are going too create,let the object decide these template values.
	String name;
	int empId;
	String Dept;
	boolean isperm;
	double salary;

	public static void main(String[] args) {
//local variable
//only global variable will store inside the object,not class variable
		int i = 10;
		ClassObjectConcept e = new ClassObjectConcept();
//object is create with object reference variable 'e'
//using same template we can create n no of object
//it is not mandatory that we have to assign all the values---remaining will take default values
//we can assign value in any order.
		System.out.println(e.name);
		System.out.println(e.empId);
		System.out.println(e.Dept);
		System.out.println(e.isperm);
		System.out.println(e.salary);
		e.name = "Pooja";
		e.empId = 1;
		e.Dept = "QA";
		e.salary = 14.55;
		e.isperm = true;
//we can create in this way also "NO REFERENCEE OBJECT"
		new ClassObjectConcept();
		new ClassObjectConcept().name = "Riya";
		new ClassObjectConcept().empId = 5;
		System.out.println(" [ " + e.name + " ," + e.empId + ", " + e.Dept + " ," + e.salary + ", " + e.isperm + " ]");
//here 3 separate object is create one with all default values
//2nd with name Riya and rest default values
//3rd with empId 5 and rest default values all this are eligible for GARBAGE COLLLECTOR
//Java object is always be created inside the heap memory,reference variable is always created
//inside the stack memory
//NULL REFERENCE OBJECT
		ClassObjectConcept e1 = new ClassObjectConcept();
		e1 = null;
		// e1.name="Siya";//NullPointerException
//heap is only for the Objects
//stack is only hold reference variable
//GC--only understand heap doesn't go inside stack
//GC-- come inside heap and destroy object having NO/NULL REFERENCE--it will not touch the object having proper reference
//we can call GC programmatically also
		System.gc();

	}

}

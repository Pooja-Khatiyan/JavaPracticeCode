package constructorcocept;

public class ConstructorConcept {
//RULES FOR CONSTRUCTOR
//const.. name is same as the class name
//doesn't have any return type/no void--i.e it can not return anything
//const.. is not made for the business logic.
//const. immediately called after creation of object i.e RHS
//PURPOSE OF CONSTRUCTOR
//a)initialize the class variable
//b)restrict the unnecessary object creation
	// instance variable
	String name;
	int id;
	double salary;

	public ConstructorConcept() {// 0 para
		System.out.println("default const");
	}

//constructor can be overloaded--const.. is not part of object
//const.. will be called immediately as we create the object
//for function we have to call it through reference
	public ConstructorConcept(int a) {// constructor
//both have different variable name but in case they have same variable name in that case we have to use "this" keyword
		id = a;
		System.out.println("1 parameter const..." + " " + a);

	}

//constructor it look like function but it is not a function
	public void ConstructorConcept() {// function having constructor name java give warning not the right way

	}

	public void test() {// function
		System.out.println("test method");
	}

	public ConstructorConcept(String name, int a) {
		this.name = name;
		this.id = a;
		System.out.println("2 parameter const..." + " " + name + " " + a);
	}

	public ConstructorConcept(String name, int a, double s) {
		System.out.println("3 parameter const..." + a + s);
	}

	public static void main(String[] args) {
//FOR EXPLATION PURPOSE
//for const.. no need to write c (reference variable)
//it decide at compile time which const.. to be called a/c to what we are passing
		ConstructorConcept c = new ConstructorConcept("tom", 10, 12.89);
		c.name = "tom";// here we are assigning
		c.id = 10;
		c.salary = 12.89;
		System.out.println(c.name + c.id + c.salary);
		ConstructorConcept c1 = new ConstructorConcept("diya", 10);
		System.out.println(c1.name + c1.id);

//so many objects are created but doesn't assigned the value.so there is need to restrict the object creation.we have to
//restrict the object creation.we have free allowed anyone to create object without restriction.these all objects are not 
//eligible for GC (as) they have reference.In this way,we are giving provision to the end user/caller user to create 
//object unnecessary .this we can restrict through const..----this is the purpose of const.

		ConstructorConcept c2 = new ConstructorConcept(10);
		System.out.println(c2.id);
//	ConstructorConcept c3 = new ConstructorConcept();
//	ConstructorConcept c4 = new ConstructorConcept();
//	ConstructorConcept c5 = new ConstructorConcept();
		new ConstructorConcept();// it will call default const..., but this object is eligible for GC
//	ConstructorConcept c7 = new ConstructorConcept();
//	ConstructorConcept c8 = new ConstructorConcept();

	}

}

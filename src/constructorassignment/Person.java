package constructorassignment;

//if we write any business logic inside the const.. it will executed every time unnecessary as soon as objected is created
public class Person {
	String name;
	int age;
	char gender;
	double height;

	public Person(String name, int age, char gender, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}

	public static void main(String[] args) {
//Create a constructor for the Person class that takes in the name, age, gender, and height as parameters and initializes the instance variables.
//Create a main method that creates two instances of the Person class using the constructor and prints out their information.
		Person p = new Person("Pooja", 32, 'F', 5.3);
		System.out.println("[ " + p.name + " , " + p.age + " , " + p.gender + " , " + p.height + " ]");

		Person p1 = new Person("Priya", 30, 'F', 5.4);
		System.out.println("[ " + p1.name + " , " + p1.age + " , " + p1.gender + " , " + p1.height + " ]");
//1--What is the purpose of a constructor in Java?
//a)initialize the class variable     b)restrict the unnecessary object creation
//2--How does a constructor differ from a regular method in Java?
//regular method contains business logic and it can return	
//3--Can a Java class have multiple constructors? If so, how are they differentiated?
//yes,concept is called constructor overloading,by passing different parameters
//4--What happens if a constructor is not defined in a Java class?
// If you don’t implement any constructor in your class, the Java compiler inserts default constructor into your code on your behalf. You will not 
//see the default constructor in your source code (the .java file) as it is inserted during compilation and present in the bytecode (.class file).
//5--Can a constructor call other methods or constructors within the same class?

	}

}

package javatopics;

public class user {
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		user u1 = new user();
		u1.name = "Pooja";
		u1.age = 32;
		u1.city = "Muzaffarnagar";

		user u2 = new user();
		u2.name = "Ayushi";
		u2.age = 28;
		u2.city = "Ghaziabad";

		user u3 = new user();
		u3.name = "Siya";
		u3.age = 25;
		u3.city = "Noida";

		user u4 = new user();
		u4.name = "Chhavi";
		u4.age = 21;
		u4.city = "Meerut";
		System.out.println(" [ " + u1.name + " , " + u1.age + " , " + u1.city + " ] ");
		System.out.println(" [ " + u2.name + " , " + u2.age + " , " + u2.city + " ] ");
		System.out.println(" [ " + u3.name + " , " + u3.age + " , " + u3.city + " ] ");
		System.out.println(" [ " + u4.name + " ,  " + u4.age + " , " + u4.city + " ] ");
		System.out.println("--------");
		u1 = u2;
		System.out.println(" [ " + u1.name + " , " + u1.age + " , " + u1.city + " ] ");// A
		System.out.println(" [ " + u2.name + " , " + u2.age + " , " + u2.city + " ] ");// A
		System.out.println(" [ " + u3.name + " , " + u3.age + " , " + u3.city + " ] ");// S
		System.out.println(" [ " + u4.name + " ,  " + u4.age + " , " + u4.city + " ] ");// C
		System.out.println("--------");
		u2 = u3;
		System.out.println(" [ " + u1.name + " , " + u1.age + " , " + u1.city + " ] ");// A
		System.out.println(" [ " + u2.name + " , " + u2.age + " , " + u2.city + " ] "); // S
		System.out.println(" [ " + u3.name + " , " + u3.age + " , " + u3.city + " ] "); // S
		System.out.println(" [ " + u4.name + " ,  " + u4.age + " , " + u4.city + " ] ");// C
		System.out.println("--------");
		u3 = u4;
		System.out.println(" [ " + u1.name + " , " + u1.age + " , " + u1.city + " ] "); // A
		System.out.println(" [ " + u2.name + " , " + u2.age + " , " + u2.city + " ] "); // S
		System.out.println(" [ " + u3.name + " , " + u3.age + " , " + u3.city + " ] "); // C
		System.out.println(" [ " + u4.name + " ,  " + u4.age + " , " + u4.city + " ] ");// C
		System.out.println("--------");
		u4 = u1;
		System.out.println(" [ " + u1.name + " , " + u1.age + " , " + u1.city + " ] ");// A
		System.out.println(" [ " + u2.name + " , " + u2.age + " , " + u2.city + " ] ");// S
		System.out.println(" [ " + u3.name + " , " + u3.age + " , " + u3.city + " ] "); // C
		System.out.println(" [ " + u4.name + " ,  " + u4.age + " , " + u4.city + " ] ");// A
		System.out.println("--------");
//pooja is now eligible for GC as it doesn't have any reference 

//this concept is called OBJECT EXCHANGE/OBJECT REFERENCE EXCHANGE/OBJECT REFERNCE 
//ASSIGNMENT FROM ONE TO ANOTHER REFERENCE ,IT IS ALSO CALLED CALL BY VALUE 

	}

}

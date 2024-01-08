package javatopics;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsInJava {
//global variable
	String name;

//types of methods:
//if a method is void -it doesn't return any value
// it doesn't matter how many methods that have we created --we need to call 
//1)NO INPUT NO RETURN
	public void test() {// 0 parameter--no input
		System.out.println("test method");
	}

//2)NO INPUT BUT SOME RETURN	
//void & return can not be together
	public int getinfo() {
		System.out.println("get info method");
		int a = 10;
		int b = 34;
		int c = a + b;
		// System.out.println(c);//it become hard code return 30--always shows 30--as no
		// return--no manipulation is possible
//we can't use this method for other values or argument as having hard code /predefined values.
		return c;
	}
//advantage of return--manipulation is possible after calling and storing it in another variable.

	public String getname() {
		System.out.println("get name method");
		String name = "Pooja";
		return name;
	}

	public String getEmpName() {
		System.out.println("get Emp Name...");
		String e1 = "Pooja";
		String e2 = "Khatiyan";
		// return e1;
		// return e2;
		return e1 + e2;// we are returning single concatenated value here---to resolve it we can also
						// use concept of array
//it is not possible/allowed function cannot return multiple values --it return always & always 1 value
//you decide which value you want to return e1/e2.
	}

//here we are returning only one entity/reference	
	public ArrayList<String> getempname() {
		System.out.println("GET EMP NAMES....");
		String E = "Pooja";
		String E1 = "Shiva";
		String E2 = "Rekha";
		String E3 = " Vihan";
		ArrayList<String> emplist = new ArrayList<String>();
		emplist.add(E);
		emplist.add(E1);
		emplist.add(E2);
		emplist.add(E3);
		return emplist;
	}

//only one entity or string[] we are returning in that array having 2 values
	public String[] getEmployees() {
		System.out.println("get employee method....");
		String emp[] = { "Riya", "Siya", "Diya" };
		return emp;

	}

//3)SOME INPUT/SOME RETURN
//this methods are called calling a function/method by passing the value/argument
	public int sum(int a, int b) {// 2 parameter
		System.out.println("sum");
		int total = a + b;
		return total;
	}

	public int sub(int a, int b) {
		System.out.println("sub method...");
		int sub = a - b;
		return sub;
	}

	public int mul(int a, int b) {
		System.out.println("multiplication method");
		int mul = a * b;
		return mul;
	}

//for tax we can maintain switchcase a/c to different country
	public float getBillAmount(int foodBill, int drinkBill, float Tax) {
		System.out.println("Total Bill Amount...");
		float totalBill = foodBill + drinkBill + Tax;
		return totalBill;
	}

//here we are not using handwriting marks then why we are passing it in parameter-- this is bad way of creating a method.
	public int calculateMarks(int subjectMarks, int attendence, int handwriting) {
		System.out.println("Total Subject Marks...");
		int totalMarks = subjectMarks + attendence;
		return totalMarks;
	}

//object can hold object array but if we are declaring object array using object array is good practice
	public Object[] getEmpInfo() {
		Object empInfo[] = { "Shelly", 26, true, 'f', "21-05-90" };
		return empInfo;
	}

//JVM understand only main method to use these method we have to call them through object creation of that class
//without main method we can't execute these methods...
	public static void main(String[] args) {
//PURPOSE OF MAIN METHOD:-
//1)it is a caller method.
//2)it doesn't have / contain any business logic.
//3)it is behaving like a user method/like a user---it should behave like a caller/user.

//to call the method --we have to create the object of the class.--here class name is "MethodsInJava"		
		MethodsInJava obj = new MethodsInJava();
//Object cannot hold any main method or static method--it always hold non-static properties
//RHS is an object --- "obj" is object reference variable
//to call non-static method object creation is mandatory
		// obj.test();
		obj.name = "Tom";
		obj.test();
		//obj.getinfo();
		System.out.println("--------");
//whenever we are calling a specific function--if this function is giving me something then we have to store it 
//in a same type of variable.if we write any different data type it will give as type mismatch error.	
		int g = obj.getinfo();
		System.out.println(g);
		obj.getname();
//obj.getinfo(c);//the scope of 'c' is limited to within get info method,we can't call it in  main method
		System.out.println(g + 100 - 686 + 798); // we are not calling the function here only we are using it.
		System.out.println(g);
//if we had store a method in a variable,then there is no need to call it again & again we can directly use that variable.		
//calling function again and impact performance.
//return type is depend on exactly what you are returning.
		String n = obj.getname();
		System.out.println(n + " Khatiyan");
//we can not return multiple values from the method--as it is not possible		
		obj.getEmpName();
		ArrayList<String> elist = obj.getempname();
		System.out.println("Total Emp" + " "+ elist.size());
		System.out.println(elist);
System.out.println("----------");
		String[] emp = obj.getEmployees();
		System.out.println(emp.length);
		System.out.println(Arrays.toString(emp));
//DIFFERENCE BETWEEN PARAMETER & ARGUMENTS
//>--when we declare at the method level/function level a,b are parameter,but
//>--when we call that function & that time we are passing the actual values these values are called argument/values

		int s = obj.sum(10, 20);// it always follow the exact sequence 1 to 1 mapping
		System.out.println(s);
//we can call a method n no of times--allowed	
		int u = obj.sum(88, 22);
		System.out.println(u);
float finalBill = obj.getBillAmount(100, 670, 2.1f);
//discount may differ depending upon coupon code so it should not be written inside the method,here we can do manipulation.
//whatever parameter we are passing should be used in our calculation or business logic
System.out.println(finalBill - 50);
System.out.println(obj.name);//to call variable

	}

}

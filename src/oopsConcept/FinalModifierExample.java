package oopsConcept;

public class FinalModifierExample {
//Static-- common value for all the object it has different concept in memory also.
//final-- to provide constant value--once it declare it cannot be changed,when it is final some initial value we
//have to given like [wheels=4]
	public static void main(String[] args) {
		final int daysofweek = 7;// to restrict change by somebody we used final modifier else complete logic
									// will get wrong
		int salary = daysofweek * 800;
		System.out.println(salary);
//static int  a= 10; Illegal modifier for parameter a; only final is permitted
//static modifier is not applicable for local variables only for class/global variable
//where as final is applicable for both local and final variable		

	}

}

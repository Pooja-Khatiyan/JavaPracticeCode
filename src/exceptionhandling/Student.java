package exceptionhandling;

//IMPORTANT INTEVIEW QUESTION
public class Student {
	public int getMarks(String StudentName) {
		System.out.println("getting marks for student: " + StudentName);
		if (StudentName.equals("Ravi")) {
//in one condition only finally is not executed--we have to write inside it only becz our conditions are written inside it
			System.exit(0); // shout down the jvm completely nothing will execute now
//as condition satisfied jvm come inside it--this statement shout down the jvm-- only & only if
//jvm come inside it --in Ravi case only

			try {
				int i = 9 / 0;
				// int i =9/3;//now still it return 75 ,preference is always to finally return
				return 100;
				// return i;//return only 75 ,all conditions are written for ravi only --try
				// catch finally
			} catch (ArithmeticException e) {
				System.out.println("AE is coming...");
				e.printStackTrace();
				return 50;// this 50 is upgraded by finally 75-if there is return in finally then
							// preference is given to that only
			} finally {
				System.out.println("FAIL");
				return 75;// if we comment it out in that case it will return 50 i.e catch block return
							// value
			}

		} else if (StudentName.equals("Karan")) {// it doesn't go inside if part so it return it's value only
			return 90;
		} else if (StudentName.equals("Kavya")) {
			return 80;
		} else {
			System.out.println("plz pass the right student name...");
			throw new AppException("STUDENT NOT FOUND");
		}

	}

	public static void main(String[] args) {
		Student s = new Student();
		int mk = s.getMarks("Ravi");
		System.out.println(mk);
	}

}

package javatopics;

//WAF:return student marks
//function name:getStudentMarks(String StName)
//return:marks(int)
public class student {
//multiple return
	public int getStudentMarks(String studentName) {
		System.out.println("getting marks for student: " + studentName);

		if (studentName.equals("sarika")) {
			return 90;
		} else if (studentName.equals("rahul")) {
			return 98;
		} else if (studentName.equals("shubhra")) {
			return 100;
		} else if (studentName.equals("naveen")) {
			return 0;
		} else {
			System.out.println("please pass the right student name..." + studentName);
			return -1;
		}}	
//more optimized code with single return
		public int getMarks(String StudentName) {
			System.out.println("getting marks for student: " + StudentName);
			int marks = -1 ;
		if(StudentName.equals("sarika")) {
			marks=90;
		}else if(StudentName.equals("rahul")) {
			marks=78;	}
		else if(StudentName.equals("shubhra")) {
			marks=100;	}
		else if(StudentName.equals("naveen")) {
			marks=0;}
		else {
			System.out.println("please pass the right student name... " + StudentName);
		}
			return marks;
			}
	

	public static void main(String[] args) {
		student st = new student();
		int stMarks = st.getStudentMarks("rahul");
		System.out.println(stMarks);
		if(stMarks>=0) {
			System.out.println("print the mark sheet");
		}
		System.out.println("-----");
		int marks = st.getMarks("naveen");
		System.out.println(marks);
		
	}

}

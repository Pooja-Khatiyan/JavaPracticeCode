package dataconversion;

public class WrapperClassConcept {
//Wrapper classes are use to convert String to different data types & vice-versa.
	public static void main(String[] args) {
String si = "100";
System.out.println(si+10);
int i = Integer.parseInt(si);
System.out.println(i+10);	

String sd = "12.90";
System.out.println(sd+10);
double d = Double.parseDouble(sd);
System.out.println(d+10);
//checking while running test cases on cloud		
String RemoteExecution ="true";
boolean flag = Boolean.parseBoolean(RemoteExecution);
System.out.println(flag);
if (flag) {
	System.out.println("run the test cases on AWS cloud");
}else{
	System.out.println("run the test cases on local");
	}

//int to String

int age = 100;
String ageval = String.valueOf(age); 
System.out.println(ageval+100);
System.out.println(ageval.length());

double sal = 12.99;
String salval = String.valueOf(sal);
System.out.println(salval + 100);

System.out.println("------------");
String a = "100A";
try {
int A = Integer.parseInt(a);
System.out.println(A);
}catch(Exception e) {
	System.out.println("Number Format Exception is coming...");
	e.printStackTrace();
}
System.out.println("-------------");
//String is separated & converted into int
String b ="100Test";//same exception 
String sub = b.substring(0, 3);
int B = Integer.parseInt(sub);
System.out.println(B+100);
//Wrapper class also helps in determining the range of different data type
System.out.println(Byte.MIN_VALUE);
System.out.println(Byte.MAX_VALUE);
System.out.println(Short.MIN_VALUE);
System.out.println(Short.MAX_VALUE);
System.out.println(Integer.MIN_VALUE);
System.out.println(Integer.MAX_VALUE);
System.out.println(Long.MIN_VALUE);
System.out.println(Long.MAX_VALUE);
System.out.println(Float.MIN_VALUE);
System.out.println(Float.MAX_VALUE);
System.out.println(Double.MIN_VALUE);
System.out.println(Double.MAX_VALUE);









		
		
		
		
		
		
	}

}

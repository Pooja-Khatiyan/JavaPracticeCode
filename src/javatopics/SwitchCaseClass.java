package javatopics;

public class SwitchCaseClass {

	public static void main(String[] args) {
// example of launching cross browser testing
		String browser = "pooja";
//here we are passing browser as string ,then cases should also be in string format.		
//all this are not condition what ever we write it directly jump to that case and execute, after that it jump out of it
//if we are not defining break in that case it jump to immediate case execute it  and come out of it when break is define.
//if we write safari it directly jump to that case ,it doesn't enter above cases it is not like loop,it directly point
//to specific case.
		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "edge":
			System.out.println("launch edge");
			break;

		default:
			System.out.println("plz pass  the right browser: " + browser);
			// break; //importance of this break
//after default we can also write the cases but it doesn't look good in case we have predefine cases and conditions.
		case "opera":
			System.out.println("launch opera");
			break;
		}

		// --------------------------------------------------//

//allowed data types---byte,short,int,String,char
//not allowed data types--- long,float,double,boolean
//switch case is not at all applicable here
//it is boolean (if we are using any comparison operator in case)not allowed,conditions are not allowed ,syntax error 
//along with case it is not allowed to write some condition	/boolean conditions in the case directly not allowed			
//marks are in int format then case should also be in int format, 

		char ch = 'a';
		switch (ch) {
		case 'a':
			System.out.println((int) ch);
			break;
		default:
			break;
		}

		char ch1 = 'A';
		switch (ch1) {
		case 'A':
			System.out.println(ch1);
		default:
			break;
		}

		int marks = 100;
		switch (marks) {
		case 100:
			System.out.println("eligible for scholarship");
		default:
			break;
		}

//----------------------------------------------//
//boolean marks = true;
//switch(marks) {
//case true :
//	System.out.println("true");
//	default:
//		break;
//}

//------------------vowel program----------------//
//switch is case sensitive
//famous interview ques
//on the basis of key value it switch

		char ch2 = 'I';
		switch (ch2) {
		case 'A':
			System.out.println(ch2 + " is a vowel");
			break;
		case 'E':
			System.out.println(ch2 + " is a vowel");
			break;
		case 'I':
			System.out.println(ch2 + " is a vowel");
			break;
		case 'O':
			System.out.println(ch2 + " is a vowel");
			break;
		case 'U':
			System.out.println(ch2 + " is a vowel");
			break;
		case 'a':
			System.out.println(ch2 + " is a vowel");
			break;
		case 'e':
			System.out.println(ch2 + " is a vowel");
			break;
		case 'i':
			System.out.println(ch2 + " is a vowel");
			break;
		case 'o':
			System.out.println(ch2 + " is a vowel");
			break;
		case 'u':
			System.out.println(ch2 + " is a vowel");
			break;
		default:
			System.out.println(ch2 + " is a consonent");
			break;
		}
//on char we can't able to apply toLowerCase()

//------------------------------------------------//
//more optimize code for cross platform launching
//key value is case sensitive 
// toLowerCase is only applicable for String
		String Browser = "  firefox   ";
		int version = 12;
		switch (Browser.toLowerCase().trim()) {
		case "chrome":
			if (version == 12) {
				System.out.println("give permission and launch chrome");
			} else {
				System.out.println("deny permission");
			}
			//System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		default:
			System.out.println("plz pass  the right browser: " + browser);
		case "opera":
			System.out.println("launch opera");
			break;
		}
		System.out.println("----------------------------------------------------------------");

// real time example of switches
// cross browser logic
//user acess based permission : RBAC(role base access control)---Admin user/Seller user/vendor user/customer user/distributor user
//multi environment execution: dev/qa/stage/uat/prod
//payment options:credit card/UPI/Debit card/mobile app/online app/COD
//lang cases:english,arabic,hindi
// cross platform/OS:mac machine ,windows,android,Linux,ios
//web page:categories :like electronics,fashion,decoration		

	}
}

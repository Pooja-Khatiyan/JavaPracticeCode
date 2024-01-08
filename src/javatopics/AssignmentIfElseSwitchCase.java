package javatopics;

public class AssignmentIfElseSwitchCase {

	public static void main(String[] args) {
//Find out the greatest number out of four different given numbers:

		byte w = 25, x = 78, y = 87, z = 97;
		if (w > x && w > y && w > z) {
			System.out.println("The Greater: " + w);
		} else if (x > y && x > z) {
			System.out.println("The Greater: " + x);
		} else if (y > z) {
			System.out.println("The Greater: " + y);
		} else {
			System.out.println("The Greater: " + z);
		}
		System.out.println("--------------------------------------------------");

//Write a Java program to test a number is positive or negative:
		int number = 0;
		if (number > 0) {
			System.out.println("Positive Number : " + number);
		} else if (number < 0) {
			System.out.println("Negative Number : " + number);

		} else {
			System.out.println("NEITHER POSITIVE NOR NEGATIVE");
		}

		System.out.println("-----------------------------------");

//WAP to check number is odd or even using If - Else
		int NUMBER = 0;
		if (NUMBER == 0) {
			System.out.println("Neither Even Nor Odd");
		} else if (NUMBER % 2 == 0) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is Odd");
		}

		System.out.println("-----------------------------------");
//WAP to check given alphabet character is Vowel or Consonant using Switch - Case
		char ch = 'e';
		switch (ch) {
		case 'a': {
			System.out.println(ch + " is a vowel");
		}
			break;
		case 'e': {
			System.out.println(ch + " is a vowel");
		}
			break;
		case 'i': {
			System.out.println(ch + " is a vowel");
		}
			break;
		case 'o': {
			System.out.println(ch + " is a vowel");
		}
			break;
		case 'u': {
			System.out.println(ch + " is a vowel");
		}
			break;
		case 'A': {
			System.out.println(ch + " is a vowel");
		}
			break;
		case 'E': {
			System.out.println(ch + " is a vowel");
		}
			break;
		case 'I': {
			System.out.println(ch + " is a vowel");
		}
			break;
		case 'O': {
			System.out.println(ch + " is a vowel");
		}
			break;
		case 'U': {
			System.out.println(ch + " is a vowel");
		}
			break;
		default: {
			System.out.println(ch + " is a cosonant");
		}
			break;
		}

		System.out.println("----------------------------------------------------");
//WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod using using Switch - Case		
		String environment = "pooja";
		switch (environment.toLowerCase().trim()) {
		case "qa": {
			System.out.println("launch qa environment");
		}
			break;
		case "stage": {
			System.out.println("launch stage environment");
		}
			break;
		case "dev": {
			System.out.println("launch dev environment");
		}
			break;
		case "uat": {
			System.out.println("launch uat environment");
		}
			break;
		case "prod": {
			System.out.println("launch prod environment");
		}
			break;
		default: {
			System.out.println("plz select the right input " + environment);
		}
			break;
		}

		System.out.println("----------------------------------------------------");
//WAP to book the specific type of car from the Uber app using Switch - Case. 
//1---Car Type: Mini, Sedan, SUV, Premium
//2---If user passes wrong car type, print please select the right car type		

		String cartype = "mini";
		switch (cartype.toLowerCase().trim()) {
		case "mini": {
			System.out.println("car is booked: " + cartype);
		}
			break;
		case "sedan": {
			System.out.println("car is booked: " + cartype);
		}
			break;
		case "suv": {
			System.out.println("car is booked: " + cartype);
		}
			break;
		case "premium": {
			System.out.println("car is booked: " + cartype);
		}
			break;

		default: {
			System.out.println("plz select the right car: " + cartype);
		}
			break;
		}
		System.out.println("-------------------------------------------");
//WAP to launch browsers using If-ElseIf and Switch Case.
//1---Browser: Chrome/Firefox/IE/Safari
//2----If user passes wrong browser, print please pass the right browser name	
		String Browser = "  CHROME   ";
		int version = 12;
		switch (Browser.toLowerCase().trim()) {
		case "chrome":
			if (version == 12) {
				System.out.println("give permission and launch browser");
			} else {
				System.out.println("deny permission");
			}
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
			System.out.println("plz pass  the right browser name: " + Browser);
		case "opera":
			System.out.println("launch opera");
			break;
		}

		System.out.println("-----------------------------------------------------------------------------");
//more optimize code
		String browser = " opera  ";
		int Version = 17;
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			if (Version == 12) {
				System.out.println("give permission and launch " + browser);
			} else {
				System.out.println("deny permission for" + browser + Version);
			}
			break;
		case "firefox":
			if (Version == 14) {
				System.out.println("give permission and launch" + browser);
			} else {
				System.out.println(" deny permission" + browser + Version);
			}
			break;
		case "safari":
			if (Version == 13) {
				System.out.println("give permission and launch" + browser);
			} else {
				System.out.println(" deny permission" + browser + Version);
			}
			break;
		case "edge":
			if (Version == 12) {
				System.out.println("give permission and launch" + browser);
			} else {
				System.out.println(" deny permission" + browser + Version);
			}
			break;
		case "opera":
			if (Version == 17) {
				System.out.println("give permission and launch" + browser);
			} else {
				System.out.println(" deny permission" + browser + Version);
			}
			break;
		default:
			System.out.println("plz pass  the right browser: " + browser);
			break;
		}
//WAP to define the interest rate on the basis of Loan type using Switch Case
//1----Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
//2----For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan	

		String LoanType = " home loan ";
		int Salary = 40000;
		double InterestRate;
		switch (LoanType.toLowerCase().trim()) {
		case "personal loan":
			InterestRate = 12.5;
			break;
		case "car loan":
			InterestRate = 8.5;
			break;
		case "education loan":
			InterestRate = 8.0;
			break;
		case "home loan":
			if (Salary < 35000)
				System.out.println("not applicable for housing loan");
			else
				InterestRate = 7.35;
			return;

		default:
			System.out.println("INVALID CHOICE. PLEASE SELECT A VALID OPTION.");
			return;
		}
		System.out.println("Interest for your " + LoanType + " is " + InterestRate + "%");

	}
}

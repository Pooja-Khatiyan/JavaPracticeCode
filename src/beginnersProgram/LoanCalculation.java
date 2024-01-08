package beginnersProgram;

public class LoanCalculation {

	public static void main(String[] args) {
//WAP to define the interest rate on the basis of Loan type using Switch Case
//1----Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
//2----For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan	
		String LoanType = "Housing Loan";
		double Salary = 35000;
		double InterestRate;
		switch (LoanType) {
		case "Housing Loan":
			if (Salary < 35000) {
				System.out.println("NOT APPLICABLE FOR Housing Loan");
				return;
			}

			else {
				InterestRate = 9;
				System.out.println("Interest Rate for Housing Loan :" + InterestRate);
			}
			break;

		case "Car Loan":
			InterestRate = 8;
			System.out.println("Interest Rate for Car Loan :" + InterestRate);
			break;
		case "Personal Loan":
			InterestRate = 14;
			System.out.println("Interest Rate for Personal Loan :" + InterestRate);
			break;
		case "Education Loan":
			InterestRate = 11;
			System.out.println("Interest Rate for Education Loan :" + InterestRate);
			break;
		default:
			System.out.println("Please Enter Correct Loan Type... ");
			break;
		}
	}

}
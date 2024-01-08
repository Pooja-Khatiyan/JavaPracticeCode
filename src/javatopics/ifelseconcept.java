package javatopics;

public class ifelseconcept {

	public static void main(String[] args) {

		int marks = 25;

		if (marks > 100 || marks < 0) {
			System.out.println("INCORRECT MARKS");
		}

		else {
			if (marks == 100) {
				System.out.println("ELIGIBLE FOR SCHOLARSHIP");

				if (marks >= 90) {
					System.out.println("GRADE A");
				}
			} else {
				System.out.println("MARKS ARE LESS THAN 90");
				if (marks >= 80) {
					System.out.println("GRADE B");
				} else {
					System.out.println("MARKS ARE LESS THAN 80");
					if (marks >= 70) {
						System.out.println("GRADE C");
					} else {
						System.out.println("FAIL");
						if (marks <= 35) {
							System.out.println("GRADE F & VERY POOR");
						}
					}
				}
			}

		}

	}
}

package basicprogram;

public class PrimeNumbers {

	public static void main(String[] args) {
		int comma = 0;
		for (int i = 0; i <= 100; i++) {
			int count = 0;

			if (i <= 1) {
			} else {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						count = count + 1;
					}
				}
				if (count == 0) {

					if (comma == 0) {
						System.out.print(i);
						comma++;
					} else {
						System.out.print("," + i);
					}

				}
			}

		}

	}

}

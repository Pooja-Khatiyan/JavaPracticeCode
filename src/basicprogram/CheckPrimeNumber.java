package basicprogram;

public class CheckPrimeNumber {

	
		public static void main(String[] args) {
			int n = 27;
			int count = 0;
			for (int i = 2; i <= n - 1; i++) {
				if (n % i == 0) {
					count = count + 1;//0+1=1, 1+1=2 ,
					//break;
				}
			}
			if (count > 0) {
				System.out.println("NOT A PRIME NUMBER: " + " " + n + " ," + count );
			} else {
				
				System.out.println("IS A PRIME NUMBER: " + " " + n);
			}
	}

}

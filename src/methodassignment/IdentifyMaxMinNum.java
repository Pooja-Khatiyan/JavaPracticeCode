package methodassignment;

public class IdentifyMaxMinNum {
	public void maxNum(int a, int b, int c) {
		int max = Math.max(Math.max(a, b), c);
		System.out.println("Maximum Number Is: " + max);
	}

	public void minNum(int a, int b, int c) {
		int min = Math.min(Math.min(a, b), c);
		System.out.println("Minimum Number Is: " + min);
	}

	public static void main(String[] args) {
// Define two methods to print the maximum and the minimum number respectively among 
//three numbers entered by user.
		IdentifyMaxMinNum obj = new IdentifyMaxMinNum();
		obj.maxNum(10, 20, 30);
		obj.minNum(90, 70, 10);

	}

}

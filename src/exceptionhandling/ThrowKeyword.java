package exceptionhandling;

public class ThrowKeyword {
//Throw keyword is use for custom exception/we use it if we deliberately want to throw exception
//USE CASE 
//default case:throw new exception
//else part: throw new exception
	
	public static void main(String[] args) {
		String url = null;//deliberately defined null doesn't go to ellse part  
		if (url == null) {
			try {
				throw new Exception("URL IS NULL");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}else {
			System.out.println("enter url in browser...");
		}

	}

}

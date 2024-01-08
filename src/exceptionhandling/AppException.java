package exceptionhandling;

public class AppException extends RuntimeException{
//creating exception without try catch just by class by extending it with run time exception
	public AppException (String msg) {
		super(msg); 
	}
}

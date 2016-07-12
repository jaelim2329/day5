package exception;

public class BadMonthException extends Exception {
	
	public BadMonthException(){
		super();
	}
	
	public BadMonthException(Throwable cause){
		super(cause);
	}
	
	public BadMonthException(String message){
		super(message);
	}
	
	public BadMonthException(String message, Throwable cause){
		super(message, cause);
	}

}

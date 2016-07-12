package exception;

public class BadDayException extends Exception {
	
	public BadDayException(){
		super();
	}
	
	public BadDayException(String message, Exception throwable){
		super(message, throwable);
	}
	public BadDayException(Exception cause){
		super(cause);
	}
}

package younus.attari.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class NotEligibleException extends RuntimeException{


	public static final long serialVersionUID=1L;
	
	private String errorCode;
	private String message;
	
	public NotEligibleException(){
		super();
	}
	
	public NotEligibleException(String message) {
		super(message);
		this.message = message;
	}

	public NotEligibleException(String errorCode,String message){
		super(message);
		this.errorCode = errorCode;
	}
	
	
	public String getErrorCode(){
		return errorCode;
	}
	
	public String getMessage(){
		return message;
	}
	
	public static String getStack(){
		StackTraceElement trace []= Thread.currentThread().getStackTrace();
		return trace[2].getFileName()+"...."+trace[2].getClassName()+"...."+trace[2].getMethodName()+"...."+trace[2].getLineNumber()+"-->";
	}
	
	public static String getStack(Throwable e){
		StackTraceElement[] trace = Thread.currentThread().getStackTrace();
		return trace[2].getFileName()+"...."+trace[2].getClassName()+"...."+trace[2].getMethodName()+"...."+trace[2].getLineNumber()+"....."+e.getMessage();
	}
	
}

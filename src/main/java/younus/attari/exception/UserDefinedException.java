package younus.attari.exception;

public class UserDefinedException extends RuntimeException {


	public static final long serialVersionUID = 1L;
	
	private String errorCode, message;

	public UserDefinedException(String message) {
		super(message);
		this.message = message;
	}

	public UserDefinedException(String message, String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getMessage() {
		return message;
	}
	
	public String getTrace(){
		StackTraceElement[]  stack = Thread.currentThread().getStackTrace();
		return stack[4].getFileName()+"....."+stack[4].getClassName()+"....."+stack[4].getMethodName();
	}
	
	public String getTrace(Throwable t){
		StackTraceElement[]  stack = Thread.currentThread().getStackTrace();
		return stack[4].getFileName()+"....."+stack[4].getClassName()+"....."+stack[4].getMethodName()+"......"+t;
	}
}

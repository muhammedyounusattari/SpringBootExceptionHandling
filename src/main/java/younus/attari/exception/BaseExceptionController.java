package younus.attari.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import younus.attari.common.CommonUtils;
import younus.attari.common.ReturnResponse;

@ControllerAdvice
public class BaseExceptionController {

	@ExceptionHandler(value = UserDefinedException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ReturnResponse getFirstExceptionHandled(UserDefinedException e) {
		System.out.println("Inside getFirstExceptionHandled....");
		return CommonUtils.getHttpStatusResponse("ERR-MYCOMP-60008", HttpStatus.BAD_REQUEST, null, 
				"ERR-MYCOMP-60008");
	}
}

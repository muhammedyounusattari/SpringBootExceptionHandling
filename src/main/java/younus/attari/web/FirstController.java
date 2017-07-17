package younus.attari.web;

import org.springframework.web.bind.annotation.RequestMapping;

import younus.attari.constant.ExceptionHandlingURIConstants;

@RequestMapping(value="/home")
public interface FirstController {

	@RequestMapping(value="/first")
	public String firstRequest();
}


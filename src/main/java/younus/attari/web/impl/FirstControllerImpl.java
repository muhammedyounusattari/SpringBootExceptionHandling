package younus.attari.web.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import younus.attari.service.FirstService;
import younus.attari.web.FirstController;

@RestController
public class FirstControllerImpl implements FirstController {

	@Autowired
	private FirstService firstService;
	
	public String firstRequest()  {
		System.out.println("ths is from first....");
		firstService.firstServiceRequest();
		return "Hello...";
	}

}

package younus.attari.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import younus.attari.dao.FirstDAO;
import younus.attari.exception.UserDefinedException;
import younus.attari.service.FirstService;

@Service
public class FirstServiceImpl implements FirstService {

	@Autowired
	private FirstDAO firstDAO;
	
	@Override
	public String firstServiceRequest() {
			System.out.println("this is from firstServiceRequest...");
			firstDAO.firstDAORequest();
			System.out.println("before exception...");
			throw new UserDefinedException("Exception occured");
	}

}

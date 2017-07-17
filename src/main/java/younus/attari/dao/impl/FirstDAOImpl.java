package younus.attari.dao.impl;

import org.springframework.stereotype.Repository;

import younus.attari.dao.FirstDAO;
import younus.attari.exception.UserDefinedException;

@Repository
public class FirstDAOImpl implements FirstDAO {

	@Override
	public String firstDAORequest() {
		System.out.println("this is firstDAORequest....");
		//if(true)
			//throw new UserDefinedException("this is from UserDefined....");
		return null;
	}

}

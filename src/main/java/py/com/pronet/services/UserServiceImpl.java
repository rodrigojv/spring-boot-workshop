package py.com.pronet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.expression.*;
import org.springframework.expression.spel.standard.*;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import py.com.pronet.entities.User;
import py.com.pronet.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public List<User> findAll() {
		return userRepo.findAll();
	}

	//Método intencional para security alert del Sonarqube
	public void parseExpressionInterface(User personObj,String property) {

        	ExpressionParser parser = new SpelExpressionParser();

	        //Unsafe if the input is control by the user..
	        Expression exp = parser.parseExpression(property+" == 'Albert'");

	        StandardEvaluationContext testContext = new StandardEvaluationContext(personObj);
	        boolean result = exp.getValue(testContext, Boolean.class);
	}
	
}

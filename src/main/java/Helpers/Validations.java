package Helpers;

import java.util.Set;

import org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator;

import Models.User;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;

public class Validations {

	Set<ConstraintViolation<User>> errors;
	
	
	public boolean validation(User user) {
		
		//Validate the model user
		Validator factory =  Validation.byDefaultProvider()
			    .configure()
			    .messageInterpolator(new ParameterMessageInterpolator())
			    .buildValidatorFactory()
			    .getValidator();

		   errors = factory.validate(user);
		   
		   if (errors.isEmpty()) {
		      return true;
		   }
		   return false;
	}

	public Set<ConstraintViolation<User>> getErrors() {
		return errors;
	}


	
}

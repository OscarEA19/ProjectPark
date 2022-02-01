package Models;

import java.util.Set;

import org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;


public class DELETEME {

	public void delete(){
		
		User user = new User();
		user.setDniPerson(1234567);
		Validator factory =  Validation.byDefaultProvider()
			    .configure()
			    .messageInterpolator(new ParameterMessageInterpolator())
			    .buildValidatorFactory()
			    .getValidator();

		Set<ConstraintViolation<User>> errors = factory.validate(user);
		
		for (ConstraintViolation<User> error : errors) {
		      System.out.println(error.getMessage());
		   }
		   if (errors.isEmpty()) {
		      System.out.println("Is valid");
		   }
	}
}

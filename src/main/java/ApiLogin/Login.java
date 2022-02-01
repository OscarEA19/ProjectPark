package ApiLogin;

import Helpers.EncryptPassword;
import Helpers.Validations;
import Models.User;
import jakarta.validation.ConstraintViolation;

/**
 * No edit this class if you dont have authorization
 * 
 * 
 * 
 * 
 * Update: 31/1/2022
 * 
 * 
 * 
 * 
 * @author JGR
 *
 */
public class Login implements iLogin {

	/**
	 * Register of user
	 */
	public void register(String name, String surname, String secondSurname, int dniPerson, String password,String email, int role) {
		
		User user=new User(dniPerson, password, email, name, surname, secondSurname, true, role);
		
		Validations validateUser=new Validations();
		boolean validation=validateUser.validation(user);//Create a new condition
		
		if(!validation) {
			for(ConstraintViolation<User> error : validateUser.getErrors()) {
				System.out.println("Error: "+error.getMessage());//Return all errors
			}
		}else {
			EncryptPassword encrypt=new EncryptPassword();
			String newPassword=encrypt.encrypt(password);		//Encrypt the password
			//TODO: Create connection of the database
		}
	}
	
	public void login() {
		// TODO Auto-generated method stub
		
	}

	public void updateUser() {
		// TODO Auto-generated method stub
		
	}

	public void deleteUser() {
		// TODO Auto-generated method stub
		
	}


	

}

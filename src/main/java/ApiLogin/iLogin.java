package ApiLogin;

public interface iLogin {

	public void login();
	public void register(String name, 
				String surname,
				String secondSurname,
				int dniPerson, 
				String password, 
				String email,
				int role);
	public void updateUser();				//Interfaces of the register 
	public void deleteUser();
}

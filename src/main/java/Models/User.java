package Models;

import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class User {

	@Size(min = 9, max = 9, message = "The DNI is required")
	private int dniPerson;

	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")
	@Size(min = 8, max = 15, message = "The min characters of the password is 8 and the max is 15")
	private String password;

	@Size(min = 1, message = "The email is required")
	@Email(message = "The email is not valid")
	private String email;

	@Size(min = 3, max = 20, message = "The min characteres of the name is 3 and the max 20")
	private String name;

	@Size(min = 3, max = 20, message = "The min characteres of the surname is 3 and the max 20")
	private String surname;

	@Size(min = 3, max = 20, message = "The min characteres of the surname is 3 and the max 20")
	private String secondSurname;

	private boolean status;

	@Range(min = 1, max = 3, message = "The role name is invalid")
	private int role;

	
	
	public User() {
	}

	public User(int dniPerson, String password, String email, String name, String surname, String secondSurname,
			boolean status, int role) {
		this.dniPerson = dniPerson;
		this.password = password;
		this.email = email;
		this.name = name;
		this.surname = surname;
		this.secondSurname = secondSurname;
		this.status = status;
		this.role = role;
	}

	public int getDniPerson() {
		return dniPerson;
	}

	public void setDniPerson(int dniPerson) {
		this.dniPerson = dniPerson;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSecondSurname() {
		return secondSurname;
	}

	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

}

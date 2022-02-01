package Helpers;

import org.apache.commons.codec.digest.DigestUtils;

public class EncryptPassword {

	//This method encrypt the password
	public String encrypt(String password) {
		String encryptPassword=DigestUtils.sha512_256Hex(password);
		return encryptPassword;
	}
}

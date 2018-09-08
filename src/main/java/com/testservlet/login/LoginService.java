package com.testservlet.login;

public class LoginService {

	public boolean validate (String username, String password) {
		
		if(username.equalsIgnoreCase("Swapnil") && password.equals("swapnil10")) {
			return true;
		}
		return false ;
		
	}
}

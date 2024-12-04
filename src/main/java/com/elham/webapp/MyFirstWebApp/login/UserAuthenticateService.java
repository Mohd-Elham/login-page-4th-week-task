package com.elham.webapp.MyFirstWebApp.login;

import org.springframework.stereotype.Service;

@Service
public class UserAuthenticateService {

	public boolean authenticate(String userName, String password) {
		
		if (userName.equals("admin") && password.equals("admin123"))
		{
			return true;
		}
		else
			return false;
		
	}
}

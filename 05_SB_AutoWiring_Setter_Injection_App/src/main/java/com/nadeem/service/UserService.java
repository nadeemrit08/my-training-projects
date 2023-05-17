package com.nadeem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nadeem.dao.UserDao;
import com.nadeem.util.Demo;
import com.nadeem.util.EmailUtils;
import com.nadeem.util.PasswordUtils;

@Service
public class UserService {
	private PasswordUtils passwordUtils;
	
	private EmailUtils emailUtils;
	
	private UserDao userDao;
	
	
	
	
	
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public UserService() {
		
		System.out.println("UserService :: Constructor");
	}
	
	@Autowired
	public void setPasswordUtils(PasswordUtils passwordUtils) {
		this.passwordUtils = passwordUtils;
	}


	@Autowired
	public void setEmailUtils(EmailUtils emailUtils) {
		this.emailUtils = emailUtils;
	}



	public void registerUser() {
		passwordUtils.encryptPassword();
		userDao.save();
		emailUtils.sendEmail();
		userDao.detail();
		System.out.println("User Record Saved....");
	}
}

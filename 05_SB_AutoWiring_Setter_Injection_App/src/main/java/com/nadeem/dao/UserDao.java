package com.nadeem.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	public UserDao() {
		System.out.println("UserDao :: Constructor");
	}
	
	public void save() {
		System.out.println("Saving User Record In DB ");
	}
	
	public void detail() {
		System.out.println("Details Method In Dao Class");
	}
}

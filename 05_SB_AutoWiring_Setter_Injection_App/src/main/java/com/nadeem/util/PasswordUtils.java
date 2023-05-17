package com.nadeem.util;

import org.springframework.stereotype.Component;

@Component
public class PasswordUtils {
	public PasswordUtils() {
		System.out.println("PasswordUtils :: Constructor");
	}
	public void encryptPassword() {
		System.out.println("Encrypting Password for Registerd User....");
	}
}

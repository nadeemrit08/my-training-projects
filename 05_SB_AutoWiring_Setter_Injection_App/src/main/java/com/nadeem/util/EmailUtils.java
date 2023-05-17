package com.nadeem.util;

import org.springframework.stereotype.Component;

@Component
public class EmailUtils {
	public EmailUtils() {
		System.out.println("EmailUtils :: Constructor");
	}
	
	public void sendEmail() {
		System.out.println("Sending Emails For Registered User.....");
	}
}

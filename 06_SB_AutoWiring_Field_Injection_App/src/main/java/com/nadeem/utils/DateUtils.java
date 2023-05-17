package com.nadeem.utils;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class DateUtils {
	
	public DateUtils() {
		// TODO Auto-generated constructor stub
		System.out.println("DateUtils :: Constructor");
		
	}
	public LocalDate getDate() {
		
        
		
		LocalDate now = LocalDate.now();
		return now;
	}
}

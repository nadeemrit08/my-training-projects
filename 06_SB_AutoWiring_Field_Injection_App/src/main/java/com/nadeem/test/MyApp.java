package com.nadeem.test;

import java.lang.reflect.Field;

public class MyApp {

	public static void main(String[] args) throws Exception {
		
		//Loading class using class.forName
		Class<?> clz = Class.forName("com.nadeem.test.Demo");
	
		
		//getting field declared in class
		Field ageField = clz.getDeclaredField("age");
		
		//Making private variable accesible outside of the class also
		ageField.setAccessible(true);
		

		//Creating Onject for the class
		Object object = clz.newInstance();
		
		ageField.set(object, 30); // setting value to age variable
	
		//Getting value from the variable and printing
		System.out.println(ageField.get(object));
	}

}

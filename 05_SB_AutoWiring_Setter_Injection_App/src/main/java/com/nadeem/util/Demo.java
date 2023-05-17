package com.nadeem.util;


public class Demo {
	private Integer i;
	public Demo(Integer i) {
		this.i = i;
	}
	
	
	public static void main(String[] args) {
		Demo d = new Demo(10);
		d.setI(20);
		System.out.println(i);

	}


	private void setI(int i) {
		this.i = i;
		
	}

}

package com.nadeem;

public class Variables  
	{  
	    static int m=100;//static variable  
	    int data=50;//instance variable  
	   void method()  
	    {    
	        int n=90;//local variable   
	        System.out.println("data "+data);
	    }  
	    public static void main(String args[])  
	    {  
	         
	        System.out.println(" m "+m);
	        Variables variables =new Variables();
	        
	        variables.method();
	       
	    }  
	}

//Author:vaishnavi

package com.question1;
import java.util.Scanner;

public class ExceptionExample {

public static void main(String[] args) throws Exception {
		
		int a,b,c;
		Scanner s=new Scanner(System.in);	
	
	    System.out.println("Enter first number:");		//user input
	      a=s.nextInt();
	
	    System.out.println("Enter second number:");				
	      b=s.nextInt();
	     if(a==0 && b==0) 
	     {
		     throw new Exception("enter two numbers:");	//throwing exception because the 0 number entered
	     }
	else
	{
	    try
	    {
	      c=a/b;//performing the divide operation and throw the exception
	      
	     System.out.println("result is "+c);	//printing the result
	    }
	    catch(ArithmeticException e)
	    {
		System.out.println("performing divide by zero");
	    }
	    }			
		
	}
	

}



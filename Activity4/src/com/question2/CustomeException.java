package com.question2;
import java.util.Scanner;

class InvalidAgeWeightException extends Throwable
{
	InvalidAgeWeightException(String s)
	{
		//super(s);
	}
}

public class CustomeException {
		static String name;
	     static int age;
		 static int weight;
		 static void validation(int age, int weight) throws InvalidAgeWeightException
		{
				try {
					if(age<18)
					{
						throw new InvalidAgeWeightException("invalid age");
					}
					else
					{
						System.out.println("valid age");
					}
				}
				catch (InvalidAgeWeightException e) 
				{
					System.out.println(e);
				}
				try 
				{
					if(weight<50)
					{
						throw new InvalidAgeWeightException("invalid weight");
					}
					else
					{
						System.out.println("valid weight");
					}
				} 
				catch (InvalidAgeWeightException e)
				{
					System.out.println(e);
				}
		}
		public void display()
		{
			System.out.println();
		}
	public static void main(String[] args) throws InvalidAgeWeightException {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("enter the age:");
		int age=sc.nextInt();
		System.out.println("enter the weight:");
		int weight =sc.nextInt();
		CustomeException c=new CustomeException();
		c.display();
		c.validation(age, weight);
		
	}
}


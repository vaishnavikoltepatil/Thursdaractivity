//Author:vaishnavi
//code to display ageWeightvalidorNot
package com.question2;
import java.util.Scanner;
		 
	class InvalidAgeWeightException extends Exception
		{
			public InvalidAgeWeightException(String Str)
			{
				super(Str);
			}
		}

		public class InvalidAgeWeight {
			
			public static void main(String[] args) {
			
				int weight,age;
				Scanner sc=new Scanner(System.in);
				System.out.println("enter age");
				age=sc.nextInt();
				System.out.println("enter weight");
				weight=sc.nextInt();
				try
				{
					if(age<18 && weight<50)
					{	//throws an exception when the age is less than 18
						throw new InvalidAgeWeightException("invalid age weight exception");
					}
					else
						System.out.println("the person is eligible at age of  "+age);//check the statement for age and weight elligble or not
						System.out.println("the person is eligible at weight of"+weight);
					
				}
				catch(InvalidAgeWeightException e)
				{
					System.out.println(e);
					System.out.println("  the person is not eligible at " +age+ " and weight of"+weight);//print the result
				}
				
				}
		}
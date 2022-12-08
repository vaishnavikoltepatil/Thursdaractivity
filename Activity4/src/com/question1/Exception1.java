package com.question1;
import java.util.Scanner;
public class Exception1
 {

	public static void main(String[] args) {
					int x,y,z;
					Scanner sc=new Scanner(System.in);
							
					// input numbers 
					System.out.print("Enter 1st number : ");
					x=sc.nextInt();
					System.out.print("Enter 2nd number : ");
					y=sc.nextInt();
				try
				{
					z=x/y;
					System.out.println("The result is :"+x);//display the result 
				}
				catch(ArithmeticException e)
				{
					System.out.println("Can't be divided by Zero :"+e);
				}
	}
 }

 


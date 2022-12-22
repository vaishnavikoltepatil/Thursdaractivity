package com.question2;
import java.util.Scanner;


	class InSufficientBalancedException extends Exception		
	{

		public InSufficientBalancedException(String string)
		
		{
			
		}	
	}
	public class Account {
		int balance=0;
		float totalbalance=0;
		float amount;
		
		Scanner sc=new Scanner(System.in);
		
		public void deposite()
		{
			System.out.println("enter the available balace :");	//checking available balance in account 	
			balance=sc.nextInt();
			System.out.println("deposite money");
			amount=sc.nextFloat();				//depositing money through user
			totalbalance=balance+amount;
			System.out.println("Total balance is"+totalbalance);		// total balance of account
		}
		public void withdraw() throws InSufficientBalancedException 
		{
			float withdraw;
			System.out.println("enter the amount to be withdraw");
			withdraw=sc.nextFloat();			//to withdraw amount
			if(totalbalance<withdraw)			//checking that total balance is less than withdraw amount or not
			{
				//if the total balance is less then withdraw balance it will throw the exception
				throw new InSufficientBalancedException("NO sufficient fund to withdraw");
			}
			else {
				//if the total balance is greater then withdraw balance then print it 
				System.out.println("please take money");
			}
				
		}
	}


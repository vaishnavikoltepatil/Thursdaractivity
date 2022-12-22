package com.question2;




	public class InsufficientBalanceException extends Exception {
		
		  
		public static void main(String[] args) {
			Account a=new Account();		
			a.deposite();			
			try
			{
				//if condition becomes the false throws the exception
				a.withdraw();		
				
			}
			catch(Exception e)		
			{
				System.out.println(e);
			}
			 
		}

	}



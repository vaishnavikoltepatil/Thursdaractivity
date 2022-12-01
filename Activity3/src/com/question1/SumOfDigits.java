package com.question1;
import java.util.Scanner;
public class SumOfDigits extends ReverseNumber {
	
	public void SumOfDigits()
	{
		int digit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number if you want to perform reverse :");
		 int sum=sc.nextInt();
		 while(sum>0)
		 {
			 digit=sum%10;
			 sum=sum+digit;
			 sum= sum/10;
		 }
		 System.out.println("sum if digit is : " +sum);
	}

}
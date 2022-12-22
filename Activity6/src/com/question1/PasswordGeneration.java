package com.question1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

	public class PasswordGeneration {

		public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
		        System.out.println("Generate your Security Code");//print the generate your code
		        String code = sc.next();
		        String regex = "[Vaishnavi@2003]{8}";
		        Pattern p = Pattern.compile(regex);//regex can compiled the expression
		        Matcher m = p.matcher(code);//matcher method can match the security code or not
		        boolean matchFound = m.find();
		        if(matchFound)
		        System.out.println("your Security Code is valid and generated successfully");//check statement security code is valid or not
		        else
		        System.out.println("Invalid Security Code, Try Again!");
		    }
		
		}



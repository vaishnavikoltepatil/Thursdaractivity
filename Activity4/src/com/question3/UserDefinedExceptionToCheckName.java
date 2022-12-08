package com.question3;
import java.util.Scanner;
import javax.naming.InvalidNameException;

public class UserDefinedExceptionToCheckName {
	//method to check valid names
	void validateName(String name) throws InvalidNameException
	{
		
	String[] names = { "Pooja", "aditi", "Rutuja", "nikita","Sakshi","Ankita"};
        boolean show= false;
        for (String n: names)
        {
            if (n.equalsIgnoreCase(name))
            {
                show = true;
                break;
            }
        }
        if (show)
        {
            System.out.println("Valid Name");
        } 
        else 
        {
            throw new InvalidNameException(" Enter Invalid name");
        }
    }
	public static void main(String[] args)
	{
		 
	        UserDefinedExceptionToCheckName ck=new UserDefinedExceptionToCheckName();
	        Scanner sc=new Scanner(System.in);
	        			//asks for input from the user
	        System.out.println("Enter Name:");
	        String name = sc.next();
	        try
	        {
	            ck.validateName(name);
	        }
	        catch(InvalidNameException e) 
	        {
	        	// exception will be thrown if the name entered doesn't match
	            System.out.println("Invalid Name " +e);
	        }
	}
}


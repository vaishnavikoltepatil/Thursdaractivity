package com.question3;

public class Stringclasses {
	public static void main(String[] args) {
		//Create a string using String class
				System.out.println("String class");
				String str="java Session!";
				
				//Illustrate the charAt,compareTo,conCat ,indexOf,replaceAll,substring,and toLowerCase methods
				System.out.println("character at index is: "+str.charAt(0));
				System.out.println("Comparing string: "+str.compareTo("java Session!"));
				System.out.println("concat string: "+str.concat("good morning"));
				System.out.println("index of string: "+str.indexOf("S"));
				System.out.println("replaceAll string: "+str.replaceAll("j", "J"));
				System.out.println("substring:" +str.substring(5));
				System.out.println("string to lower: "+str.toLowerCase());
				
				System.out.println("--------------------------------------");
				System.out.println("StringBuffer class: ");
				
				//Create a string using the StringBuffer class
				StringBuffer s1=new StringBuffer("Hi");
				
				//Illustrate the append,insert,reverse,and replace methods
				s1.append("Afternoon batch ");
				System.out.println("append a string: "+s1);
				s1.insert(11, "Vaishnavi ");
				System.out.println("inserting string"+s1);
				s1.reverse();
				System.out.println("reverse a string: "+s1);
				s1.replace(0, 13, "Lets Start");
				System.out.println("replace a string:" +s1);
				
				System.out.println("--------------------------------------");
				System.out.println("StringBulider class: ");
				
				//Create a string using the StringBuilder class
				StringBuilder s2=new StringBuilder("Hello everyone ");
				
				//Illustrate the append,substring,and length methods
				s2.append("Good evening");         
				System.out.println("append a string builder:"+s2);
				System.out.println("adding substring: "+s2.substring(5));
				System.out.println("lenght of string:"+s2.length());
				

			}

		}
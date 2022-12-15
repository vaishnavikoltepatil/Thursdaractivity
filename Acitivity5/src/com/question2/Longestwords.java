package com.question2;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

		public class Longestwords {
		     public static void main(String [ ] args) throws FileNotFoundException {
		              new Longestwords ().findLongestWords();
		         }

		     public String findLongestWords() throws FileNotFoundException {

		       String longest_word = " ";
		       String current;
		       Scanner sc = new Scanner(new File("D:\\long.txt"));


		       while (sc.hasNext()) {
		          current = sc.next();
		           if (current.length() > longest_word.length()) //
		           {
		             longest_word = current;
		           }
		       }
		         System.out.println("\n"+longest_word+"\n");//print the longestword in the statement 
		            return longest_word;
		            }
		
	}




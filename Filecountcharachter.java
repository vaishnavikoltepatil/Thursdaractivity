package com.question3;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

	public class Filecountcharachter
	{
		
				static int lines=0,chars=0,words=0;
				static int content=0;
				public static void totalCount(FileInputStream fin) throws IOException 
				{
					
				while(fin.available()!=0)
				{
						content = fin.read();
					if(content!=10)
					chars++;
					if(content==32)
					words++;
					if(content==13)
					{
						lines++;
						words++;
					}
				}
				System.out.println("No.of characters = "+chars);//print the char numbers
				System.out.println("No.of words = "+(words+1));//print the numbers of words
				System.out.println("No.of lines = "+(lines+1));//print the number of lines
				fin.close();
				}
				public static void main(String args[]) {
				try
				{ 
					//fileInput is used for reading the file..
				FileInputStream f=new FileInputStream("D:\\file1.txt");
				totalCount(f);
				}
				
			catch(FileNotFoundException e)
			{
				System.out.println("Cannot find the specified file...");
			}
			catch(IOException i)
			{
				System.out.println("Cannot read file...");
			}
		
		}
	}




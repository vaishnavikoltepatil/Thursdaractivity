package com.question1;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

	public class IOoperations {

		
		static void readWrite() throws IOException
		{
			System.out.println(" enter the choice ");
			System.out.println(" choice 1 is for write and choice 2 is for read ");
			Scanner sc=new Scanner(System.in);
			
			int choice=sc.nextInt();
			if(choice==1) {
				try {
				FileOutputStream fout = new FileOutputStream("D:\\write.txt");
				String s="we are last year computer students";
				byte b[]=s.getBytes();  // change byte into array
				fout.write(b); 
				fout.close();
				}
				catch(FileNotFoundException e)
				{
					e.printStackTrace();
				}
			}
			else if(choice==2)
			{
				try
				{
				FileInputStream fin = new FileInputStream("D:\\read.txt");
				
				while(( choice=fin.read())!=-1) {   //reading file till -1
					System.out.print((char)choice);
				}
				fin.close();
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			else {
				System.out.println("Invalid Input please re-enter ");
			}
			System.out.println("Done");
		}
		public static void main(String[] args) throws IOException {
			IOoperations io =new IOoperations() ;
				io.readWrite();
			}
		}



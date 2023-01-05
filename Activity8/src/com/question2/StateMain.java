package com.question2;
import java.util.Iterator;

	public class StateMain {

			public static void main(String[] args) {
				State a=new State();
				a.addState("Maharshatra");			//adding sate name
				a.addState("Karnatak");
				a.addState("Panjab");
				a.addState("TamilNadu");
				
				System.out.println("Retrive the details of state:"+a.retriveState("TamilNadu"));		//Retrieves the specific state name 

			}

		

	}



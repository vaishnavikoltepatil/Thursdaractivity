package com.questions2;

public class ArithmeticMain {

	public static void main(String[] args) {
		Adder a=new Adder();
		System.out.println("My superclass is:"+a.getClass().getSuperclass().getName());
		System.out.print(a.add(40,80)+" ");

	}



	}



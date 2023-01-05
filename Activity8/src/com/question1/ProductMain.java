package com.question1;
import java.util.ArrayList;
import java.util.Collections;


		public class ProductMain {

			public static void main(String[] args) {
				Product p1=new Product(1,"Nike",3000);
				Product p2=new Product(2,"Adidas",1500);
				Product p3=new Product(3,"Puma",2000);
				ArrayList<Product> al=new ArrayList<>();
				al.add(p1);
				al.add(p2);
				al.add(p3);
				
				System.out.println("sorting by price");
				Collections.sort(al, new ProductPrice());
				for(Product p:al)
				{
					System.out.println(p.id+" "+p.name+" "+p.price);
				}
				System.out.println("-----------------------------");
				
				System.out.println("sorting by name");
				Collections.sort(al, new ProductName());
				for(Product p:al)
				{
					System.out.println(p.id+" "+p.name+" "+p.price);
				}
			}
		

	}



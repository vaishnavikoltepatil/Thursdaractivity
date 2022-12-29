package com.question1;
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

	public static void main(String[] args) {
		//create three employee objects and add them on arraylist
		Employee e1=new Employee(1,"riya",19,30000);
		Employee e2=new Employee(2,"skashi",18,40000);
		Employee e3=new Employee(3,"nisha",25,50000);
		ArrayList<Employee> al=new ArrayList<>();// Create an empty ArrayList
		al.add(e1); //objects to ArrayList using add() method
		al.add(e2);
		al.add(e3);
		//sorts the list of employee
		System.out.println("Sort the employee based on their salary");
		Collections.sort(al);//sorting the element in ascending order
		for(Employee e:al)
		{
			System.out.println(e.id+" "+e.name+" "+e.age+" "+e.salary); // Display list
		}
	}
}


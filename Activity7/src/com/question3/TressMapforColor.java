package com.question3;
import java.util.TreeSet;
import java.util.Set;


	public class TressMapforColor {
	  public static void main(String[] args) {
	  
	    TreeSet<String> colors = new TreeSet<>();// create a TreeSet to store the colors

	    // add some colors to the set
	    colors.add("Red");
	    colors.add("Orange");
	    colors.add("Yellow");
	    colors.add("Green");
	    colors.add("Blue");
	    
	    // print out the tree set
	    System.out.println("Original set: " + colors);

	    // create another TreeSet to store additional colors
	    TreeSet<String> moreColors = new TreeSet<>();
	    moreColors.add("Purple");
	    moreColors.add("Pink");
	    moreColors.add("grey");

	    // add all the elements of the moreColors set to the colors set
	    colors.addAll(moreColors);
	    System.out.println("After adding more colors: " + colors);

	    // create a reverse order view of the elements in the colors set
	    TreeSet<String> reverseOrderColors = (TreeSet<String>) colors.descendingSet();
        System.out.println("Reverse order view: " + reverseOrderColors);

	    // create another TreeSet to store a different set of colors
	    Set<String> differentColors = new TreeSet<>();
	    differentColors.add("Red");
	    differentColors.add("Green");
	    differentColors.add("Blue");

	    // compare the differentColors set to the colors set
	    System.out.println("comparing the orignal set to the comapre set: " + colors.equals(differentColors));

	    // get the first and last elements in the colors set
	    System.out.println("First element : " +  colors.first());
	    System.out.println("Last element: " + colors.last());
	  }
	}


	
package com.question3;

import java.util.ArrayList;
import java.util.Collections;

public class FruitBasket {
    public static void main(String[] args) {
        // Enter the first fruit basket
        ArrayList<String> firstBasket = new ArrayList<>();
        firstBasket.add("apple");
        firstBasket.add("grape");
        firstBasket.add("mango");
        firstBasket.add("papaya");

        // Enter the second fruit basket
        ArrayList<String> secondBasket = new ArrayList<>();
        secondBasket.add("pineapple");
        secondBasket.add("kiwi");
        secondBasket.add("banana");
        secondBasket.add("mango");

       
        secondBasket.addAll(firstBasket); // Add all the fruits from the first basket to the second basket
        
        if (secondBasket.contains("mango")) {      // Check if the fruit "mango" is present in the second basket
            System.out.println("mango is present in the second basket");
        } else {
            System.out.println("mango is not present in the second basket");
        }

        if (firstBasket.isEmpty()) {
            System.out.println("The first basket is empty"); // Check if the first basket is empty or not
        } else {
            System.out.println("The first basket is not empty");
        }

        // Arrange the fruits in the first basket in ascending order
        Collections.sort(firstBasket);
        System.out.println("Fruits in the first basket (sort in ascending order): " + firstBasket);

        // Arrange the fruits in the second basket in descending order
        Collections.sort(secondBasket, Collections.reverseOrder());
        System.out.println("Fruits in the second basket (sorted in descending order): " + secondBasket);

        firstBasket.remove(2);// Remove the fruit for the specific position from the first basket
        System.out.println("Fruits in the first basket after removing the fruit at index 2: " + firstBasket);
    }

}






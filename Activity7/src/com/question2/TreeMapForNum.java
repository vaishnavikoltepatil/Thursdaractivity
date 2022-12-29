package com.question2;
import java.util.TreeMap;

public class TreeMapForNum {
		  public static void main(String[] args) {
		    // Create a TreeMap to store the key-value pairs integer 1 to 20
		    TreeMap<Integer, Integer> map = new TreeMap<>();

		    // Add the key-value pairs to the map
		    for (int i = 1; i <= 20; i++) 
		    {
		      map.put(i, i * i);
		    }

		    // Print the squares of the keys from 1 to 20
		    System.out.println("Squares of keys from 1 to 20:");
		    for (int key : map.keySet()) {
		      System.out.println(key + ": " + map.get(key));
		    }

		    // Copy the content of the map to another TreeMap
		    TreeMap<Integer, Integer> copy = new TreeMap<>(map);
		    System.out.println("\nContent of the copy:");
		    for (int key : copy.keySet()) {
		      System.out.println(key + ": " + copy.get(key));
		    }

		    // Search for a key in the map
		    int searchKey = 15;
		    if (map.containsKey(searchKey)) {
		      System.out.println("\nKey " + searchKey + " found in the map");
		    } else {
		      System.out.println("\nKey " + searchKey + " not found in the map");
		    }

		    // Search for a value in the map
		    int searchValue = 324;
		    if (map.containsValue(searchValue)) {
		      System.out.println("Value " + searchValue + " found in the map");
		    } else {
		      System.out.println("Value " + searchValue + " not found in the map");
		    }

		    // Get the greatest key less than or equal to the given key
		    int key = 19;
		    System.out.println("\nGreatest key less than or equal to " + key + ": " + map.floorKey(key));

		    // Remove and get the key-value mapping associated with the least key in the map
		    System.out.println("\nKey-value mapping associated with the least key: " + map.pollFirstEntry());

		    // Remove and get the key-value mapping associated with the greatest key in the map
		    System.out.println("Key-value mapping associated with the greatest key: " + map.pollLastEntry());
		  }
		
	}



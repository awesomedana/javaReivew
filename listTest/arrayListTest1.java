package listTest;

import java.util.ArrayList;

public class arrayListTest1 {
	public static void main(String[] args) {
		ArrayList<String> colours = new ArrayList<String>(10);//This line defines an ArrayList of Strings with 10 as its initial size.
		colours.add("Red");
		colours.add("Blue");
		colours.add("Green");
		colours.add("Orange");
		
		System.out.println(colours);
		
		colours.remove("Green");
		
		System.out.println(colours);
	}
}

/*
 * Other useful methods include the following: 
 * 	- contains() : Returns true if the list contains the specified element. 
 * 	- get(int index) : Returns the element at the specified position in the list.
 *  - size() : Returns the number of elements in the list.
 *  - clear() : Removes all of the elements from the list.
 *  
 *  * As with arrays, the indexing starts with 0.
 */
package treeMapTest;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "Sam");
		scores.put(new Integer(98), "Paul");
		scores.put(new Integer(75), "Tom");
		scores.put(new Integer(95), "Cathy");
		scores.put(new Integer(80), "Jack");
		
		NavigableMap<Integer, String> descendingMap = scores.descendingMap();
		Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
		for(Map.Entry<Integer, String> entry : descendingEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
		System.out.println();
		
		NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
		Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();
		for(Map.Entry<Integer, String> entry : ascendingEntrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
	}

}

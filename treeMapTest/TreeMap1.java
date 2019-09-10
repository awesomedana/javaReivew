package treeMapTest;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "Sam");
		scores.put(new Integer(98), "Paul");
		scores.put(new Integer(75), "Tom");
		scores.put(new Integer(95), "Cathy");
		scores.put(new Integer(80), "Jack");

		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.lowerEntry(new Integer(95));
		System.out.println("95점 아래 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.higherEntry(new Integer(95));
		System.out.println("95점 위의 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.floorEntry(new Integer(85));
		System.out.println("95점이거나 바로 아래 점수 : " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.ceilingEntry(new Integer(85));
		System.out.println("85점이거나 바로 위의 점수: " + entry.getKey() + "-" + entry.getValue());
		
		while(!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey() + "-" + entry.getValue() + "(남은 객체 수 : " + scores.size() + ")");
		}
	}

}

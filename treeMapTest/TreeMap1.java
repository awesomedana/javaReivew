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
		System.out.println("���� ���� ���� : " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.lastEntry();
		System.out.println("���� ���� ���� : " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.lowerEntry(new Integer(95));
		System.out.println("95�� �Ʒ� ���� : " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.higherEntry(new Integer(95));
		System.out.println("95�� ���� ���� : " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.floorEntry(new Integer(85));
		System.out.println("95���̰ų� �ٷ� �Ʒ� ���� : " + entry.getKey() + "-" + entry.getValue());
		
		entry = scores.ceilingEntry(new Integer(85));
		System.out.println("85���̰ų� �ٷ� ���� ����: " + entry.getKey() + "-" + entry.getValue());
		
		while(!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey() + "-" + entry.getValue() + "(���� ��ü �� : " + scores.size() + ")");
		}
	}

}

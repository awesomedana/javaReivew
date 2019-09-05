package hashTest;

import java.util.HashMap;

public class HashTest1 {
	public static void main(String[] args) {
		HashMap<String, Integer> points = new HashMap<String, Integer>();
		points.put("eronred", 154);
		points.put("Yusak Manullang", 42);
		points.put("Jelena Civicic", 733);
		System.out.println(points.get("Yusak Manullang"));
	}
}

//A HashMap cannot contain duplicate keys. 
//Adding a new item with a key that already exists overwrites the old element.

//The HashMap class provides containsKey and containsValue methods that determine the presence of a specified key or value.
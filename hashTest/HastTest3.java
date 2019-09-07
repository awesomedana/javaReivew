package hashTest;

import java.util.HashMap;

public class HastTest3 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("s1", "A");
		map.put("s2", "B");
		map.put("s3", "C");
		
		System.out.println(map);
		System.out.println(map.get("A")); //null
		System.out.println(map.get("s2")); //B
		System.out.println(((String)map.get("s3")).length()); //3
		System.out.println(map.size()); //3
		
		map.put("s3", "D");
		System.out.println(map);
		System.out.println(map.containsKey("s1")); //true
		System.out.println(map.remove("s1")); //A(삭제된 key의 value 출력)
		System.out.println(map);
		
		map.clear();
		System.out.println(map); //{}
	}

}

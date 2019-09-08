package listTest;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		
		list.add(1);
		list.add(3.14);
		list.add('a');
		list.add("hi");
		System.out.println(list);

		list.set(1, 3.141592);
		list.set(3, 100);
		System.out.println(list);
		
		list.remove(1); //인덱스 1번 자리에 있는 데이터를 지우고 알아서 당김
		System.out.println(list);
		
		/*
		 * int number = (Integer)list.get(0); double pi = (double)list.get(1); char c =
		 * (char)list.get(2); String s = (String)list.get(3);
		 * System.out.println(number); System.out.println(pi); System.out.println(c);
		 * System.out.println(s);
		 */
		
		System.out.println();
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		for(Object o : list) {
			System.out.println(o);
		}
	}

}

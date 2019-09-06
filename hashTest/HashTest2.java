package hashTest;

import java.util.HashMap;

public class HashTest2 {

	public static void main(String[] args) {
		String[] participant = {"maria", "josipa", "nikola"};
		String[] completion = {"josipa", "maria"};
        
		String answer = "";
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(int i=0; i<participant.length; i++) {
            if(map.containsKey(participant[i])) {
                map.put(participant[i], map.get(participant[i])+1);             
            } else {
                map.put(participant[i], 1);
            }
        }

        for(int i=0; i<completion.length; i++) {
            map.put(completion[i], map.get(completion[i])-1);               
        }

        for(String key : map.keySet()) {
            if(map.get(key)==1) {
                answer = key;
            }
        }
        System.out.println(answer);
    }
}

/* int�� Integer�� ���� 
 * int : primitive�ڷ���, ������� ����, null�� �ʱ�ȭ �Ұ���
 * Integer : wrapperŬ����(��ü), Unboxing�� ���� ������ ������� �Ұ���, null�� ó�� ����
 * */


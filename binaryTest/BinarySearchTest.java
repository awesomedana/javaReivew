package binaryTest;

public class BinarySearchTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int target = 4;
		int low = 0;
		int high = arr.length-1;
		int mid = 0;
		int r = binarySearch(arr, target);

		if(r >= 0) {
			System.out.println("ã�� ��ġ : " + r);
		} else {
			System.out.println("ã�� ����");
		}
	}

	static int binarySearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length-1;
		int mid = 0;
		int i = 0;
		
		while(low <= high) {
			mid = (low+high)/2;
			i++;
			System.out.println(i + "��° �õ�");
			if(arr[mid] == target) {
				break;
			} else if(arr[mid] > target) {
				high = mid-1;
			} else {
				low = mid+1;
			}
		}
		
		if(low <= high) {
			return mid;
		} else {
			return -1;
		}
	}
}

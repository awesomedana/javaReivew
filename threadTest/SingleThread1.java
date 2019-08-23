package threadTest;

public class SingleThread1 extends Thread {
	private int[] temp;
	
	public SingleThread1(String threadname) {
		super(threadname);
		temp = new int[10];
		
		for(int start=0; start < temp.length; start++) {
			temp[start] = start;
		}
	}
	
	public void run() {
		for(int start:temp) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("스레드 이름 : " + currentThread().getName());
			System.out.println("temp value : " + start);
		}
	}

	public static void main(String[] args) {
		SingleThread1 st = new SingleThread1("첫번째");
		st.start();

	}

}

package threadTest;

public class SingleThread2 implements Runnable {
	private int[] temp;
	
	public SingleThread2() {
		temp = new int[10];
		for(int start=0; start < temp.length; start++) {
			temp[start] = start;
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int start:temp) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("스레드 이름 : " + Thread.currentThread().getName());
			System.out.println("temp value : " + start);
		}
	}

	public static void main(String[] args) {
		SingleThread2 st = new SingleThread2();
		Thread t = new Thread(st, "첫번째");
		
		t.start();
	}
}

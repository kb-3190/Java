package MultiThread;

class MyThread extends Thread {
	public void run() {
		
		int t = 0;
		
		for(int i = 0; i <= 10000; i++) {
			t += i;
		}
		
		System.out.println(t);
		
	}
}

public class MultiThread {

	public static void main(String[] args) {
		
		System.out.println("開始");
		
		MyThread t = new MyThread();
		t.start();
		
		System.out.println("終了");
	}
}



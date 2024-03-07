package MultiThread;

public class SingleThread {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("開始");
		
		int t = 0;
		
		for (int i = 0; i < 10000; i++) {
			t += i;
		}
		
		System.out.println(t);
		
		System.out.println("終了");

	}

}

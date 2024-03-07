package StopWatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.Instant;

public class StopWatch {

	public static void main(String[] args) {
		
		String start = "";
		String end = "";
		Instant startTime = null;
		Instant pastTime = null;
		
		System.out.println("キー入力で計測開始");
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);
		try {
			start = reader.readLine();
		} catch (IOException e){
			e.printStackTrace();
		}
		
		if (start != null) {
			startTime = Instant.now();
		}
		
		System.out.println("キー入力で計測ストップ");
		InputStreamReader out = new InputStreamReader(System.in);
		BufferedReader reader2 = new BufferedReader(out);
		try {
			end = reader2.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (end != null) {
			pastTime = Instant.now();
		}
		
		Duration duration = Duration.between(startTime, pastTime);
		
		System.out.println(duration.getSeconds() + "秒");

	}

}


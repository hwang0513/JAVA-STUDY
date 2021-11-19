package basic;

public class Ex_text8 {

	public static void main(String[] args) {
		int totalsec = 7582;
		int min = totalsec/60;
		int hour = min/60;
		int sec = totalsec%60;
		min %= 60;
		System.out.printf("%d시간 %d분 %d초", hour, min, sec);
				
	}

}

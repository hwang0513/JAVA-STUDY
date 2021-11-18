package convertingTemp;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// 섭씨 온도를 화씨 온도로 변환 (0℃ * 9/5)	 + 32 = 32°F
		Scanner scanner = new Scanner(System.in);
		System.out.print("온도를 입력해주세요 :");
		double c = scanner.nextDouble();
		double f = (c*9/5)+32; // 화씨 변수 f는 공식대로
		System.out.printf("섭씨 %.3f 는 화씨 %.3f이다", c, f);
	}

}

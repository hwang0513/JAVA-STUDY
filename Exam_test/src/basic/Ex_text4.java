package basic;

import java.util.Scanner;

public class Ex_text4 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("일 한 시간 입력 : ");
		int time = a.nextInt();
		int money = 8000;
		System.out.printf("월급 : %d", money*time);
		
	}
}

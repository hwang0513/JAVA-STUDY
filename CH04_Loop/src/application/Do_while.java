package application;

import java.util.Scanner;

public class Do_while {
	public static void main(String[] args) {
//		// do while은 처음 한번은 조건과 상관없이 실행됨
//		int count = 0;
//		System.out.println("do while 반복문");
//		
//		do {
//			System.out.println("카운트 : "+count);
//		} while(count++ < 5); //비교한다음 증가
		
		final String USER_PASS="hello";
		
		Scanner input = new Scanner(System.in);
		String password = "";
		
		do {
			System.out.println("비번을 입력 > ");
			// String password = input.nextLine(); > String password선언을  do while문 안에 쓰면 지역변수라서 밑에 while문 조건문에서 사용이 안됨 그래서 밖에서 밖에서 선언해주고 쓴다.
			password = input.nextLine();
		} while(!password.equals(USER_PASS));
		input.close();
		System.out.println("접속 승인");
	}
}

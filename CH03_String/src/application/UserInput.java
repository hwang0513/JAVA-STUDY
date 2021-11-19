package application;  //application.UserInput 이라 쓰면 지금 여기 있는 유저인풋 클래스를 불러온다는말.

import java.util.Scanner; //java.util 패키지 안에 Scanner 클래스를 불러와서 사용가능

public class UserInput {

	public static void main(String[] args) {
		// 입력을 받는 클래스
		Scanner a = new Scanner(System.in); //스캐너 객체를 선언, 입력을 받기 위해 선언
		Scanner c = new Scanner(System.in); //스캐너 객체를 선언, 입력을 받기 위해 선언

		System.out.println("온도를 입력해 주세요 : " );
		int x = a.nextInt(); // 스캐너로 정수 입력을 받아 x에 입력, 실행시 입력을 대기하고 엔터키가 입력되면 종료
		System.out.print("글자를 입력해 주세요 : " );
		String b = c.nextLine();// 문자열 입력
		System.out.println(x);
		System.out.print(b);
	}

}

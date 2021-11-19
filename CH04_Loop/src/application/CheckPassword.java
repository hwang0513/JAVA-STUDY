package application;

import java.util.Scanner;

public class CheckPassword {
	public static void main(String[] args) {
		// 지정된 패스워드 입력시 '접속승인' 아니면 '접속불가'
		final String USER_PASS="hi12";
		
		System.out.print("비번 입력: ");
		
		Scanner input=new Scanner(System.in);
		String num=input.nextLine();
		input.close();
		
		if(num.equals(USER_PASS)) {
			System.out.println("접속승인");
		}
		else {
			System.out.println("접속불가");
		}
		
	}
}

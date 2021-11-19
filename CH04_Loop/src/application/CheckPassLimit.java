package application;

import java.util.Scanner;

public class CheckPassLimit {
	public static void main(String[] args) {
		//패스워드가 틀리더라도 3번 입력할 수 있는 기회를 준다.
		// 패스워드가 맞으면 '접속승인' 출력하고 반복문을 빠져옴
		// 패스워드 3회 틀릴시 '접속거부'
		
		final String PASSWORD="hi12";
		Scanner input = new Scanner(System.in);
		boolean accessok=false; // 플래그(flag):불린변수로 상태에 따라 처리흐름
		String pass="";
		//비번이맞으면 accessok= true로 하고 접속승인 출력
		for(int i=0; i<3; i++) {
			System.out.print("패스워드를 입력하세요 : ");
			pass=input.nextLine();
			if(pass.equals(PASSWORD)){
				System.out.println("접속승인");
				accessok=true;
				break;
			}
			else{
				System.out.printf("비번 %d 번 틀림", i+1);
			}
		}
		input.close();
		if(!accessok) {
			System.out.println("접속불가");
		}
	}
}

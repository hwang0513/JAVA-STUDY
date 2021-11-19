package application;

import java.util.Scanner;

public class IfElseIfElse {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("계속진행하시겠습니까? (y/n) ");
		String option=a.nextLine();
		a.close();
		
		switch(option) {
		case "y":
			System.out.println("계속 진행합니다.");
			break;
		case "n":
			System.out.println("종료합니다.");
			break;
		default:
			System.out.println("잘못입력했습");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("메뉴\n===");
//		System.out.print("옵션을 선택 > ");
//		int a = scanner.nextInt();
//		
//		if(a==1) {
//			System.out.println("헬로우");
//		}
//		else if(a==2) {
//			System.out.println("안녕 ?");
//		}
//		else if(a==3) {
//			System.out.println("프로그램 종료.");;
//		}
//		else if(a==10000) {
//			System.out.println("이스터에그를 발견했습니다.");
//		}
//		else {
//			System.out.println("잘못입력");
//		}
//		
		
		
		
		
		
		
		
		
//		System.out.print("사과의 개수  : ");
//		int apple=scanner.nextInt();
//		System.out.print("바나나의 개수 : ");
//		int banana=scanner.nextInt();
//		scanner.close(); //스캐너 종료 ( 더이상 안쓸때)
//		
//		if(apple>banana) {
//			System.out.println("사과가 바나나보다 많음");
//		}
//		else if(apple<banana) {
//			System.out.println("바나나가 사과보다 많음");
//		}
//		else{
//			System.out.println("바나나와 사과가 같음");
//		}
//		System.out.println("프로그램 종료");

	}

}

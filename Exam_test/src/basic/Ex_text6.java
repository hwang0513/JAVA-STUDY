package basic;

import java.util.Scanner;

public class Ex_text6 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("정수 a의 값 입력 : ");
		int a = input.nextInt();
		System.out.print("정수 b의 값 입력 : ");
		int b = input.nextInt();
		
		System.out.printf("a*b = %d\n",a*b);
		System.out.printf("a/b = %d\n",a/b);
		System.out.printf("a/b = %d",a%b);
		
		
	}
}

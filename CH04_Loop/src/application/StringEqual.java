package application;

public class StringEqual {
	public static void main(String[] args) {
		// 두개의 문자열이 같은지 비교한다.
		String t1 = "apple";
		String t2 = "orange";
		
		System.out.printf("두개의 문자열 일치 : %b \n", t1==t2);
		System.out.printf("두개의 문자열 일치 : %b \n", t1.equals(t2));
		//equals메서드 : 문자열 비교해줌, returns 반환 : 같으면 true 다르면 false
	}
}

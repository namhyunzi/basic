package control;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		/*
		 * Scanner
		 * 		값을 읽어오는 기능이 제공된다.
		 * 		java.base 모듈의 java.util 패키지에 위치하는 클래스다.
		 * 
		 * 		next() : 입력한 값을 문자열로 제공하는 기능이다.
		 * 		nextInt(): 입력한 값을 정수로 제공하는 기능이다.
		 * 		nextDouble(): 입력한 값을 실수로 제공하는 기능이다.
		 * 		
		 */
		
		/*
		 * 두 수를 입력받아서 더 큰 수를 출력하기
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		// 입력값을 읽어서 정수값으로 반환한다.
		System.out.print("첫번째 숫자 입력: ");
		int num1 = scanner.nextInt();
		
		System.out.print("두번째 숫자 입력: ");
		int num2 = scanner.nextInt();
		
		System.out.println("첫번째 정수: " + num1);
		System.out.println("두번째 정수: " + num2);
		
		if (num1 > num2) {
			System.out.println("큰 수 : " + num1);
		} else {
			System.out.println("큰 수 : " + num2);
		}
		scanner.close();
	}
}

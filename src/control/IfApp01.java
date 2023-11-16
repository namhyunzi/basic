package control;

public class IfApp01 {

	public static void main(String[] args) {
		/*
		 * if 문
		 * 		조건식이 true 로 판정될 때 실행할 수행문을 정의한다.
		 * 
		 * 형식
		 * 		if (조건식) {
		 * 			// 조건식이 true 로 판정될 때 실행되는 수행문이다.
		 * 			수행문;
		 * 			수행문;
		 * 			수행문;
		 * 		}
		 * 		
		 * 		조건식은 boolean 값이거나 연산결과가 boolean 값인 연산식이다.
		 */ 
		
		// 모두의 마블
		// 게임규칙1 : 주사위 숫자가 2개 모두 6이 나오면 감옥에서 탈출한다.
		
		// 실행할 때마다 1 ~ 6 범위내의 임의의 정수가 나오게 하기
		int num1 = (int)(Math.random()*6) + 1;
		int num2 = (int)(Math.random()*6) + 1;
		
		System.out.println("첫번째 숫자: " + num1);
		System.out.println("두번째 숫자: " + num2);
		
		if(num1 == 6 && num2 == 6) {
			System.out.println("감옥을 탈출한다.");
		}
		
		System.out.println("다음 사용자 차례입니다.");
	}
}

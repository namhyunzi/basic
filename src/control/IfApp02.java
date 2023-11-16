package control;

public class IfApp02 {

	public static void main(String[] args) {
		/*
		 * If ~ else 문
		 * 
		 * 형식
		 * 		if (조건식) {
		 * 			// 조건식이 true 로 판정되면 실행되는 수행문
		 * 			수행문;
		 * 			수행문;
		 * 			수행문;
		 * 		} else {
		 * 			// 조건식이 false 로 판정되면 실행되는 수행문
		 * 			수행문;
		 * 			수행문;
		 * 			수행문;
		 * 		}
		 *
		 * 제시된 조건을 만족하는 경우에 실행할 작업이 있고.
		 *			 만족하지 못하는 경우에도 실행할 작업이 있는 경우 사용한다.
		 */
		
		// 주차비 정산 시스템
		// 주차비는 시간당 3000원이다.
		// 차량 배기량을 기준으로 900cc 미만은 50% 할인이 적용된다.
		
		int engineDisplacement = 600;	// 배기량
		int hours = 3;					// 주차시간
		int payPerHour = 3000;			// 시간당 주차요금
		
		int payAmount = 0;
		if (engineDisplacement < 900) {
			payAmount = payPerHour*hours/2;
		} else {
			payAmount = payPerHour*hours;
		}
		
		System.out.println("계산할 요금은 " + payAmount + "원 입니다.");
		

	}

}

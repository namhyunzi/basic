package control;

public class IfApp04 {

	public static void main(String[] args) {
		/*
		 * if ~ else if ~ else ~ if ~ else 구문
		 * 
		 * 형식
		 * 		if (조건식) {
		 * 			// 조건식1이 true로 판정되면 실행되는 수행문
		 * 			수행문;
		 * 			수행문;
		 * 		} else if (조건식2) {
		 * 			// 조건식2가 true로 판정되면 실행되는 수행문
		 * 			수행문;
		 * 			수행문;
		 * 		} else if (조건식3) {
		 * 			// 조건식3이 true로 판정되면 실행되는 수행문
		 * 			수행문;
		 * 			수행문;
		 * 		} else {
		 * 			// 조건식1, 조건식2, 조건식3이 모두 false 로 판정되면 실행되는 수행문
		 * 			수행문;
		 * 			수행문;
		 * 		}
		 * 
		 * 	검사할 조건이 여러 개일 때 사용하는 분기문이다.
		 * 	조건식을 작성할 때는 조건들을 잘 파악해서 순서에 맞게 작성한다.
		 * 	(조건이 일치여부를 판정하는 조건일 때는 조건식의 순서가 별로 중요하지 않다.
		 *  조건이 값의 대소관계를 비교하는 조건일 때는 조건식의 순서가 중요하다.)
		 *  
		 *  한 종류의 값에 대해서 서로 다른 조건이 여러 개 존재하는 경우 사용한다.
		 */
	
		// 구매금액에 따른 적립포인트 계산하기
		// 구매금액이 100만원 이상일 때 5% 적립
		//			50만원 이상일 때 2% 적립
		//			30만원 이상일 때 1% 적립
		//			10만원 이상일 때 0.3 적립
		// 			그외는 0.1%로 한다.
		
		int orderPrice = 10_000;
		int point = 0;
		double depositRate = 0.1;
		
		
		if (orderPrice >= 1_000_000) {
			depositRate = 0.05;
		
		} else if (orderPrice >= 500_000) {
			depositRate = 0.02;
			
		} else if (orderPrice >= 300_000) {
			depositRate = 0.01;
			
		} else if (orderPrice >= 100_000) {
			depositRate = 0.003;
			
		}
		
		point = (int)(orderPrice*depositRate);
		
		System.out.println("구매금액: " + orderPrice);
		System.out.println("적립포인트: " + point);
		
					
	} 

}





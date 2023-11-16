package operator;

public class Sample05 {

	public static void main(String[] args) {
		/*
		 * 논리 연산자
		 * 		&& || !
		 * 
		 * 논리 연산자의 연산 대상은 boolean 값이고, 연산 결과도 boolean 값이다.
		 * 	(변수의 값이 boolean 형이거나, 연산식의 연산 결과가 boolean 형이다)이다.
		 * 논리 연산자의 좌항과 우항에는 비교연산식이 위치한다.
		 * 논리 연산자를 이용하면 복잡한 개발요구사항을 체크할 수 있다.
		 * 논리 연산자 중에서 !는 논리부정 연산자다. !는 단항 연산자다. 변수의 논리값을 반전시킨다.
		 * 예)
		 *  	// 장학금 지급여부를 판정하기
		 *  	// 합격자 중에서 평균이 95점 이상이면 지급한다.
		 *  	boolean isPassed = average >= 60;
		 * 		boolean result = isPassed && average >= 95;
		 * 		
		 * 		// 이벤트 상품 지급여부 판정하기
		 * 		// 구매금액이 10만원 이상이고, 100*n번째 방문자면 사은품을 지급한다.
		 * 		int orderPrice = 70000;	// 구매금액이 7만원
		 * 		int visitCount = 2500;	// 오늘 2500번재 방문자
		 * 	    boolean result = orderPrice >= 100_000 || visitCount%100 == 0;
		 * 
		 * 논리연산자의 &&와 ||의 동작 특성
		 * 		&&  : 좌항의 값이 false로 판정되면 우항의 값을 확인하지 않고 연산결과를 false로 확정한다.
		 * 		 || : 좌항의 값이 true로 판정되면 우항의 값을 확인하지 않고 연산결과를 true로 확정한다.
		 */
		
		// 이벤트 상품 지급여부 판정하기
		// 구매금액이 10만원 이상이거나 100*n번째 방문자는 사은품 지급대상이다.
		int orderPrice = 70_000;
		int visitCount = 270;
		boolean result = orderPrice >= 100_000 || visitCount%100 == 0;
		System.out.println("사은품 지급여부: " + result);
		
		boolean b1 = true;
		System.out.println(b1);		// true
		System.out.println(!b1);	// false
		System.out.println(!!b1);	// true
	}

}

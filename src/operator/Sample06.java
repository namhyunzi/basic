package operator;

public class Sample06 {

	public static void main(String[] args) {
		/*
		 *  조건 연산자 (3항 연산자)
		 *  	조건식 ? 값1    : 값2
		 *  	조건식 ? 연산식1 : 연산식2
		 *  
		 *		조건식의 값이
		 *			true 로 판정되면 조건 연산자의 최종결과는 값1 혹은 연산자1이다.
		 *			false 로 판정되면 조건 연산자의 최종결과는 값2 혹은 연산자2다.
		 *
		 *	값1과 값2의 타입은 같은 타입이다.
		 *	연산식1과 연산식2의 결과값도 같은 타입이다.
		 */
		
		// 평균점수가 60점이상이면 "합격", 그 외는 "불합격"으로 판정한다.
		int kor = 80;
		int eng = 60;
		int math = 60;
		
		int average = (kor + eng + math)/3;
		
		String result = average >= 60 ? "합격" : "불합격";
		System.out.println("결과: " + result);
		
		// 구매금액이 30만원 이상인 경우에는 적립포인트가 구매금액의 3%이고, 그 외는 1%
		int orderPrice = 50_000;
		int point = orderPrice >= 300_000 ? (int)(orderPrice*0.03) : (int)(orderPrice*0.01);
		System.out.println("포인트 : " + point);
		
	}
}

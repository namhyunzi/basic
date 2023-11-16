package operator;

public class Sample01 {

	public static void main(String[] args) {
		/*
		 * 산술 연산자
		 * 		+ - * % /
		 * 
		 * 
		 * 	% 는 나머지 연산자다, 나누기 연산에서 나머지를 반환한다.
		 * 		나머지 연산의 결과는 항상 0 ~ (나누는 수-1)
		 * 
		 * 	산술연산자는 정수나 실수에 대한 산술 연산을 수행한다.
		 * 	산술연산자는 연산에 참여한 값의 타입과 동일한 타입의 연산결과를 제공한다.
		 * 	산술 연산자 중에서 덧셈 연산자는 2가지 용도로 활용된다.
		 * 		첫번째
		 * 			숫자 + 숫자 ----> 덧셈연산
		 * 			 1   + 3       -> 4
		 *           1.2 + 3.0     -> 3.2
		 * 	    두번째
		 * 			   숫자 + 문자열   ---> 이어붙이기 , 결과는 문자열이다.
		 * 			  문자열 + 숫자    ---> 이어붙이기 , 결과는 문자열이다.
		 * 			  문자열 + 문자열   ---> 이어붙이기 , 결과는 문자열이다.
		 * 		       2  + "abc"   -> "2abc"
		 * 			"abc" +   2     -> "abc2"
		 * 			"abc" + "def"   -> "abcdef"
		 */

		// 숫자끼리의 산술 연산
		int num1 = 30;
		int num2 = 4;
		
		System.out.println(num1 + num2);	// 34가 출력됨
		System.out.println(num1 - num2);    // 26이 출력됨
		System.out.println(num1*num2);		// 120이 출력됨
		System.out.println(num1/num2);		// 7이 출력됨, 계산결과는 7.5지만 7이 출력됨.
		System.out.println(num1%num2);		// 2가 출력됨
		
		// 숫자와 문자의 산술 연산
		int num3 = 3;
		int ch1 = 'A';
		
		// 정수 + 문자 -> 정수 + 정수 로 변환 후 산술연산이 실행된다.
		System.out.println(num3 + ch1);			 // 68이 출력됨 
		System.out.println((char)(num3 + ch1));  // 'D'가 출력됨
		
		// 숫자와 문자열의 덧셈 연산
		System.out.println("abc" + 1);		// "abc1"이 출력됨
		System.out.println(1 + "abc");		// "1abc"이 출력됨
		System.out.println("abc" + "def");  // "abcdef"가 출력됨
		System.out.println(1 + 2 + 3 + "abc" + 4 + 5);  // "6abc45"가 출력됨
	}
}

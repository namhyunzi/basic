package operator;

public class Sample04 {

	public static void main(String[] args) {
		/*
		 * 비교 연산자
		 * 		대소관계 비교 : > < >= <=
		 * 		일치/불일치 여부 비교: == !=
		 * 
		 * 비교 연산자의 연산 대상은 숫자값이다.
		 * 비교 연산자의 연산 결과는 항상 true 혹은 false 값이다.
		 * 비교 연산자 중 일치/불일치 여부를 비교하는 연산자는 숫자가 아닌 값에 대해서도 사용할 수 있다.
		 * 
		 * 비교 연산은 프로그램 개발요구사항에서 제시된 조건에 변수의 값이 부합되는지 체크하기 위해서 사용한다.
		 */
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1 > num2);	// false
		System.out.println(num1 >= num2);	// false
		System.out.println(num1 < num2);	// true
		System.out.println(num1 <= num2);	// true
		System.out.println(num1 == num2);	// false
		System.out.println(num1 != num2);	// true
		
		// 학생의 시험점수 (국어, 영어, 수학)에 대한 평균점수가 60점 이상이면 합격으로 판정한다.
		// 합격여부를 판정하기
		int kor = 70;
		int eng = 60;
		int math = 40;
		
		int average = (kor + eng + math)/3;
		boolean result = average >= 60;
		System.out.println("합격여부: " + result);
	}
}

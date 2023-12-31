package operator;

public class Sample02 {

	public static void main(String[] args) {
		/*
		 * 대입 연산자 : 변수의 값을 새로운 값으로 변경한다. 변수의 값을 무시하고 덮어쓴다.
		 * 		=
		 * 복합 대입 연산자 : 변수에 저장된 원래값을 활용한다.
		 * 		+= -= *= /= %=
		 * 
		 * 대입 연산자는 우항의 값을 좌항의 변수에 대입한다.
		 * 복합 대입 연산자는 대입하기 전에 변수의 값을 대상으로 정해진 산술 연산을 수행하고, 그결과를 대입한다.
		 * 대입 연산자는 모든 연산자 중에서 연산 우선순위가 가장 낮은 연산자
		 */
		
		// 변수를 생성하고, 값을 변수에 대입한다.
		int num1 = 10;
		int num2 = 20;
		
		// 기존 변수에 값을 대입한다.
		num1 = 30;
		num2 = 40;
		
		// 복합 대입 연산자의 활용
		// 변수의 값을 10 증가시키자. (대입연산에 기존 변수의 값을 활용한다.)
		// 변수의 값을 20 감소시키자.
		num1 += 10;	// num1 = num1 + 10;과 동일하다.
		num2 -= 20; // num2 = num2 - 20;과 동일하다.
		
		System.out.println("num1의 값: " + num1);	// 40이 출력된다.
		System.out.println("num2의 값: " + num2);	// 20이 출력된다.

	}
}

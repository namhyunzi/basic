package operator;

public class Sample03 {

	public static void main(String[] args) {
		/*
		 * 증감연산자 
		 * 		++ --
		 * 증감연산자는 변수의 값을 1 증가시키거나 1 감소시킨다.
		 * 증감연산자는 단항 연산자다.
		 * 증감연산자의 사용 예
		 * 		int a = 10;
		 * 		a++;	// 후위형 
		 * 
		 * 		int b = 10;
		 * 		++b;	// 전위형
		 * 
		 * 증감연산자는 반복작업내에서 주로 사용한다.
		 */
		
		// 증감연산자를 단독으로 사용하는 경우
		int num1 = 10;
		int num2 = 10;
		
		num1++;
		++num1;
	    System.out.println("num1의 값: " + num1);	//	12가 출력됨
		
	    num2--;
	    --num2;
	    System.out.println("num2의 값: " + num2);	//	8이 출력됨
	    
	    // 증감연산자를 다른 연산자와 함께 사용하는 경우
	    // 전위형으로 사용하는 경우 - 변수의 값을 증감시키고, 연산에 사용한다.
	    // 후위형으로 사용하는 경우 - 연산에 값을 사용하고, 변수의 값을 증감시킨다.
	    int num3 = 10;
	    int num4 = 10;
	    
	    System.out.println("num3의 값:" + ++num3);	// 11이 출력된다. 결과적으로 num3는 11이다.
	    System.out.println("num4의 값:" + num4++);	// 10이 출력된다. 결과적으로 num4는 11이다.	
	}
}

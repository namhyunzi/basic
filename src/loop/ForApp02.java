package loop;

public class ForApp02 {

	public static void main(String[] args) {
		
		// 1~100까지 정수의 합을 계산하기
		
		/*
		 * sum += 1;
		 * sum += 2;
		 * ...
		 * sum += 100;
		 */
		
		int sum = 0;
		
		for(int num = 1; num <= 100; num++) {
			sum += num;
		}
		
		System.out.println("1~100 정수의 합: " + sum);
	
	
		// 1~100까지 정수중에서 짝수의 합을 계산하기
		int evenSum = 0;
	
		for (int num = 2; num <= 100; num+=2) {
			evenSum += num;
		}

		System.out.println("1~100 짝수의 합: " +evenSum);
		
		// 1~100까지 정수 중에서 홀수의 합을 계산하기
		int oddSum = 0;
		
		for (int num = 1; num <= 100; num++) {
			if(num%2 == 1) {
				oddSum += num;
			}
		}
		
		System.out.println("1~100 홀수의 합: " +oddSum);
			
	}
}

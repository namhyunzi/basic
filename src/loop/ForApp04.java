package loop;

public class ForApp04 {

	public static void main(String[] args) {
		/*
		 * 중첩된 for 문
		 * 
		 * 형식
		 * for (초기식; 조건식; 증감식) {
		 * 		수행문1;
		 * 		for (초기식; 조건식; 증감식) {
		 * 			수행문2;
		 * 		}
		 * }
		 * 
		 * 	수행문1은 바깥족 for 문의 반복횟수 만큼 실행된다.
		 * 	수행문1에서는 안쪽 for 문의 초기식에서 생성한 변수를 접근할 수 없다.
		 * 	수행문2는 바깥족 for 문이 한번 실행될때마다 안쪽 for 문의 반복횟수 만큼 실행된다.
		 * 	수행문2에서는 바깥 for 문의 초기식에서 생성한 변수, 안쪽 for 문 초기식에서 생성한 변수에 접근할 수 있다.
		 */
		
		/*
		 * 별찍기 
		 *---------------- 
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * ---------------
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 * ---------------
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 * ---------------
		 */
		
		// 정방향 별 찍기
		/*			행 별갯수
		 * *****	1	5
		 * *****	2	5
		 * *****	3	5
		 * *****	4	5
		 * *****    5	5
		 */
		
		for (int line = 1; line <= 5; line++) {				// 행을 출력
			
			for (int count =  1; count <=5; count++) { 		// 별을 출력
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 별 찍기
		/*     		행 별갯수
		 * *		1	1
		 * **		2	2
		 * ***		3	3
		 * ****		4	4
		 * *****	5	5
		 */
		for (int line = 1; line <= 5; line++) {		
			for (int count =  1; count <=line; count++) { 
				System.out.print("*");
			}
			System.out.println();
		}
		// 별찍기 
		/*        행 별갯수
		 * *****  1   5
		 * ****   2   4
		 * ***    3   3
		 * **     4   2
		 * *      5   1
		 */
		for (int line = 1; line <= 5; line++) {		
			for (int count =  1; count <= 6 - line; count++) { 
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 별찍기   행 공백갯수 별갯수
		/*
		 *     *   1  4      1
		 *    **   2  3      2
		 *   ***   3  2      3
		 *  ****   4  1      4
		 * *****   5  0      5
		 */
		
		for (int line = 1; line <= 5; line++) {		
			// 공백 찍기
			for (int spaceCount = 1; spaceCount <= 5 - line; spaceCount++) { 
				System.out.print(" ");	// 공백 하나 출력
			}
			
			// 별 찍기
			for (int startCount = 1; startCount <= line; startCount++) { 
				System.out.print("*");	// 별 하나 출력
				
			}
			System.out.println();
		 
		
		
		}
		
	}
}


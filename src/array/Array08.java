package array;

public class Array08 {

	public static void main(String[] args) {
		/*
		 * 다차원 배열
		 * 
		 * 2차원 배열의 형식
		 * - 배열 리터럴을 이용한 2차원 배열객체 생성하기
		 * 		자료형[]][] 참조변수 = {{값, 값, 값}, {값, 값,값}};
		 * - new 키워드를 이용한 2차원 빈 배열객체 생성하기
		 * 		자료형[]][] 참조변수 = new 자료형 {rows},{cols};
		 */
		
		int[][] arr1 = {{11, 22, 33},{44, 55, 66}};
		/*     
		 *     0   1   2
		 * 0 [11][22][33]
		 * 1 [44][55][66]
		 * 
		 */
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.println(i + ", " + j + "번째 -> " + arr1[i][j]);
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("향상된 for문으로 조회");
		
		for (int[] arr: arr1) {
			for (int value: arr) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}
}

package array;

public class Array04 {

	public static void main(String[] args) {
		/*
		 * 배열과 관련된 오류내용 확인하기
		 *  - 배열의 인덱스 범위를 벗어났을 때 
		 * 		int[] arr1 = new {10, 20, 30}
		 * 		System.out.println(arr1[3]);
		 * 
		 * 		ArrayIndexOutOfBoundsException 예외발생
		 * 
		 *  - 배열객체를 더 이상 참조하지 않고 있는 참조변수로 배열객체를 엑세스 했을 때 
		 * 		NullPointerException 예외발생 
		 */
		
		// 배열의 인덱스 범위를 벗어났을 때
		int[] arr1 = {10, 20, 30};
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
	 // System.out.println(arr1[3]); // 예외발생 ArrayIndexOutOfBoundsException
		
		arr1 = null; // arr1 참조변수는 더이상 배열객체를 참조하지 않는다.
		
		System.out.println(arr1.length); // 예외발생 NullPointerException
	}

}

package array;

public class Array06 {

	public static void main(String[] args) {
		
		// 지정한 배열에 입력한 숫자가 저장한 위치를 알아내기
		// 배열에서 그 값이 저장된 위치를 조사해서 출력하기
		// 단, 그 값과 일치하는 값이 존재하지 않으면 -1을 출력한다.
		
		// 숫자가 저장된 배열
		int[] numbers = {10, 20, 30, 40, 50, 60, 70};
		
		// 40이 저장된 위치
		int position = -1;
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] == 15) {
				position = index;
				break;
			}
		}
		
		System.out.println("위치: " + position);
		

	}

}

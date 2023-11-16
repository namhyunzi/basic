package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array07 {
	

	public static void main(String[] args) {
		/*
		 * 임의의 숫자 10개가 저장되어 있는 배열을 생섷하고.
		 * 복사 시작 위치, 복사 종료 위치를 입력 받아서 
		 * 원본배열에서 해당범위의 값을 가져와서 새로운 배열을 생성하기
		 */
		
		// 정수 10개를 저장하는 배열객체를 생성하고, 그 객체의 주소값을 numbers 변수에 대입한다.
		int [] numbers = new int[10];
		
		for (int index = 0; index < numbers.length; index++) {
			// 1~100 사이의 임의의 정수를 배열에 순서대로 저장한다.
			numbers[index] = (int) (Math.random()*100) + 1;
		}
		System.out.println(Arrays.toString(numbers));
		
		// 시작위치, 종료위치를 입력받기
		
		// 표준입력장치의 입력내용을 읽어오는 Scanner 객체를 생성해서 
		// 그 객체의 주소값을 참조변수 scanner 에 대입한다.
		Scanner scanner =  new Scanner(System.in);
		
		System.out.print("시작위치 입력: ");
		int start = scanner.nextInt();
		
		System.out.print("종료위치 입력: ");
		int end = scanner.nextInt();
		
		// 원본 배열에서  시작위치부터 종료위치까지의 값을 복사해서 새로운 배열에 저장하기
		int[] dest = new int [end - start + 1];
		
		int position = 0;
		for (int index = start; index <= end; index++) {
			dest[position] = numbers[index];
			position++;
		}
		// 새 배열의 값 출력하기
		for (int value : dest) {
			System.out.print(value + " ");
		}
		System.out.println();
		
	}
}

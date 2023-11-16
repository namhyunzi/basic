package array;

import java.util.Arrays;

public class Array09 {

	public static void main(String[] args) {
		String[] names = {"홍길동", "김유신", "강감찬"};
		
		System.out.println("향상된 for문으로 배열의 모든 값을 처리하기");
		for (int index = 0; index < names.length; index++) {
			System.out.println(names[index]);
		}
		System.out.println();
		
		System.out.println("향상된 for문으로 배열의 모든 값을 처리하기");
		for (String value : names) {
			System.out.println(value);
		}
		System.out.println();
		
		System.out.println("foreach문으로 배열의 모든 값을 처리하기");
		Arrays.stream(names).forEach(value -> System.out.println(value));

	}

}

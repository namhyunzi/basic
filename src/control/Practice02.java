package control;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		/*
		 * 완료시간 출력하기
		 * 
		 * 입력으로 시작시점의 시간, 분 정보를 입력받는다.
		 * 소요시간을 분 단위로 입력받는다.
		 * 
		 * 종료시점을 시, 분 정보를 계산해서 출력한다.
		 * 
		 * 예)
		 * 시작시점의 hour : 15
		 * 시작시점의 minute : 15
		 * 소요시간(분) : 50
		 * 
		 * 종료시점? 16시 10분
		 * 
		 * 종료시점의 시간은 (시작시점의 분 + 소요시간) >=60 인 경우 증가된다.
		 */
		// 정보를 입력받기
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("시작시점의 '시간'를 입력하세요 : ");
		int startHours = scanner.nextInt();
		
		System.out.println("시작시점의 '분'을 입력하세요 : ");
		int startMinutes = scanner.nextInt();
		
		System.out.println("소요시간을 입력하세요(분) : ");
		int runningTime = scanner.nextInt();
		
		int endHours = 0;
		int endMinutes = 0;
		
		// 예상완료시간을 계산하기
		if (startMinutes + runningTime  >= 60) {
			// 총 분값을 계산한다.
			int totalMinutes = startMinutes + runningTime;
			// 총 분값을 60으로 나누어서 증가시킬 '시'를  구한다.
			int increaseHours = totalMinutes/60;
			
			// 완료시점의 '시'는 시작시점의 '시' + 증가시킬 '시'
			endHours = startHours + increaseHours;
			// 완료시점의 '분'은 총 분값에서 증가된 '시'만큼의 분값을 제외
			endMinutes = totalMinutes - (increaseHours*60);
			
		} else {
			endHours = startHours;
			endMinutes = startMinutes + runningTime;
		}
		
		// 에상완료시간을 출력하기
		System.out.println("완료시간" + endHours + "시" + endMinutes + "분");

		scanner.close();
	}

}

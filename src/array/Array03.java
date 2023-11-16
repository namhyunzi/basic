package array;

public class Array03 {

	public static void main(String[] args) {
		/*
		 * 배열 객체의 활용
		 * 	- 배열객체의 생성 목적은 같은 종류의 같은 타입의 값들을
		 * 	  하나의 이름으로 관리할 수 있다.
		 * 	- 인덱스를 활용해서 배열의 각 저장소에 쉽게 엑세스할 수 있다.
		 * 	  예) 
		 * 		회원이름 
		 * 			String name1 = "김유신"
		 * 			String name1 = "강감찬"
		 * 			String name1 = "이순신"
		 * 			String name1 = "유관순"
		 * 			
		 * 			String [] names = {"김유신", "강감찬", "이순신", "유관순"};
		 * 
		 * 		회원이름 출력하기
		 * 			System.out.println(name1);
		 * 			System.out.println(name2);
		 * 			System.out.println(name3);
		 * 			System.out.println(name4);
		 * 
		 * 			for (int index = 0; index < 4; index++) {
		 * 				System.out.println(names[index]);
		 * 			}	
		 */
		
		/*
		 * 국어점수, 영어점수, 수학점수가 저장된 배열이 각각 있다.
		 * 국어점수의 평균, 영어점수의 평균, 수학점수의 평균을 계산해서 출력하기
		 */
		
		int[] korScores = {100, 80, 80, 90, 60, 70};
		int[] engScores = {90, 80, 60, 70, 60, 60};
		int[] mathScores = {100, 60, 50, 80, 40, 60};
		
		// 합계를 계산하기
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
/*		for (int index = 0; index < korScores.length; index++) {
			korTotal += korScores[index];
		}
		for (int index = 0; index < engScores.length; index++) {
			engTotal += engScores[index];
		}
		for (int index = 0; index < mathScores.length; index++) {
			mathTotal += mathScores[index];
		}
*/
		for(int value : korScores) {
			korTotal += value;
		}
		
		for(int value : engScores) {
			engTotal += value;
		}
		
		for(int value : mathScores) {
			mathTotal += value;
		}
		
		// 평균을 계산하기
		
		int korAvg  = korTotal/korScores.length;
		int engAvg  = engTotal/engScores.length;
		int mathAvg  = mathTotal/mathScores.length;
		
		System.out.println("국어점수 평균 : " + korAvg);
		System.out.println("영어점수 평균 : " + engAvg);
		System.out.println("수학점수 평균 : " + mathAvg);
		
	}
}

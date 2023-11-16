package control;

public class IfApp03 {

	public static void main(String[] args) {
		// 주차 정산시스템
		// 주차비는 3000원
		// 1시간 초과후에는 10분마다 1000원식 주차비가 추가된다.
		// 1시간 미만이어도 1시간 요금이 적용된다.
		// 차량배기량이 900cc 미만은 50%할인이 적용된다.
		
		// 기본요금
		int defaultPay = 3000;
		// 10분당 초과요금
		int payPer10Minutes = 1000;
		
		// 배기량
		int engineDisplacement = 600;
		// 총 주차시간 (분단위)
		int minutes = 85;
		
		//주차비 
		int pay = 0;
			// 1시간 미만일때는 기본요금이 적용된다.
		if(minutes < 60) {
			pay = defaultPay;
		} else {
			// 1시간을 초과한 경우에는 10분단위로 초과요금이 적용된다.
			
			// 초과된 시간을 계산한다.(분단위)
			minutes -= 60;
			// 초과횟수를 계산한다.
			int times = minutes/10;
			
			pay = defaultPay + payPer10Minutes*times;
		}
		
		System.out.println("총 주차요금: " + pay);
		// 배기량이 900cc 미만인 경우 할인을 적용한다.
		 if (engineDisplacement < 900) {
			 pay /= 2;
		 }
		 
		 System.out.println("총 결제금액 :" + pay);
	}

}

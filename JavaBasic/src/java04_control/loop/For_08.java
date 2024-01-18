package java04_control.loop;

public class For_08 {

	public static void main(String[] args) {

		   //Quiz.
	//   첫날에 10원을 예금하고,
	//   다음날에는 전날의 2배를
	//   예금하는 방식으로
	//   보름(15일) 동안 저축한 금액은?
//	      -> 327670
		
		int day ;	//날짜
		int money = 10; // 예금액
		int sum = 0;// 총 금액
		
		for(day = 0; day<15; day++) {
		sum = sum + money;
		
		System.out.println((day+1) + "일, 예금액: " + money);
		System.out.println((day+1) + "일, 총금액: " + sum);
		System.out.println("----------------------------------------");
		 money = money * 2 ;
		 
		 
		}
		System.out.println(sum);
		
	}

}

package java04_control.loop;

public class For_05 {

	public static void main(String[] args) {

		//	1부터 10까지의 총합 구하기
		//	-> 55
		// - -----------------------------------------------------------------------------------------------------
		int i =0;
		int sum = 0;
//		for (i = 0; i<=10; i++) {
//			sum = sum +i ;
//			
//		}
//		System.out.println(sum);
		
		
		for (i = 0; i<10; i++) {
			sum = sum + (i+1) ;
			
		}
		System.out.println(sum);
		
		
		
		
	}

}

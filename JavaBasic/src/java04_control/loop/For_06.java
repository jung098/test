package java04_control.loop;

public class For_06 {

	public static void main(String[] args) {

		//Quiz.
		//구구단 2단 출력하기
		
		//출력 예시)
		// 2 x 1 = 2
		// 2 x 2 = 4
		// 2 x 3 = 6 . . .
		
		
		for (int i =1; i<10;  i++) {
			System.out.println("2 x " + i + " = " + 2*i);
			
		}
		//반복횟수: 9번
		//반복구간: 1~9
		
		//수행작업 : i값의 출력, 2*i값의 출력
//		int dan=2;
		final int dan = 2;
		for (int i =1; i<10;  i++) {
			System.out.println(dan + " x " + i + " = " + (dan*i));
			
		}
		
		
	}

}

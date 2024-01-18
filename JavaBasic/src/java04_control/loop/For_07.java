package java04_control.loop;

public class For_07 {

	public static void main(String[] args) {

		//제어문 중첩시켜 사용하기
		
		//for문과 if문 중첩
		
		for(int i=0; i<10; i++) {
			
			if( i%2 ==0  ) {
				System.out.println("짝수: " +i);	
			
			}
		}
		System.out.println("-------------------------");
		
		for(int i=0; i<10; i+=2) {
		System.out.println("짝수 : " + i);}
		
	}

}

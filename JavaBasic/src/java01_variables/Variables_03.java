package java01_variables;

public class Variables_03 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		int number;
		//변수를 처음 선언하면 "쓰레기값"이 저장되어 있다.
		
		//변수 대입(초기화)
		number = 123;
		//자바 언어는 "쓰레기값"이 저장된 변수로 사용하면 문법에러로 처리한다
		//->초기화 이후에는 정상 동작한다.
		System.out.println(number);
		int number2 = 678;
		//선언과 동시에 초기화 -> 쓰레기값이 들어가지 않고 곧바로 값을 초기화한다.		
		System.out.println(number2);
		
		double pi = 3.14;
		boolean isRight = true;
		char alpha = 'T';
		String name = "Alice";
		
		
		
		
		
		
	}
}
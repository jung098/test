package java02_operator;

public class Binary_01 {
	public static void main(String[] args) {
		
		//이항 연산자-산술
		// + - * / %
		int num1 = 16, num2 = 7;
		
		int result; //결과 값 저장변수
		
		result = num1 + num2;
//		-> result = 16 + 7;
//		-> result = 23;
		System.out.println("덧셈 결과: " + result);
		
//		% : mod연산자(modular operator) 나머지 반환하는 연산자
		
		num1 = 15;
		num2 = 6;
		
		result = num1%num2; 
		
		System.out.println(num1+ "값을" +num2+"(으)로 나눈 나머지: "+ result);
		
		System.out.println("num1 + num2="+ num1 + num2 );
		
		System.out.println("num1 + num2="+(num1 + num2) );
		System.out.println("num1 - num2="+(num1 - num2) );
		System.out.println("num1 * num2="+(num1 * num2) );
		System.out.println("num1 / num2="+(num1 / num2) );//몫
		System.out.println("num1 % num2="+(num1 % num2) );//나머지
		//산술 연산은 반드시 피연산자들의 데이터타입이 같아야된다 -> 결과값도 피연산자와 같은 데이터 타입을 얻는다
		System.out.println("num1 / num2="+((double)num1 / (double)num2) );//몫
		
	}//메인 끝
}//클래스 끝

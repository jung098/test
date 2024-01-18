package java06_class;

public class Method_02 {
	
	//매개변수(Parameter)
	// ->메소드의 ()괄호 안에 선언된 변수
	// -> 호출될 떄 입력(전달)된 데이터를 저장한다.
	
	//전달인자(Argument)
	// -> 메소드를 호출하며 ()괄호 안에 작성한 데이터이다
	// -> 호출과 함께 전달되며 매개변수에 저장된다.
	
	// 반환데이터(Retrun Data)
	//  -> 메소드의 기능이 종료되며 되돌려주는 값이다.
	
	// ---------------------------------------------------------------

	//매개변수		없음 - () 괄호 비우기
	//반환데이터	없음 - void 타입으로 작성
	public void method1() {
		System.out.println("Hello");
	}
	
	//----------------------------------------------------------------
	
	
	//매개변수		int parameter - int형 1개
	//반환 데이터	없음-void
	public void method2(int parameter) {
		System.out.println("전달된 값: " + parameter);
		
	}
	

	//----------------------------------------------------------------
	
	
	//매개변수	없음
	// 리턴데이터 6523.234 - double형 데이터
	public double method3() {
			return 6523.234;
			
//			return 5123; //정상, return 타입인 double로 자동 형변환 된다.
			
	}
		
		
	//**반환데이터타입을 void가 아닌 타입으로 명시하면
	//반드시 return코드를 작성해야한다.
	
	//------------------------------------------------------------------------------
	
	
	//매개변수		double d, int n - 2개
	//반환데이터	'A' - char형
	public char method4(double d, int n) {
		return 'A';		
		
		
	}


}

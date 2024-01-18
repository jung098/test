package java06_class;

public class MethodEx {//Executor (실행기) Ex

	public static void main(String[] args) {
		
		Method_01 m01= new Method_01();
		
		m01.hello();
		
		System.out.println("----------------------");
		
		int res = m01.subtract(44, 12);
		
		System.out.println("뻴셈 결과 : " + res);
		
		
		System.out.println("빼기: " + m01.subtract(500, 200));
//												전달인자(argument)
		
				
	}

}

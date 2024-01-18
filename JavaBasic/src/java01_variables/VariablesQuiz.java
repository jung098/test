package java01_variables;

public class VariablesQuiz {
	public static void main(String[] args) {
		
		String name = "Alice"; //이름
		int age = 99;		   //나이
		char gender = '남';	   //성별
		double height = 222.66;//키
		
		
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("성별: "+gender);
		System.out.println("키: "+height);
	
		System.out.println("이름: "+name+", 나이: "+age+", 성별: "+gender+", 키: "+height);
		
		//print() 출력은 마지막에 줄 바꿈을 하지 않는다
		
		System.out.print("AAA");
		System.out.print("BBB");
		//출력에서 줄바꿈을 해주는 코드 -> ()괄호 비우고 println
		System.out.println();
	
		System.out.print("이름: "+name);
		System.out.print(", 나이: "+age);
		System.out.print(", 성별: "+gender);
		System.out.println(", 키: "+height);
		
		System.out.println("HI HELLO HOLA");
		
		
		System.out.println("HI\nHELLO\nHOLA");
		// '\n' : 줄 바꿈 문자(개행문자), Line Feed(ASCII 10 - LF)
		System.out.println("Apple");
		
		System.out.print("Apple\n");
		
		System.out.print("Apple");
		System.out.print("\n");
		
		System.out.print("Apple");
		System.out.println();
	
		
		
	}

}

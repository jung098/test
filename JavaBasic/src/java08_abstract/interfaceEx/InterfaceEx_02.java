package java08_abstract.interfaceEx;

import java08_abstract.interfaceEx.multiple.Child;
import java08_abstract.interfaceEx.multiple.Inter_01;
import java08_abstract.interfaceEx.multiple.Inter_02;
import java08_abstract.interfaceEx.multiple.Parent;

public class InterfaceEx_02 {

	public static void main(String[] args) {
		
		
		Child c = new Child();
		c.out();
		
		System.out.println("--------------------------");
		
		
		Parent p = new Parent();
		p.out();
		
		System.out.println("------------------------");
		
		
		Parent pc = new Child();
		pc.out();//동적 바인딩 -> 자식 클래스의 메소드가 출력된다.
		
		
		System.out.println("-----------------------");
		
		Inter_01 i01;
		i01= new Child();
		
		i01.out(); //동적 바인딩
		
		
		System.out.println("----------------------");
		
		Inter_02 i02= new Child();
		i02.out();
		
		
		//** extends 클래스 , implents 인터페이스 모두 부모 데이터타입으로 사용된다
		
		
	}

		
}

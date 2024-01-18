package java05_array;

import java.util.Iterator;

public class Array_04 {

	public static void main(String[] args) {
		

		//문자열, String
		//	내부 데이터 처리로 char[] 와 비슷한 구조를 이용한다.
		
		// char[] 와 String 이 같은 타입은 아니다
		//----------------------------------------------------------------------------
		
		String str = "AppleBanana";
		
		char[]	chArr = {'A', 'p', 'p', 'p', 'e' };
	//--------------------------------------------------------------------------------
		
		System.out.println("문자열의 길이: " + str.length());

		System.out.println("char[]의 길이: " + chArr.length);

		System.out.println("----------------------");

		System.out.println("문자열의 3번쨰 글자:"+str.charAt(3));
		
		System.out.println("char[]의 2번째 인덱스 : " + chArr[2]);
		
		char[] converted = str.toCharArray();
		
		
		System.out.println(converted);
		System.out.println("-----------------------------------------");	
		
		String str2 = new String(converted);
		System.out.println(str2);
		
		//--------------------------------------------------------------------------------
		
		
		
		
	
	
	
	}

}

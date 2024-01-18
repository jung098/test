package java04_control.loop;

public class For_04 {

	public static void main(String[] args) {

		
		//'Hello" 출력하시오
		
		//반복회수 : x7
		//반복구간 : 0 ~ 6
		
		
		
		//-------------------------------------------------
		
		//초기식 : int i = 0;(i변수 선언, 반복 구간의 시작값으로 대입, 주로0)
		//조건식 : i<7;		 (i변수 검사, 반복횟수보다 작은(<,lt) 조건으로 설정)
		//증감식 : i++		 (1씩 증가)
		
		
		int i;
		for (i=0;i<7;i++) {
			System.out.println("Hello" + i);
		}
		
		
	}

}

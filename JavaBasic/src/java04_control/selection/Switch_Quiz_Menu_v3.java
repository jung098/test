package java04_control.selection;
import java.util.Scanner;
public class Switch_Quiz_Menu_v3 {

	public static void main(String[] args) {
		
	//   - 메뉴 만들기
		//
		//   ===============================
//		      M  e  n  u
		//   ===============================
//		      1. Hello World 출력
//		      2. 이름 출력
//		      3. 성별 출력
//		      4. 종료
		//   ===============================
		//
//		     >> System.out.println("===============================");
		System.out.println("     M  e  n  u");
		System.out.println("===============================");
		System.out.println(" 1. Hello World 출력");	
		System.out.println(" 2. 이름 출력");
		System.out.println(" 3. 성별 출력");
		System.out.println(" 4. 종료");
		System.out.println("=============================");
		System.out.println();
		System.out.print(">>");

		//메뉴 번호 상수
				final int HELLO_MENU =1;
				final int NAME_MENU =2;
				final int GENDER_MENU =3;
				final int EXIT_MENU =4;
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		//RunMenu객체 활성화
		//-> RunMenu클래스의 기능을 사용 할 수 있도록 연결됨
		RunMenu rm = new RunMenu();
		
		//메소드 호출 테스트
//		rm.banana();
		
			
		
		System.out.print("\t>> " );
		
		switch( num ) {
			
		case HELLO_MENU:
//			System.out.println("Hello World");
			
			rm.printHello();
			break;
		case NAME_MENU:
//			System.out.println("정우현");
			rm.printName();
			break;
			
		case GENDER_MENU:
//			System.out.println("남자입니다.");
			rm.printGender();
			break;
		case EXIT_MENU:
//			System.out.println("종료합니다.");
			rm.printExit();
			break;
		
		default:
			System.out.println("XXXXXX");
			
		}
		
		
		
		//
//		    -> 각 메뉴 번호를 입력하면 메뉴에 알맞게 동작하도록 작성
//		    -> 동작은 간단한 출력으로 해결

	}
		
}



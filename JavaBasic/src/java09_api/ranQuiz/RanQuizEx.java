package java09_api.ranQuiz;
import java.util.Scanner;
import java.util.Random;

public class RanQuizEx {

	public static void main(String[] args) {
		
		//랜덤 퀴즈 메뉴 만들기
		//	1. Up&Down 겡미
		//	2. Baskin 31 게임
		//	3. 종료
		
		RanQuiz ranQuiz = new RanQuiz();
		Random ran;
		
		ran = new Random();
		
		switch (ran.nextInt(2)+1) {
		case 1:
			ranQuiz.UpDown();
			break;

		case 2:
			ranQuiz.Beskin();
			break;
		}
		
		
		
		
	}

}

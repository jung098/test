package java09_api.ranQuiz;

import java.util.Scanner;
import java.util.Random;


public class RanQuiz {
	
	
//	 + UP&DOWN 게임
//	  - 컴퓨터가 1~50의 랜덤을 생성한다 (= com)
//	  
//	  - 사용자의 입력을 받는다 (= user)
//	 
//	  - user가 com보다 낮은지 높은지 판단하여 UP&DOWN을 출력한다
//	   (기준은 com)
//	   (ex. com == 40 && user == 30 -> UP )
//	   
//	  - user가 com과 같으면 user 승리
//	  
//	  - 7번안에 맞추지 못하면 com 승리

	private Scanner sc = new Scanner(System.in);
	private Random com = new Random();
	
	
			public void UpDown() {
				int num = com.nextInt(50) + 1;
				for( int i=0; i<10; i++ ) {
					System.out.print("숫자를 입력하세요 :");
					int user = sc.nextInt();
					if(num==user) {
						System.out.println(user + "!! 정답입니다");
						break;
					}else if(num>user) {
						System.out.println("입력된 숫자보다 큽니다." + (7-i) + "회 남았습니다.");
					}else if(num<user) {
						System.out.println("입력된 숫자보다 작습니다."+ (7-i) + "회 남았습니다.");
					
					}if(i==7) {
						System.out.println("실패하였습니다 게임을 종료합니다 정답은 : " + num);
						break;
					}
					
				}
				
			}
	
	
		
//			 + 배스킨라빈스31 게임
//			  - 컴퓨터와 사용자가 번갈아가면서 연속적으로 숫자를 말한다
//			  - 컴퓨터와 사용자는 한번의 기회에 연속된 숫자를 1개부터 3개까지
//			   말할 수 있다
//			  - 컴퓨터는 자기 순서에 랜덤한 갯수의 연속된 숫자를 말한다
//			  - 사용자는 1~3 입력을 통해 연속된 숫자를 말한다
//			  - 31을 말하는 사람이 진다
//
//
//			  * 추가 사항
//				 31에 가까워지면 컴퓨터는 랜덤이 아닌 자신이 이길수
//				있는 숫자까지만 말한다
//
//				ex. 사용자가 29까지 말했다면
//				  컴퓨터는 무조건 30까지만 말한다
			
			
			public void Beskin() {
				
			int sum=0;
				
				System.out.println("게임을 시작합니다 . " );
				for(int i = 0; i <10; i ++) {
					
					
					
					for(int j=0; j<i; j++) {
						int num = com.nextInt(2)+1;
						if(sum > num) {
							System.out.println(num);
						}
						int user = sc.nextInt();
						sum = sum+ num + user;
					}
					System.out.println(sum);
					int user = sc.nextInt();
					
				}
				
				
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}


































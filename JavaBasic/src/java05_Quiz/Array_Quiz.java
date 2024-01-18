package java05_Quiz;
import java.util.Scanner;
public class Array_Quiz {

	public static void main(String[] args) {
		
	//   5층인 건물의 인원을 입력 받도록 만든후 전체 인원이 나오도록 하게 하여라.
	//   그 후 각 층마다 관리비를 측정한다. (관리비는 인원당 12000원 이다.)
	//
	//   - 필요한 배열
//	    1. 각 층의 사는 인원을 담는 배열 arr[6]
//	      // 1~5층 과 총인원 (마지막 배열공간은 입력받은 인원의 총 합으로 사용) 
//	      
//	    2. 각 층의 관리비 배열 arr2[6]
//	      // 1~5층 과 총 관리비 금액 (마지막 배열공간은 관리비의 총 합계금액으로 사용)
	//
	//   ----------------------- 입력 (입력시 for문을 이용한다.)
	//   1층의 사는 인원은 ? 4
	//   2층의 사는 인원은 ? 5
	//   3층의 사는 인원은 ? 11
	//   4층의 사는 인원은 ? 2
	//   5층의 사는 인원은 ? 8
	//   ----------------------- 출력 (출력시 for 문을 이용한다.)
	//   1층의 총 관리비 : 48000원
	//   2층의 총 관리비 : 60000원
	//   3층의 총 관리비 : 132000원
	//   4층의 총 관리비 : 24000원
	//   5층의 총 관리비 : 96000원
	//
	//   건물에 사는 총 인원은 30명입니다.
	//   관리비의 총 금액은 360000원 입니다.   
//		--------------------------------------------------------------------------------
		
		
		int people = 0;
		int sum = 0;
		
		int [] per; //인원배열
		per = new int[6]; 
		
		int [] money; // 관리비
		money = new int[6]; //배열 요소
		
		int person; //인원수
		
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i < money.length ; i++) {
			System.out.print((i) + " 층의 사는 인원은 ? : ");
			person = sc.nextInt();
			per[i] = person;
			people = people + per[i];
			money[i] =person;
		}
		
		System.out.println();
		System.out.println("--------------------------------------");
		
		for(int j =1; j< money.length;j++) {
		System.out.println(j + "층의 관리비는 ?: " + per[j] +"명 " + money[j]* 12000);
		sum = sum + (money[j] * 12000);
		}
		
		System.out.println("모든 층의 총 인원은" + people);
		System.out.println("총 관리비는 : " + sum);


	}

}

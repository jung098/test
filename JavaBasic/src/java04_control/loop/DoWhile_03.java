package java04_control.loop;
import java.util.Scanner;
public class DoWhile_03 {

	public static void main(String[] args) {
		
		//Quiz

		// 숫자를 여러 개 입력받아 모든 값들의 총합을 구하고
		// 최종 합계를 출력하는 프로그램
		
		// -> 숫자 0을 입력하면 종료
		
		// -> do-while 구문 활용하기
		
		//--------------------------------------------------------
		

//		Scanner sc = new Scanner(System.in);
//		
//		
//		int num1;
//		int num2;
//		int sum;
//		do{//조건식
//			System.out.println("숫자를 입력하세요:");
//			num1 = sc.nextInt();
//			num2 = sc.nextInt();
//			sum=num1+num2;//증감식
//			System.out.println("입력한 수의 합은 : " + sum + "입니다.");
//		}	while(num1 * num2 !=0);
//		
		
		Scanner sc = new Scanner(System.in);
//		
//		int input;
//		int sum =0;
//		
//		do {
//			System.out.println("Input Numbe(종료 ==0) : ");
//			input = sc.nextInt();
//			
//			sum+= input;
//			
//		} while (input !=0);
//		
//		System.out.println();
//		System.out.println("최종 합계: " + sum);
	
		
		int input;
		int sum =0;
		
		while (true) {
			System.out.println("Input Numbe(종료 ==0) : ");
			input = sc.nextInt();
			
			//0입력하면 반복문 종료
			if(input ==0) {
				//반복문 중단
				break;
				
			}
			sum+= input;
			
		} 
		
		System.out.println();
		System.out.println("최종 합계: " + sum);
	
	
	}

}

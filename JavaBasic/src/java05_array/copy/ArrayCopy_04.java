package java05_array.copy;

import java.util.Iterator;
import java.util.Scanner;
public class ArrayCopy_04 {

	public static void main(String[] args) {
		
		
		//학생 성적 관리 프로그램
		// -> 국영수 3과목 점수
		
		// 점수 1개 		-> int
		// 3과목 점수		-> int[3]
		//4학생의 점수들	-> int[4][3]
		//2개의 점수들		-> int[2][4][3]
		
		
		
	      //QUIZ.
	      //   2명의 국어, 영어, 수학 점수를 처리하기
	      //   학생들의 점수를 입력받고 총점과 평균을 계산하여 출력한다 
	      
	      //   ** 2차원배열 이용해보기
	      
	      //   int[2][3] - 학생들 점수
	      //   int[2] - 학생들 총점
	      //   double[2] - 학생들 평균
	      
	      //----- 최종 출력 -----
	      //   번호   국어   영어   수학   총점   평균
	      //   1번      xxx      xxx      xxx      xxx      xxx.xx
	      //   2번      xxx      xxx      xxx      xxx      xxx.xx
		
		  //------------------------------------------------------------------------------------------------   		
		
		
			
		Scanner sc = new Scanner(System.in);
		
			int[][] score;			// - 학생들 점수
	    	int[] sum; 					//- 학생들 총점
	     	double [] avg; 					//- 학생들 평균
	     			
	     			
	     	score=new int[2][3];		
	     	sum = new int[2];
	     	avg = new double[2];
	     	
	    
	     	System.out.print("학생 성적을 입력하세요 : ");
	     	for(int i=0;i<score.length;i++) {
	     		
	     		for(int j=0; j<score[i].length;j++) {
	     			score[i][j]=sc.nextInt();
	     			System.out.print(i+1 +"번학생 성적 입력:" + score[i][j]);
	     			System.out.println();
	     			
	     			
	     		}
	     		sum[i]=score[i][0]+score[i][1]+score[i][2];
	     		avg[i]=sum[i]/3;	
	     	}
	     
	     	System.out.println("---최종 출력---");
	     	System.out.println("번호 " + "국어 "+ "영어 " + "수학 " + "총점 " + "평균 ");
	     	for (int i=0;i<score.length;i++) {
	     		System.out.printf(i+1+"번 " + (score[i][0]) +"  " + (score[i][1])+"  " + (score[i][2])+"  " + sum[i] + "  " + "%.2f",avg[i] );
	     		System.out.println();
	     		for(int j=0;j<1;j++) {
	     				
	     	}
	     		
	     }		
	     			
	     			
	
		
		
	}

}

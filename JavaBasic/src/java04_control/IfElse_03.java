package java04_control;

import java.util.Scanner;
public class IfElse_03 {

	public static void main(String[] args) {
		
		int num = 33;
		
		if(num>0 && num<=100) {
			
			System.out.println("num 은 1과 100의 사이의 정수입니다");
		}
		
		System.out.println("------------------------------");
		
		
		if (num > 0) {
			
			if(num<=100) {
				System.out.println("0보다 크다");
				System.out.println("100보다 작거나 같다");			
			}
			
			System.out.println("0보다 크다");
		
		}else{
			System.out.println("0보다 크지 않다");
			System.out.println("0보다 작거나 같다");
			
			if (num==0) {
				System.out.println("0과 같다");
				
			} else {
				System.out.println("0보다 작다");
			}
						
		}
		
		
	
	}

}

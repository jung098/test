package java04_control;

import java.util.Scanner;
public class IfElse_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input Number");
		int num = sc.nextInt();
		
		if (num%2==0) {//짝수(2의 배수)
			System.out.println(num + " = " + " 짝수입니다.");
		}
		else {//홀수 (2의 배수가 아님)
			System.out.println(num + " = " + " 홀수입니다.");
		}
		
	}

}

package java05_array.copy;

import java.util.Iterator;

public class ArrayCopy_03 {

	public static void main(String[] args) {
		
		//int형 2차언 배열 변수선언
		int[][] arr;
		
		
		arr= new int[3][];
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		
		//-------------------------------------------------------------------
		
		arr[0] = new int[5]; //0행 배열 생성
		arr[1] = new int[3]; //1행 배열 생성
		arr[2] = new int[7]; //2행 배열 생성
		
		//---------------------------------------------------------------------
		
		System.out.println(arr.length);
		
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		
		System.out.println("-----------------------");
		
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
			
		}
		
	}

}

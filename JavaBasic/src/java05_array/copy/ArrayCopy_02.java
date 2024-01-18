package java05_array.copy;

import java.util.Iterator;

public class ArrayCopy_02 {

	public static void main(String[] args) {
		
		int[] arr1 = { 50,60,70};
		int[] arr2;
		
		//1. 데이터가 복사될 공간을 새롭게 생성한다.
		arr2 = new int[arr1.length];
		
		//2. 데이터를 복사한다 - System.arrayCopy() 메소드이용
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
//		System.arraycopy(scr, srPos, dest,  destPos,  length);
		// ->src 배열을 dest 배열로 복사하는 기능
		
		// ->src	-원본배열
		// ->srcPos	-원본 배열에서 복사가 시작될 인덱스
		// ->dest	-사본 배열
		// ->destPos - 사본배열에 복사가 시작될 인덱스
		// -> lngth - 복사가 될 요소의 개수
		

	
		//** 깊은 복사, Deep Copy
		// 참조 대상의 내용물을 새로운 공간에 복사하는 것
		// 원본과 사본이 서로 분리된 별개의 공간을 가진다
		
		
		System.out.println("arr1 : " + arr1 + ",arr2 : " + arr2);
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[1] + " : " + arr2[i]);
			
			
			
		}
		
	}

}

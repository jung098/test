package Array_sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		//버블 정렬
		//-------------------------------
		int[] arr= {3,2,5,4,1};
		
		//--원본 출력--
		System.out.println("--정렬 전 ---");
		for (int i =0; i < arr.length; i++) {
			System.out.print(arr[i] + "");
			
		}
		System.out.println();

		//--- 버블 정렬 수행 ---
		for (int i=arr.length-1; i>0; i--) {
			
			for(int j =0;j<i;j++) {
				
				if(arr[j]>arr[j+1]) {
					
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		
		
		System.out.println();
		//--- 결과 출력 ---
		System.out.println();
		System.out.println("--정렬 후  ---");
		for (int i =0; i < arr.length; i++) {
			System.out.print(arr[i] + "");
			
		}
		System.out.println();
		
		System.out.println("---------------------------");
		
		int []arr2 = {123,43,456,456,423,};
		
		Arrays.sort( arr2);
		System.out.println(Arrays.toString(arr2));
		for(int i=0;i<arr2.length;i++) {
		System.out.println(arr2[i]);
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package java05_Quiz;
public class Array_Quiz2 {

	public static void main(String[] args) {
		
//		 - arr 배열을 invert_arr라는 배열에 거꾸로 입력하시오
//		 => invert_arr : { 21, 13, 9, 8, 10, 27, 9, 3, 17, 10 }
		
			int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
			
			int []invert_arr = new int[arr.length];
		
			
			for(int i=0; i < arr.length; i++) {
			invert_arr[arr.length -1-i] = arr[i];
		
		}
			
			for(int i =0; i<invert_arr.length;i++) {
				System.out.print(invert_arr[i] + " ");
			}
			System.out.println();

	
	}

}

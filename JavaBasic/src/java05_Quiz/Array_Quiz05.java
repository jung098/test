package java05_Quiz;

public class Array_Quiz05 {

	public static void main(String[] args) {
		 int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		 
		 int result = 0;
		 
		 for (int i =0;i<arr.length; i++) {
			 if (i%2 ==0) {
				 result += arr[i];
			 }else {
				 result -= arr[i];
			 }
		 }
		 System.out.println(result);
		 
		 System.out.println("--------------------------------");
		 
		 int sumEven=0;
		 int sumOdd=0;
		 
		 for (int i =0; i < arr.length; i+=2) {
			 sumEven += arr[i];
		 }
		 for (int i =1; i < arr.length; i+=2) {
			 sumOdd += arr[i];
		 }
		 
		 System.out.println("결과 : " + (sumEven-sumOdd));
		 
		 
		 System.out.println("-----------------------------------");
		 
		 
		 
		 
		 

		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}

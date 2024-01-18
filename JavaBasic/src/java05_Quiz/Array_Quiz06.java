package java05_Quiz;

public class Array_Quiz06 {

	public static void main(String[] args) {
		
//		- arr 배열의 숫자들 중 높은 숫자가 1등이 되게하여
//		 rank_arr라는 배열에 순위를 입력하시오
//		   => arr :     { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 }
//		    => rank_arr :{  5,  3, 10,7,  1,  5, 9, 7,  4,  2 }








		        // 주어진 배열
		        int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};

		        // 각 요소의 순위를 저장할 배열
		        int[] rank_arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

		        // 각 요소의 순위를 정렬된 순서에 기반하여 계산
		        for (int i = 0; i < arr.length; i++) {
		         
		        	// 각 요소의 순위를 1로 초기화
		            rank_arr[i] = 1;

		            // 현재 요소와 다른 모든 요소를 비교
		            for (int j = 0; j < arr.length; j++) {
		            	
		                // 만약 현재 요소가 다른 요소보다 작다면, 순위를 증가
		                if (arr[i] < arr[j]) {
		                    rank_arr[i]++;
		                }
		            }
		        }

		        // 순위 배열을 출력
		        for (int i = 0; i < rank_arr.length; i++) {
		            System.out.print("  " + rank_arr[i]);
		        }
		        
		        
//				주어진 배열 arr은 순위를 매길 요소들을 포함합니다.
//				rank_arr은 각 요소의 순위를 저장하기 위해 초기화됩니다.
//				첫 번째 루프는 배열 arr의 각 요소를 반복합니다.
//				첫 번째 루프 내에서 두 번째 루프는 현재 요소를 배열의 다른 모든 요소와 비교하여 순위를 결정합니다.
//				현재 요소가 다른 요소보다 작으면 순위를 증가시킵니다.
//				마지막 루프는 각 요소의 순위를 원래 배열에서 출력합니다.
		    }
		}
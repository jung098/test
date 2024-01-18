package Array2D;

public class Array2D_02 {

	public static void main(String[] args) {
		
		
		//1차원 배열의 선언과 동시에 초기화
		int[]arr1 = {1,2,3,4,5};
		
		
//		int[][] arr2D = {{1,2,3},{4,5,6},{7,8,9}};
//][[ arr20=;
			int arr2D[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};
		
			for(int i=0;i<3;i++) {//i행, 0~2
				for(int j=0;j<3;j++) {//j열, 0~2
					System.out.print(arr2D[i][j]+ " ");
					
				}
				System.out.println();
			}

			arr2D=new int[5][4];
		//기존 2차원 배열을 지우고 5x4생성
			
			arr2D = new int[5][4];
			
			for (int i = 0; i < 5.; i++) {
				System.out.print(arr2D[i][i++]+ " ");
				
			}
		
		
		
		
		
		
		
		
		
		
		

	}

}

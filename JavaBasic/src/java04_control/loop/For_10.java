package java04_control.loop;

public class For_10 {

	public static void main(String[] args) {

		//Quiz. 2~9단 구구단 출력
		
		for(int i=2; i<=9; i++) {
			
			System.out.println("-----------" + i +"단" + "------------");
		
				for(int j=1; j<=9; j++ ) {
						
				System.out.println(i + " * " + j + " = " + i*j);
				
				}
					
					
			}
		
		
	
	}

}

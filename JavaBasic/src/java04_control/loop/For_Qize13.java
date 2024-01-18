package java04_control.loop;

public class For_Qize13 {

	public static void main(String[] args) {

		
		final int LINE = 4;
	
		for(int i = 0; i < LINE; i++) {
			
			for(int j =0; j < LINE-i-1;j+=2) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1 ; j++) {
				System.out.print("*");
				
			}
		
			System.out.println();
		}
		
		
	}
	
}
package java04_control.loop;

public class For_Qize11 {

	public static void main(String[] args) {

		
		final int LINE=9;
		
		
		for(int i=0; i<LINE; i++) {
			
			if ( i < LINE/2) {
			for (int j=0; j<i+1; j++) {
				System.out.print("*");
				}
			
			}else {
				
			for(int j=0; j<LINE-i; j++) {
				System.out.print("*");
				
			}
			
		}
		
			System.out.println();
			
		
		
	}
	
}
}
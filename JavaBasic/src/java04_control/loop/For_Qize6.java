package java04_control.loop;

public class For_Qize6 {

	public static void main(String[] args) {

		
		System.out.println("Q6");
		int i=0;
		int j=0;
		for (i = 0 ; i<5; i++) {
			for (j = 0 ; j<5;j++) {
				System.out.print(j+1+i);
			}
			System.out.println();
		}
		System.out.println("---------------------");
		
	
		for (i = 0 ; i<5; i++) {
			for (j = i+1 ; j<i+1+5;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		

		
		
		
	
	}

}

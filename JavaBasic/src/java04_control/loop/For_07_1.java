package java04_control.loop;

public class For_07_1 {

	public static void main(String[] args) {


		
		int money = 10; 
		int sum = 0;
		
		for(int day = 0; day<15; day++) {
		sum = sum + money;
		money = money * 2 ;
		 
		 
		}
		System.out.println(sum);
		
	}

}

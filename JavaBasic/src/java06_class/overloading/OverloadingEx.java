package java06_class.overloading;

public class OverloadingEx {
	
	public static void main(String[] args) {
		
		
		Overloading ol = new Overloading();
		
		System.out.println("----display() ------");
		
		ol.setX(44);
		ol.setY(55);
		ol.display();
		
		System.out.println("-----------------------");
		
		//x, y를 111,222로 입력하고 출력
		ol.display(1, 3);
		
		
	}

}

package java06_class.uml;

import java06_class.overloading.Constructor;

public class CarEx {

	public static void main(String[] args) {
		
		//---------------------------------------------------------
//		Car Car01;
//		
//		Car01 = new Car("케스퍼", "레드");
//		 System.out.println(Car01.getModel() + "컬러는 : " + Car01.getColor() + "입니다.");
//			
		
		
		
		
		
		Car car = new Car("K5","Black");
		car.display(null);
		
		car.setModel("모닝");
		car.setColor("White");

		
		System.out.println(car.getModel());
		System.out.println(car.getColor());
		
		
		
		
		
		
		
		


	}

}

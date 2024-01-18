package java07_inherit.practice.model;


public class Circle extends Point{
	
//	+ 자식클래스 : Point상속받음
//	  - 자식클래스 1 : java07_inherit.practice.model.Circle.java
//
//		--- Field ---
//		- radius : int
//
//		--- Constructor ---
//		+ Circle()
//		+ Circle(x:int, y:int, radius:int)
//			//x, y는 부모생성자로 넘김
//			//center point(중심점)로 취급
//
//		--- Method ---
//		+ Getter, Setter 구현
//		+ draw() : void //원의 x, y좌표, 면적과 둘레 계산 출력함
//				java.lang.Math.PI 사용함
//		* 원면적 = PI * radius * radius;
//		* 원둘레 = 2 * PI * radius;
//		* 면적과 둘레는 모두 반올림하여 소숫점 아래 첫째자리까지 처리할 것

//	--- Field ---
//	- radius : int
	
	private int radius; //반지름
		
	
	
	
//	--- Constructor ---
//	+ Circle()
//	+ Circle(x:int, y:int, radius:int)
//		//x, y는 부모생성자로 넘김
//		//center point(중심점)로 취급
//
	
	public Circle() {}
	

	
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.print("중심점 : ");
		super.draw();
		
		//원의 면적
		System.out.printf("면적 : %.1f",(Math.PI * radius * radius));
		System.out.println();
		//원의 둘레
		System.out.printf("원의 둘레 : %.1f ", ( 2 *  Math.PI * radius));
		System.out.println();
		
		
		
//		System.out.println("("  + x + " , "  + y  + ")");
//		System.out.println("원의 면적은 : " + radius * radius * Math.PI);
//		System.out.println("원의 둘레 : " + 2 *  Math.PI * radius);
	}
	
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
}

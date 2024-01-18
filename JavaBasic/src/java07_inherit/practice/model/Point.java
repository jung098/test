package java07_inherit.practice.model;


public class Point {
//
//	--- Field ---
//	# x : int
//	# y : int
	protected int  x; //x좌표
	protected int  y;	//y좌표
	
	
//	--- Constructor ---
//	+ Point()
//	+ Point(x : int, y : int)
	public Point() {
		
	}
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	
	
//	--- Method ---
//	+ getter, setter 구현
//	+ draw():void	//x, y 좌표값 출력 ex) (3, 4)
	
	public void draw() {
		System.out.println("(" +  x +","+ y + ")");
		
	}
	
	
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	

}

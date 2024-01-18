package java07_inherit.practice.model;

public class Rectangle extends Point{
	
	private int width;
	private int height;
	



	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	
	public void draw() {
		//기준점
		System.out.print("기준점 :");
		super.draw();
		//직사각형의 면적
		System.out.printf("면적: %.1f", (width * (double)height));
		System.out.println();
		
		//직사각형의 둘레
		System.out.printf("면적: %.1f",2* (width + (double)height));
		System.out.println();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}
	

	
	
}

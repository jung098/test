package java07_inherit.practice2.product;

public class Product {
	
	protected String model;
	protected int price;
	
	
	
	
	public Product(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}
	
	
	

	public void out() {
		System.out.println("퍼블릭 아웃");
	}


	public String getModel() {
		return model;
	}




	public void setModel(String model) {
		this.model = model;
	}




	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	

}

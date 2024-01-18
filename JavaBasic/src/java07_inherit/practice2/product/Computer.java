package java07_inherit.practice2.product;

public class Computer extends Product{
	
	private String model;
	private int price;
	
	



	
	public Computer(String model, int price) {
		super(model, price);
		this.model = model;
		this.price = price;
	}











@Override
	public void out() {
		System.out.println("Computer :"+"모델 : " + model +"가격 : "+ price);
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

package java07_inherit.practice2.person;

import java07_inherit.practice2.product.Computer;
import java07_inherit.practice2.product.Product;
import java07_inherit.practice2.product.Tv;

public class Person extends Product{
	
	private String name;
	private int money;
	private Product prod;
	
	
	public Person(String name, int money) {
		super(name, money);
		this.name = name;
		this.money = money;

	}
	
	public void buy(Tv tv) {
		System.out.println(name + "님이 " + tv.getPrice() + "를 지불하고" + tv.getModel()+"을 구매함");
		System.out.println("[잔액] " + (this.money - tv.getPrice()) + "원");
		
	}
	
	
	public void buy(Computer computer) {
		System.out.println(name + "님이 " + computer.getPrice() + "를 지불하고" + computer.getModel()+"을 구매함");
		System.out.println("[잔액] " + (this.money - computer.getPrice()) + "원");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//----------------------------------------------------------------------
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}

	

	
	
	

}

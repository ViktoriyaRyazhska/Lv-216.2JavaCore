package Lesson4Task4;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	Product(){
		this.name = "TestProduct";
		this.price = 15;
		this.quantity = 8;
	}
	
	Product(String name, int price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
package Lesson4Task4;

/**
 * @author Maria Bzhezovska
 * 
 * Create class Product with fields name, price and quantity.
 * Create four instances of type Product. 
 * Display the name and quantity of the most expensive item.
 * Display the name of the items, which has the biggest quantity.
 * 
 */
public class ProductMain {

	public static void mostExpensiveProduct(Product[] products){
		double expensiveProduct = products[0].getPrice();
		for(int i = 1; i< products.length; i++){
			if(expensiveProduct< products[i].getPrice()){
				expensiveProduct = products[i].getPrice();
			}
		}
		System.out.println("The most expensive products: ");
		for(int i = 0; i<products.length; i++){
			if(expensiveProduct == products[i].getPrice()){
				System.out.print(products[i].getName() + ", ");
				System.out.println("his quantity is " + products[i].getQuantity());
			}
		}
	}
	
	public static void productNameWithBiggestQuantity(Product [] products) {
		int biggestQuantity = products[0].getQuantity();
		for(int i = 1; i < products.length; i++){
			if(biggestQuantity < products[i].getQuantity()){
				biggestQuantity = products[i].getQuantity();
			}
		}
		System.out.println("Items with the biggest quantity: ");
		for(int i = 0; i < products.length; i++){
			if(biggestQuantity == products[i].getQuantity()){
				System.out.println(products[i].getName());
			}
		}
	}
	
	public static void main(String[] args) {
		
		Product[] products = new Product [4];
		//Product(String name, int price, int quantity)
		products[0] = new Product("Milk", 28, 3);
		products[1] = new Product("Duck", 69, 10);
		products[2] = new Product("Bread", 10, 10);
		products[3] = new Product("Fish", 69, 8);

		productNameWithBiggestQuantity(products);
		System.out.println("*************************************");
		mostExpensiveProduct(products);
	}

}

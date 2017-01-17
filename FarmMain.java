import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FarmMain {

	private static Scanner scanner;
	
	public static Set<KindOfAnimalEnum> PrintAnimalBySort(List<FarmsProducts> products) {
		System.out.println("Input class of product (1C, 2C, first, second, third):");
		String class_inputed = scanner.nextLine().toLowerCase();
		int count = 0;
		Set<KindOfAnimalEnum> animal = new HashSet<KindOfAnimalEnum>();
		for(FarmsProducts prod: products){
			if((prod.getSort() != null) && prod.getSort().toLowerCase().contains(class_inputed)){
				animal.add(prod.getKind_of_animal());
				count++;
			}
		}
		if(count != 0){
			System.out.println("The kind of animal with that class of product:");
			System.out.println(animal);
		}else{
			animal.add(null);
			System.out.println("There is no kind of animal with that class of product.");
		}
		return animal;
	}

	public static void main(String[] args) throws KindOfAnimalException, IOException {
		//Fill FarmsProducts List
		List<FarmsProducts> products = new ArrayList<FarmsProducts>();
		products.add(new Eggs("chicken", 2.25, 645, "2C"));
		products.add(new Meat("PIg", 75.26, 978, "second class"));
		products.add(new Milk("goat", 25, 34, 4.0));
		products.add(new Eggs("Turkey", 8.20, 200, "1C"));
		products.add(new Meat("pig", 95.45, 862, "first class"));
		products.add(new Eggs("duck", 5.0, 453, "1C"));
		products.add(new Meat("bull", 58.90, 862, "second class"));
		products.add(new Meat("COW", 70.25, 862, "first class"));
		products.add(new Milk("goat", 18, 25, 3.2));
		products.add(new Meat("Turkey", 95.25, 154, "first class"));
		products.add(new Eggs("chicken", 2.50, 500, "1C"));
		products.add(new Milk("cow", 12.45, 574, 2.5));
		products.add(new Eggs("ostrish", 120, 57, "1C"));
		products.add(new Meat("bull", 75.45, 450, "first class"));
		products.add(new Milk("cow", 14, 602.5, 3.2));
		products.add(new Meat("pig", 63.20, 1300, "third class"));
		products.add(new Eggs("ostrish", 120, 50, "1C"));
		products.add(new Meat("cow", 58.90, 500, "second class"));
		
		//Profit Calculation
		for(int i = 0; i < products.size(); i++){
			products.get(i).calculateProfit();
			//System.out.println(products.get(i));
		}
		
		//Compare by Profit
		System.out.println("Compare by Profit:");
		products.sort(FarmsProducts.compareByProfit());
		for(FarmsProducts prod: products){
			System.out.println(prod);
		}
		
		//Compare by Animal
		System.out.println("Compare by Animal");
		products.sort(FarmsProducts.compareByAnimal());
		for(FarmsProducts prod: products){
			System.out.println(prod);
		}
		
		//Print Animals by sort of product
		scanner = new Scanner(System.in);
		Set<KindOfAnimalEnum> animal_rez = PrintAnimalBySort(products);
		
		//Save animals to file
		BufferedWriter out = new BufferedWriter(new FileWriter("Animal.txt"));
		Iterator it = animal_rez.iterator();
		while(it.hasNext()) {
		    out.write(it.next()+" ");
		    //out.write("\n");
		}
		out.close();
		
	}


}

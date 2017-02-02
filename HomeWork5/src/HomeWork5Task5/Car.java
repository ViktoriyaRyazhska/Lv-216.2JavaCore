package HomeWork5Task5;

/**
 * @author Masha
 * HomeWork 5 Task 5.
 * Create class Car with fields type, year of production and engine capacity. 
 * a) Create and initialize four instances of class Car. 
 * b) Display cars: 
 * 		i) certain model year  (enter year in the console);
 * 		ii) ordered by the field year.
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Car {
	String type;
	int year;
	double capacity;
	
	Car(){
		Random random = new Random();
		this.type = "Car_type_"+ random.nextInt(200);
		this.year = random.nextInt(47)+1970;
		this.capacity = ((double)random.nextInt(21))/10+1.4;
		//System.out.println("capacity " + capacity);
	}
	
	Car(String type, int year, double capacity){
		this.type = type;
		this.year = year;
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", year=" + year + ", capacity="
				+ capacity + "]";
	}
	
	
	
}

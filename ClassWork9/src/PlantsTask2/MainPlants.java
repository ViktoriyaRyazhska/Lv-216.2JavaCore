package PlantsTask2;

/**
 * 
 * @author Masha
 * Create a class Plants, which includes fields int size, Color color and Type type, 
 * and constructor where these fields are initialized. Color and type are Enum. 
 * Override the method toString( ). Create classes ColorException and TypeException 
 * and describe there all possible colors and types of plants. In the method main 
 * create an array of five plants. Check to work your exceptions.
 * 
 */
public class MainPlants {

	public static void main(String[] args) {
		try {
		      Plants pl = new Plants("romashka", "red", 5);
		      System.out.println(pl);
		   } catch (ColorException | TypeException e) {
		      System.err.println(e.getMessage() + "\n");
		      //e.printStackTrace();
		   }
	}

}

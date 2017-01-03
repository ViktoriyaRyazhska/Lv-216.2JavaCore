package Bird;

public class Main {

	public static void main(String[] args) {
		Bird[] bird = new Bird[4];
		bird[0] = new Chicken("White", 100);
		bird[1] = new Pinguin("Black and White", 20);
		bird[2] = new Eagle("Grey", 5);
		bird[3] = new Swallow("Grey", 25);
		
		for(int i = 0; i < bird.length; i++){
			bird[i].showInfo();
		}
			
		
		

	}

}

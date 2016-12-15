package ClassWork3;

public class MainEmployee {

	public static void main(String[] args) {
		int sum = 0;
		
		Employee employee1 = new Employee();
		employee1.setName("Vasja Pupkin");
		employee1.setRate(2);
		employee1.setHours(100);
		
		Employee employee2 = new Employee("Petja Test2", 4);
		employee2.setHours(200);
		
		Employee employee3 = new Employee("Volodja V", 1, 250);
		
		sum = employee1.getHours()+ employee2.getHours() + employee3.getHours();
		System.out.println("The total hours of all workers: " + sum);
	}
}

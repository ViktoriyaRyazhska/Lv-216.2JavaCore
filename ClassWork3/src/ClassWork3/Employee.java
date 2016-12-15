package ClassWork3;

public class Employee {
	private String name;
	private double rate;
	private int hours;
	
	static int totalSum;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public static int getTotalSum() {
		return totalSum;
	}

	public static void setTotalSum(int totalSum) {
		Employee.totalSum = totalSum;
	}
	
	public Employee(){
		
	}
	
	public Employee(String name, double rate){
		this.name = name;
		this.rate = rate;
	}
	
	public Employee(String name, double rate, int hours){
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}
	
	public double salary(){
		return rate*hours;
	}
	
	@Override
	public String toString(){
		return "Employee [name= " + name + ", rate= " + rate + ", Salary= " + salary() + " ";
	}
	
	public void changeRate(double rate){
		this.rate = rate;
	}
	
	public double bonuses(){
		return salary()*0.1;
	}
	
}

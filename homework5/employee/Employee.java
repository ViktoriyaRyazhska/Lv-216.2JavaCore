package homework5.employee;

public class Employee implements Pay {
	private String name;
	private String employeeId;
	private double salary;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String name, String employeeId) {
		super();
		this.name = name;
		this.employeeId = employeeId;
	}
	
	@Override
	public String toString() {
		return "Employee " + name + ",ID " + employeeId + ", salary=" + calculatePay() + "]";
	}
	@Override
	public double calculatePay(){
		return getSalary();
	}
	
	
	



	
}

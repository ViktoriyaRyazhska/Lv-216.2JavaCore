package homework5.employee;

public class SalariedEmployee extends Employee implements Pay {
	private String socialSecurityNumber;
	private int rate;
	private int hours;

	public SalariedEmployee(String name, String employeeId, String socialSecurityNumber, int rate, int hours) {
		super(name, employeeId);
		this.socialSecurityNumber = socialSecurityNumber;
		this.rate = rate;
		this.hours = hours;
	}

	public double calculatePay() {
		super.setSalary(rate*hours);
		return super.getSalary();
	}
}

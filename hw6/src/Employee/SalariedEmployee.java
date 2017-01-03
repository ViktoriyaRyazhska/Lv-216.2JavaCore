package Employee;

public class SalariedEmployee extends Employee implements CalcPay {
	public int hourlyRate;
	public int numberOfHoursWorked;
	public String socialSecurityNumber;
	
	public SalariedEmployee() {
		super();
		
	}
	public SalariedEmployee(String employeeId, int hourlyRate,
			int numberOfHoursWorked, String socialSecurityNumber) {
		super(employeeId);
		this.hourlyRate = hourlyRate;
		this.numberOfHoursWorked = numberOfHoursWorked;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	@Override
	public void calculatePay() {
		int theAverageMonthlySalary = hourlyRate * numberOfHoursWorked;
		System.out.println("Salary = " + theAverageMonthlySalary);

		
	}
	
	
	

}

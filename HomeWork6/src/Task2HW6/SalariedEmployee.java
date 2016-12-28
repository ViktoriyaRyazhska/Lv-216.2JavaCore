package Task2HW6;

public class SalariedEmployee extends Employee implements ICalculate{

	private String name;
	private double fixedPaid;
	private String SocialSecurityNumber;
	private double averageMonthlySalary=0;
	
	public SalariedEmployee(String name, double fixedPaid, String SocialSecureNumber){
		super();
		this.name = name;
		this.fixedPaid = fixedPaid;
		this.SocialSecurityNumber = SocialSecureNumber;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFixedPaid() {
		return fixedPaid;
	}

	public void setFixedPaid(double fixedPaid) {
		this.fixedPaid = fixedPaid;
	}

	public double getAverageMonthlySalary() {
		return averageMonthlySalary;
	}

	public void setAverageMonthlySalary(double averageMonthlySalary) {
		this.averageMonthlySalary = averageMonthlySalary;
	}

	public String getSocialSecurityNumber() {
		return SocialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		SocialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public double calculatePay() {
		return averageMonthlySalary = fixedPaid;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [name=" + name + ", fixedPaid=" + fixedPaid
				+ ", SocialSecurityNumber=" + SocialSecurityNumber
				+ ", averageMonthlySalary=" + String.format("%.2f",averageMonthlySalary) + "]";
	}

}

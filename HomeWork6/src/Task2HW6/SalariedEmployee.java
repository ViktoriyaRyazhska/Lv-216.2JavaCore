package Task2HW6;

public class SalariedEmployee extends Employee {

	private double fixedPaid;
	private String SocialSecurityNumber;
	
	public SalariedEmployee(String name, double fixedPaid, String SocialSecureNumber){
		super();
		this.name = name;
		this.fixedPaid = fixedPaid;
		this.SocialSecurityNumber = SocialSecureNumber;	
	}

	public double getFixedPaid() {
		return fixedPaid;
	}

	public void setFixedPaid(double fixedPaid) {
		this.fixedPaid = fixedPaid;
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
		return "SalariedEmployee [employeeld=" + employeeld + ", "
				+ "name=" + name + ", fixedPaid=" + fixedPaid
				+ ", SocialSecurityNumber=" + SocialSecurityNumber
				+ ", averageMonthlySalary=" + String.format("%.2f",averageMonthlySalary) + "]";
	}

}

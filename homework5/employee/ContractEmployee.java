package homework5.employee;

public class ContractEmployee extends Employee implements Pay {

	private String federalTaxIdNumber;
	private double fixedPayment;

	public ContractEmployee(String name, String employeeId, String federalTaxIdNumber, double fixedPayment) {
		super(name, employeeId);
		this.federalTaxIdNumber = federalTaxIdNumber;
		this.fixedPayment = fixedPayment;
	}

	public double calculatePay() {
		super.setSalary(fixedPayment);
		return super.getSalary();
	}
}

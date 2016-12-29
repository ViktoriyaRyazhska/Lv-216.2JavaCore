package homework5.employee;


public class EmployeeMain {

	public static void main(String[] args) {

		Employee temp = new Employee();
		Employee emp[] = new Employee[5];

		emp[0] = new SalariedEmployee("Vasia", "1112231", "s134", 20, 230);
		emp[1] = new ContractEmployee("Vova", "34121", "f125", 4500);
		emp[2] = new SalariedEmployee("Dima", "543435", "s198", 22, 300);
		emp[3] = new ContractEmployee("Vania", "565331", "f137", 3500);
		emp[4] = new SalariedEmployee("Sania", "454321", "s157", 19, 260);


		for (int i = 0; i < emp.length - 1; i++) {
			for (int j = i + 1; j < emp.length; j++) {
				if (emp[i].calculatePay() < emp[j].calculatePay()) {
					temp = emp[i];
					emp[i] = emp[j];
					emp[j] = temp;

				}
			}
		}
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i]);
		}
	}

}

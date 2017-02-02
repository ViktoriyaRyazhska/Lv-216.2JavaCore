package Lesson5Task2;

import java.util.Scanner;

public class MainEmployeeL5T2 {
	
//Display arrange workers by the field salary in descending order
	public static Employee[] sortEmployeeBySalaryInDescendingOrder(Employee[] employees_array){
		
		Employee[] sorted_array = new Employee[employees_array.length];
		for(int i = 0; i < sorted_array.length; i++){
			sorted_array[i] = employees_array[i];
		}
		
		double tmp;
		for (int i = 0; i < sorted_array.length - 1; i++) {
			for (int j = i + 1; j < sorted_array.length; j++) {
				if (sorted_array[i].getSalary() < sorted_array[j].getSalary()) {
					tmp = sorted_array[i].getSalary();
					sorted_array[i].setSalary(sorted_array[j].getSalary());
					sorted_array[j].setSalary(tmp);
				}
			}
		}		
		return sorted_array;
	}
	
//Display all employees of a certain department (enter department number in the console);
	public static Employee[] employeeArrayByDepartment(Employee[] employees_array, int department) {
		
		int count = 0;
		for(int i = 0; i < 5; i++){
			if(employees_array[i].getDepartment_number() == department){
				count++;
			}
		}
		
		Employee [] department_employee = new Employee [count];
		int tmp_count_department = 0;
		for(int i = 0; i < employees_array.length; i++){
			if(employees_array[i].getDepartment_number() == department){
				department_employee[tmp_count_department] = employees_array[i];
				tmp_count_department++;
			}
		} return department_employee;
	}

	public static void main(String[] args) {
		
	//Array of  5 employees creation 
		Employee[] array_of_employees = new Employee[5];
		array_of_employees[0] = new Employee();
		array_of_employees[1] = new Employee();
		array_of_employees[2] = new Employee("Vasja", 1, 5675.89);
		array_of_employees[3] = new Employee("Petja", 2, 4525.00);
		array_of_employees[4] = new Employee("Misha", 2, 6784.05);
		
		for(Employee el: array_of_employees){
			System.out.println(el);
		}
		
		System.out.println("\n" + "Input the department number from 1 to 3, which you are interested in: ");	
		Scanner sc = new Scanner(System.in);
		int department_num = Integer.parseInt(sc.nextLine());
		
	//Display the list of Employees by entered department
		Employee[] rez_array_by_department = employeeArrayByDepartment(array_of_employees, department_num);
		if(rez_array_by_department.length != 0){
			System.out.println("\n" + "The list of employees, who work in department number " + department_num + ":");
			for(Employee el: rez_array_by_department){
				System.out.println(el);
			}
		}else System.out.println("There is No departments with entered number "+ department_num + ".");
		
	//Display full list of Employees by salary (descending)	
		Employee[] rez_array_by_salary = sortEmployeeBySalaryInDescendingOrder(array_of_employees);
		System.out.println("\n" + "The sorted list of employees by salary:");
		for(Employee el: rez_array_by_salary){
			System.out.println(el);
		}
		sc.close();	
	}
}

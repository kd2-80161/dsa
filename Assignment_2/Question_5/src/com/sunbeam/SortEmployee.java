package com.sunbeam;

public class SortEmployee {
	
	
	static void printEmployee(Employee[] employees) {
		for (Employee employee : employees) {
			System.out.println(employee.toString());
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee[] employee = new Employee[5];
		employee[0] = new Employee("Gaurav",800);
		employee[1] = new Employee("Gaurav1",900);
		employee[2] = new Employee("Gaurav2",200);
		employee[3] = new Employee("Gaurav3",100);
		employee[4] = new Employee("Gaurav4",200);
		
		System.out.println("Before Sort");
		printEmployee(employee);
		sortbysalaryEmployee(employee);
		System.out.println("After Sort");
		printEmployee(employee);
		
		

	}
	private static void sortbysalaryEmployee(Employee[] employee) {
		// TODO Auto-generated method stub
		int n = employee.length;
		for(int i=0;i<=n-1;i++) {
			int j=i;
			while(j>0 && employee[j].getSalary() < employee[j-1].getSalary()) {
				swap(j,j-1,employee);
				j--;
			}
		}
	}
	private static void swap(int j, int i, Employee[] employee) {
		// TODO Auto-generated method stub
		Employee temp = employee[j];
		employee[j] = employee[j-1];
		employee[j-1] = temp;
	}

}

package com.sunbeam;

import java.util.Scanner;

public class SearchEmployee {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		Employees[] employee = new Employees[5];
		employee[0] = new Employees(0,"Gauav",100);
		employee[1] = new Employees(1,"aaa",101);
		employee[2] = new Employees(2,"bbb",102);
		employee[3] = new Employees(3,"ccc",103);
		employee[4] = new Employees(4,"ddd",104);
		
		System.out.println("Enter the empid to search");
		int empid = Sc.nextInt();
		Sc.nextLine();
		System.out.println("Enter the name to search");
		String name = Sc.nextLine();
		System.out.println("Enter the salary to search");
		double sal = Sc.nextDouble();
		
		
		for(Employees emp:employee) {
			if(empid==emp.getEmpid()) {
				System.out.println("Employee id found");
			}
			else
				System.out.println("Not found");
		}
		
		for(Employees emp:employee) {
			if(name.equals(emp.getEname())) {
				System.out.println("Employee name found");
			}
		}
		
		for(Employees emp:employee) {
			if(sal==emp.getSalary()) {
				System.out.println("Employee salary found");
			}
		}
	}
}
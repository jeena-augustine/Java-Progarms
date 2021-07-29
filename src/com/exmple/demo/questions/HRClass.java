package com.exmple.demo.questions;

import java.util.Scanner;

public class HRClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();

		emp.setEmpId(100);

		emp.setEmpName("Anila");

		emp.setLeave(48);

		emp.setBasicSalary(12000);
		sc.close();

		System.out.println("----Employee details----");
		System.out.println("Employee Id :" + emp.getEmpId());
		System.out.println("Employee Name :" + emp.getEmpName());
		System.out.println("Employee Annual Leaves :" + emp.getAnnualLeave());

		System.out.println("Salary of Employee :" + emp.calculateSalary());
		System.out.println("updated Annual Leave Balance :" + emp.getAnnualLeave());
		//System.out.println("PF :" + emp.calculatePf());
	}

}

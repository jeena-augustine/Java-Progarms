package com.exmple.demo.questions;

public class Employee {

	private int empId;
	private String empName;
	private int basicSalary;
	private int annualLeave = 24;
	private int leave;
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	private void updateAnnualLeave(int leave2, int annualLeave2) {
		int updatedLeave=annualLeave2 - leave;
		if(updatedLeave<0)
			setAnnualLeave(0);
		else
		setAnnualLeave(annualLeave2 - leave);
		
	}

	public int getLeave() {
		return leave;
	}

	public void setLeave(int leave) {
		this.leave = leave;
	}

	public int getAnnualLeave() {
		return annualLeave;
	}

	public void setAnnualLeave(int annualLeave) {
		this.annualLeave = annualLeave;
	}

	public int calculateSalary() {
		
		int daySalary = basicSalary / 31;
		int lopAmount = 0;
		if (leave > annualLeave) {
			int lopDays = this.getLeave() - annualLeave;
			lopAmount = lopDays * daySalary;
		}
		updateAnnualLeave(leave, annualLeave);
		int salary = basicSalary - lopAmount;
		return salary;
	}
	
	
	

}
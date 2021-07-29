package com.exmple.demo.questions;

public class VirtualDemo1 {

		 public static void main(String [] args) {
		      Salaryy s = new Salaryy("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
		      Employeee e = new Salaryy("John Adams", "Boston, MA", 2, 2400.00);
		      System.out.println("Call mailCheck using Salary reference --");   
		      s.mailCheck();
		      System.out.println("\n Call mailCheck using Employee reference--");
		      e.mailCheck();
		   }


	}


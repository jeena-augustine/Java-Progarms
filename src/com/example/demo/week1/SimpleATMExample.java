package com.example.demo.week1;

import java.util.Scanner;

public class SimpleATMExample {

	private static double balance=120;
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);    
		System.out.println("------------Welcome to Banking service--------------");
		System.out.println("Please Enter your choice");
		System.out.println("1.Balance Enquiry");
		System.out.println("2.Withdraw cash");
		int input=sc.nextInt();
		switch(input) {
		case 1:{checkBalance();
		break;}
		case 2:{
			System.out.println("Please Enter the amount you want to withraw");
			int amount=sc.nextInt();
			withdrawAmount(amount);
			sc.close();
			break;
			
		}
		default:
		{
			System.out.println("Invalid choice !!!!!Please enter  1 or 2");
			break;
		}
		}
	}

	private static void withdrawAmount(int amount) {
		if(amount<balance)
		{
			balance=balance-amount;
			System.out.println("Your transaction is successful :)");
			System.out.println("Your new balance is"+balance);
		}
		else
			System.out.println("Insufficient balance!!!!!!");
		
	}

	private static void checkBalance() {
		System.out.println("Your balance is:"+balance);
		
		
	}



}

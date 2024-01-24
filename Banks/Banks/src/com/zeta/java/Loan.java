package com.zeta.java;

import java.time.LocalDate;
import java.util.Scanner;

public class Loan extends Account{
	double loanAmount;
	public Loan() {
		// TODO Auto-generated constructor stub
	}
	public Loan(int accNo, String name,LocalDate date,double loanAmount) {
		super(accNo, 0, name,date);
		this.loanAmount = loanAmount;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	@Override
	public void deposit(double amount) {
//		double amount;
//		System.out.println("Enter the amount you want to Withdraw : ");
//		Scanner sc = new Scanner(System.in);
//		amount = sc.nextDouble();
//            double newBalance = getBalance() - amount;
//            if (newBalance >= -loanAmount) {
//                setBalance(newBalance);
//            } else {
//                System.out.println("You cannot repay more than your outstanding loan balance.");
//            }
		   if(amount>loanAmount) {
			   System.out.println("You cannot repay more than your outstanding loan balance.");
		   }
		   else {
			   this.loanAmount-=amount;
			   System.out.println("Amount Deposited Sucsessfully");
		   }
    }
	@Override
	public void calInterest() {
		// TODO Auto-generated method stub
		System.out.println("Interest : " + (this.getBalance() * 0.07));
	}
	@Override
	public void display()
	{
		System.out.println("--------------------------------");
		System.out.println("\t" + "Account Details :");
		System.out.println("--------------------------------");
		System.out.println("\t" + "Account Number  : " + this.getAccNo());
		System.out.println("\t" + "Loan Amount         : " + this.getLoanAmount());
		System.out.println("\t" + "Account Holder Name : " + this.getName());
		System.out.println("--------------------------------");
	}
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
//		double amount;
//		System.out.println("Enter the amount you want to Withdraw : ");
//		Scanner sc = new Scanner(System.in);
//		amount = sc.nextDouble();
		
//            double newLoanAmount = loanAmount + amount;
//            if (newLoanAmount <= 0) {
//                loanAmount = newLoanAmount;
//                setBalance(-newLoanAmount);
//            } else {
//                System.out.println("You cannot withdraw more than your outstanding loan balance.");
//            }
		if(amount>loanAmount) {
			   System.out.println("You cannot withdraw more than your outstanding loan balance.");
		   }
		   else {
			   this.loanAmount+=amount;
			   System.out.println("Withdraw Sucsessful");
		   }
	}
}

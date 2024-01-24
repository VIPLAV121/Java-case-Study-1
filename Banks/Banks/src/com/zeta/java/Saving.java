package com.zeta.java;

import java.time.LocalDate;
import java.util.Scanner;

public class Saving extends Account {
    double minBal;
	public Saving() {
		// TODO Auto-generated constructor stub
	}
	public Saving(int accNo, double balance, String name,LocalDate date) {
		super(accNo, balance, name,date);
		this.minBal = 10000;
	}
	public double getMinBal() {
		return minBal;
	}
	public void setMinBal(double minBal) {
		this.minBal = minBal;
	}
	@Override
	public void calInterest()
	{
		//this.setBalance(this.getBalance() + this.getBalance() * 0.04);
		System.out.println("Interest : " + (this.getBalance() * 0.04));
	}
	@Override
	public void withdraw(double amt)
	{
//		System.out.println("Enter the amount you want to Withdraw : ");
//		Scanner sc = new Scanner(System.in);
//		double amt;
//		amt = sc.nextDouble();
		
		if(amt >= this.getBalance() - this.getMinBal())
		{
			System.out.println("Insufficient balance");
		}
		else
		{
			this.setBalance(this.getBalance() - amt);
			System.out.println("Withdraw Successful");
			System.out.println("Balance after withdrawl : " + this.getBalance());
		}
	}
    
}

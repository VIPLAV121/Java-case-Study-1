package com.zeta.java;

import java.time.LocalDate;
import java.util.Scanner;

public class Current extends Account {
    double overDraft;
	
	public Current() {
		// TODO Auto-generated constructor stub
	}

	public Current(int accNo, double balance, String name,LocalDate date) {
		super(accNo, balance, name,date);
		this.overDraft = 0;
		//this.intRate=1532;
	}
	
	public double getOverDraft() {
		return overDraft;
	}

	public void setOverDraft(double overDraft) {
		this.overDraft = overDraft;
	}

	public void calInterest()
	{
		//this.setBalance(this.getBalance() + this.getBalance() * 0.02);
		System.out.println("Interest : " + (this.getBalance() * 0.02));
	}
	public void withdraw(double amt)
	{
//		System.out.println("Enter the amount you want to Withdraw : ");
//		Scanner sc = new Scanner(System.in);
//		double amt;
//		amt = sc.nextDouble();
		
		if(amt >= this.getBalance() + 2000)
		{
			System.out.println("Cannot withdraw amount more than " + (this.getBalance()+2000));
		}
		else
		{
			if(this.getBalance() > amt)
			{
				this.setBalance(this.getBalance() - amt);
				//System.out.println("Withdraw Successful");
			}
			else
			{
				this.setOverDraft(amt - this.balance);
				this.setBalance(0);
			}
			System.out.println("Withdraw Successful");
			System.out.println("Balance after withdrawl : " + this.getBalance());
			System.out.println("Over draft : " + this.getOverDraft());
		}
	}
    
	
}

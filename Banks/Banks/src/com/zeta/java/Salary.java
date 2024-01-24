package com.zeta.java;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Salary extends Saving{
	
	LocalDate date;
	
	public Salary() {
		// TODO Auto-generated constructor stub
	}

	public Salary(int accNo, double balance, String name,LocalDate date) {
		super(accNo, balance, name,date);
		this.date = date;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public void withdraw(double amt) {
		
		System.out.println("Enter the date in format yyyy-mm-dd : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		LocalDate dt = LocalDate.parse(s);
		
		long m = this.date.until(dt, ChronoUnit.MONTHS);
		
		this.setDate(dt);
		
		if(m>2)
		{
			System.out.println("Your account is deactivated!!");
		}
		else
		{
			super.withdraw(amt);
		}
	}

	@Override
	public void deposit(double amt) {
		
		System.out.println("Enter the date in format yyyy-mm-dd : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		LocalDate dt = LocalDate.parse(s);
		
		long m = this.date.until(dt, ChronoUnit.MONTHS);
		
		this.setDate(dt);
		
		if(m>2)
		{
			System.out.println("Your account is deactivated!!");
		}
		else
		{
			super.deposit(amt);
		}
	}

	@Override
	public void calInterest() {
		System.out.println("Balance with Interest : " + (this.getBalance() + this.getBalance() * 0.06));
	}

}

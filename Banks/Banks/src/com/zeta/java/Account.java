package com.zeta.java;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class Account {
	int accNo;
	double balance;
	String name;
	//float intRate;
	LocalDate openingDate;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(int accNo, double balance, String name,LocalDate date) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		this.name = name;
		this.openingDate = date;
	}
	
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public float getIntRate() {
//		return intRate;
//	}
//
//	public void setIntRate(float intRate) {
//		this.intRate = intRate;
//	}

	public LocalDate getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(LocalDate openingDate) {
		this.openingDate = openingDate;
	}

	public void display()
	{
		System.out.println("--------------------------------");
		System.out.println("\t" + "Account Details :");
		System.out.println("--------------------------------");
		System.out.println("\t" + "Account Number  : " + this.getAccNo());
		System.out.println("\t" + "Balance         : " + this.getBalance());
		System.out.println("\t" + "Account Holder Name : " + this.getName());
		System.out.println("--------------------------------");
	}
	public abstract void calInterest();
	
	public abstract void withdraw(double amt);
	
	public void deposit(double amt)
	{
//		System.out.println("Enter the amount you want to deposit : ");
//		Scanner sc = new Scanner(System.in);
//		double amt;
//		amt = sc.nextDouble();
		this.setBalance(this.getBalance() + amt);
		System.out.println("Balance after deposit : " + this.getBalance());
	}
}

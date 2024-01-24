package com.zeta.java;

import java.util.Date;

public class Transactions {
	int accNo;
    String trans;
    double amount;
    Date date;
    String balance;
	public Transactions() {
		// TODO Auto-generated constructor stub
	}
	public Transactions(int accNo, String trans, double amount, Date date,String balance) {
		super();
		this.accNo = accNo;
		this.trans = trans;
		this.amount = amount;
		this.date = date;
		this.balance=balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getTrans() {
		return trans;
	}
	public void setTrans(String trans) {
		this.trans = trans;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}

}

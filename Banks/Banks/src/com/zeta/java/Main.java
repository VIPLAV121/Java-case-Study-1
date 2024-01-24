package com.zeta.java;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Date;

public class Main {
	Account[] acc = new Account[10];
	Transactions[] trans = new Transactions[20];
	int index=0;
	int accNo=0;
	int traIndex = 0;
	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main app=new Main();
		app.process();
	}
	private void process() {
		int choice = 0;
	    Scanner sc = new Scanner(System.in);		
			
	     do {
	    		 System.out.println("--------------------------------\n");
	    		 System.out.println("\t\t\tWelcome To AVP Bank\n");
	    		 System.out.println("--------------------------------");
	    		 System.out.println("What Would You Like To Do ?");
	        	 System.out.println("\t\t\t1. Create An Account");
	        	 System.out.println("\t\t\t2. Withdraw Money");
	        	 System.out.println("\t\t\t3. Deposit Money");
	        	 System.out.println("\t\t\t4. Deactivate An Account");
	        	 System.out.println("\t\t\t5. Show Interest");
	        	 System.out.println("\t\t\t6. Today's Activity Report");
	        	 System.out.println("\t\t\t7. Display Details");
	        	 System.out.println("\t\t\t8. Exit");
	        	 choice = sc.nextInt();
	        	 switch(choice) {
	        	 case 1:
	        	 {
	        		 //int bal;
	        		 //String nm;
	        		 int subchoice=0;
	        		 System.out.println("--------------------------------");
		    		 System.out.println("Select The Type Of Account You Want To Create");
		    		 System.out.println("--------------------------------");
		    		 System.out.println("\t\t\t1. Current Account");
		        	 System.out.println("\t\t\t2. Savings Account");
		        	 System.out.println("\t\t\t3. Salary Account");
		        	 System.out.println("\t\t\t4. Loan Account");
		        	 subchoice = sc.nextInt();
		        	 switch(subchoice){
		        	  case 1:{
		        		  int bal;
		        		  Date d = new Date();
							System.out.println("Enter Your Balance :");
							bal = sc.nextInt();
							String nm;
							sc.nextLine();
		        	    	System.out.println("Enter Your name :");
		        	    	nm = sc.nextLine();
							LocalDate date = LocalDate.now();
							acc[index++] = new Current(++accNo, bal, nm, date);
							trans[traIndex++] = new Transactions(accNo, "Current Account Creation", bal, d,"Opening Balance :");
							System.out.println("Account Succesfully Created");
		        	    	 System.out.println("Hello Mr./Ms. "+nm+" Your Account Number Is :"+accNo);
			        		 break;
		        	  }
		        	  case 2:
		        		  
		        	  {
		        		  int bal;
		        		  Date d = new Date();
							System.out.println("Enter Your Balance :");
							bal=sc.nextInt();
							String nm;
							sc.nextLine();
		        	    	 System.out.println("Enter Your name :");
		        	    	 nm = sc.nextLine();
							LocalDate date = LocalDate.now();
							acc[index++] = new Saving(++accNo, bal, nm, date);
							trans[traIndex++] = new Transactions(accNo, "Savings Account Creation", bal, d,"Opening Balance :");
							System.out.println("Account Succesfully Created");
		        	    	 System.out.println("Hello Mr./Ms. "+nm+" Your Account Number Is :"+accNo);
			        		 break;
		        	  }
			          case 3:{
			        	  System.out.println("Enter the date in format yyyy-mm-dd : ");
							String s = sc.next();
							double bal;
							Date d = new Date();
							System.out.println("Enter Your Balance :");
							bal=sc.nextDouble();
							String nm;
							sc.nextLine();
		        	    	 System.out.println("Enter Your name :");
		        	    	 nm = sc.nextLine();
							LocalDate date = LocalDate.parse(s);
							acc[index++] = new Salary(++accNo, bal, nm, date);
							trans[traIndex++] = new Transactions(accNo, "Salary Account Creation", bal, d,"Opening Balance :");
							System.out.println("Account Succesfully Created");
		        	    	 System.out.println("Hello Mr./Ms. "+nm+" Your Account Number Is :"+accNo);
			          }
			        		 break;
			       	  case 4:{
		        	    	 double loanAmount;
		        	    	 Date d = new Date();
		        	    	 LocalDate date=LocalDate.now();
		        	    	 String nm;
		        	    	 sc.nextLine();
		        	    	 System.out.println("Enter Your name :");
		        	    	 nm = sc.nextLine();
		        	    	 System.out.println("How Much Loan Do You Want");
		        	    	 loanAmount= sc.nextDouble();
		        	    	 acc[index++] = new Loan(++accNo, nm,date,loanAmount);
		        	    	 trans[traIndex++] = new Transactions(accNo, "Loan Account Creation", loanAmount, d,"Loan Amount :");
		        	    	 System.out.println("Account Succesfully Created");
		        	    	 System.out.println("Hello Mr./Ms. "+nm+" Your Account Number Is :"+accNo);
		        	  }
			        		 break;
			          default:
			        	  System.out.println("\t\t\tInvalid choice");
			        	  System.out.println("\t\t\tPlease Try Again ");
			        	  break;
		        	 }
	        	 }
	        		 break;
	        	 case 2:{
	        		 int x=0;
	        		 int actNo;
	        		 if(accNo==0) {
	        			 System.out.println("Please Create An Account First");
	        			 break;
	        		 }
	        		 System.out.println("Enter Your Account Number");
	        		 actNo=sc.nextInt();
	        		 for(int ctr=0;ctr<=accNo;ctr++) 
	        		 {
	        			 if(actNo==acc[ctr].accNo)
	        			 {
	        				 System.out.println("Enter the amount you want to Withdraw : ");
	        				 double amt;
	        				 amt = sc.nextDouble();
	        				 Date d = new Date();
	        				 acc[ctr].withdraw(amt);
	        				 x++;
	        				 trans[traIndex++] = new Transactions(actNo, "Withdraw", amt, d,"Amount Withdrawn :");
	        				 break;
	        			 }
	        		 }
	        		 if(x==0)
	        			{
	        				System.out.println("Acount Number "+acc+" Does Not Exist");
	        			}
	        	 }
	        		 break;
	        	 case 3:{
	        		 int x=0;
	        		 int actNo;
	        		 if(accNo==0) {
	        			 System.out.println("Please Create An Account First");
	        			 break;
	        		 }
	        		 System.out.println("Enter Your Account Number");
	        		 actNo=sc.nextInt();
	        		 for(int ctr=0;ctr<=accNo;ctr++) 
	        		 {
	        			 if(actNo==acc[ctr].accNo)
	        			 {
	        				 System.out.println("Enter the amount you want to Deposit : ");
	        				 double amt;
	        				 amt = sc.nextDouble();
	        				 Date d = new Date();
	        				 acc[ctr].deposit(amt);
	        				 x++;
	        				 trans[traIndex++] = new Transactions(actNo, "Deposit", amt, d,"Amount Deposited :");
	        				 break;
	        			 }
	        		 }
	        		 if(x==0)
	        			{
	        				System.out.println("Acount Number "+acc+" Does Not Exist");
	        			}
	        	 }
	        		 break;
	        	 case 4:
	        	 {
	        		 int x=0;
	        		 int actNo;
	        		 if(accNo==0) {
	        			 System.out.println("Please Create An Account First");
	        			 break;
	        		 }
	        		 System.out.println("Enter The Account Number");
	        		 actNo=sc.nextInt();
	        		 Date d = new Date();
	        		 for(int ctr=0;ctr<=accNo;ctr++) 
	        		 {
	        			 if(actNo==acc[ctr].accNo)
	        			 {
	                         for(int y=ctr;y<index;y++) {
	                        	 acc[y]=acc[y+1];
	                        	 
	                         }
	                         trans[traIndex++] = new Transactions(actNo, "Account De-Activation", 0, d,"Balance Left :");
	                         x++;
	        				 break;
	        			 }
	        		 }
	        		 if(x==0)
	        			{
	        				System.out.println("Acount Number "+acc+" Does Not Exist");
	        			}
	        	 }
	        		 break;
	        	 case 5:
	        	 {
	        		 int x=0;
	        		 int actNo;
	        		 if(accNo==0) {
	        			 System.out.println("Please Create An Account First");
	        			 break;
	        		 }
	        		 System.out.println("Enter Your Account Number");
	        		 actNo=sc.nextInt();
	        		 for(int ctr=0;ctr<=accNo;ctr++) 
	        		 {
	        			 if(actNo==acc[ctr].accNo)
	        			 {
	        				 acc[ctr].calInterest();
	        				 x++;
	        				 break;
	        			 }
	        		 }
	        		 if(x==0)
	        			{
	        				System.out.println("Acount Number "+acc+" Does Not Exist");
	        			}
	        	 }
	        		 break;
	        	 case 6:{
	        		 if(traIndex==0)
	        		 {
	        			 System.out.println("No Transactions To Display");
	        			 break;
	        		 }
	        		 else {
	        			 int ctrr;
		        		 for(ctrr=0; ctrr<traIndex; ctrr++)
		        		 {
		        			 System.out.println("--------------------------------");
		        			 System.out.println("Account Number : "+trans[ctrr].accNo);
		        			 System.out.println("Transaction Type : "+trans[ctrr].trans);
		        			 System.out.println(trans[ctrr].balance+""+trans[ctrr].amount);
		        			 System.out.println(trans[ctrr].date);
		        			 System.out.println("--------------------------------");
		        		 }
	        		 }
	        	 }
	        		 
	        		 break;
	        	 case 7:{
	        		 int x=0;
	        		 int actNo;if(accNo==0) {
	        			 System.out.println("Please Create An Account First");
	        			 break;
	        		 }
	        		 System.out.println("Enter Your Account Number");
	        		 actNo=sc.nextInt();
	        		 for(int ctr=0;ctr<=accNo;ctr++) 
	        		 {
	        			 if(actNo==acc[ctr].accNo)
	        			 {
	        				 acc[ctr].display();
	        				 x++;
	        				 break;
	        			 }
	        		 }
	        		 if(x==0)
	        			{
	        				System.out.println("Acount Number "+acc+" Does Not Exist");
	        			}
	        	 }
	        		 break;
	        	 case 8:
	        		 System.out.println("\t\t\tThank You");
	        		 System.out.println("\t\t\tVisit Again");
	        		 break;
	             default:
	            	 System.out.println("\t\t\tInvalid choice");
	        		 System.out.println("\t\t\tPlease Try Again ");
	            	 break;
	        	 }
	    	 }while(choice!=8);
	}
}

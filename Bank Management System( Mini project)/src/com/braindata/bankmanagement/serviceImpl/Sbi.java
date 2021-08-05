package com.braindata.bankmanagement.serviceImpl;

import java.util.Scanner;

import com.braindata.bankmanagement.model1.Account;
import com.braindata.bankmanagement.serviceI.Rbi;

public class Sbi implements Rbi{
	Scanner sc=new Scanner(System.in);
	Account a=new Account();
	int count=0;

	@Override
	public void createAccount() {
		System.out.println("create account");
		
		System.out.println("Enter name:");
		String name=sc.next();
		a.setName(name);
		System.out.println("Enter mob no");
		String mobNo=sc.next();
		a.setMobNo(mobNo);
		System.out.println("Enter Aadhar number");
		String adharNo=sc.next();
		a.setAdharNo(adharNo);
		System.out.println("Enter gender");
		while(true)
		{
		String gender=sc.next();
		if(gender.equalsIgnoreCase("Male")||gender.equalsIgnoreCase("M"))
		{
		a.setGender(gender);
		}
		else
		{
			System.out.println("please enter correct gender");
		}
	
		
		System.out.println("Enter age");
		while(true)
		{
			int age=sc.nextInt();
			if(age>=18)
			{
				a.setAge(age);
				break;
			}
			else
			{
				System.out.println("please enter the correct age above 18");
			}
		}
		
		
		System.out.println("Enter account number:");
		
		String accNo=sc.next();
		a.setAccNo(accNo);
		
		
		System.out.println("Enter Balance minimum 500");
		double balance=sc.nextDouble();
		a.setBalance(balance);
		count++;
		}
		
	
		
	}

	@Override
	public void displayAllDetails() {
		
		if(count==0)
		{
			System.out.println("Account not created");
		}
		else 
		{
			System.out.println("Display all details");
			System.out.println("Account number="+a.getAccNo());
			System.out.println("Name="+a.getName());
			System.out.println("Mob No="+a.getMobNo());
			System.out.println("Aadhar No="+a.getAadharNo());
			System.out.println("Age="+a.getAge());
			System.out.println("Balance"+a.getBalance());
			
			
			
		}
		
	}

	@Override
	public void depositMoney() {
		System.out.println("Deposit money");
		
		
	}

	@Override
	public void moneyWithdrawal() {
		System.out.println("Withdrawal");
		
		
	}

	@Override
	public void balanceCheck() {
		System.out.println("Balance check");
		
		
	}
	
	
	

}

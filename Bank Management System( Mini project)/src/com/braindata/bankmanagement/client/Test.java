package com.braindata.bankmanagement.client;

import java.util.Scanner;

import com.braindata.bankmanagement.serviceI.Rbi;
import com.braindata.bankmanagement.serviceImpl.Sbi;

public class Test {
	public static void main(String[] args) {
		Rbi bank=new Sbi();
		Scanner sc=new Scanner(System.in);
		System.out.println("your choice");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:    bank.createAccount();
		           break;
		           
		           
		case 2:    bank.displayAllDetails();
		           break;
		     
		case 3:    bank.depositMoney();
                   break;
        
        
        case 4:    bank.moneyWithdrawal();
                   break;           
		           
		           
        case 5:    bank.balanceCheck();
                   break;     
		           
        
		default:
			    System.out.println("Select correct choice");
		
		
		
		
		
		
		
		
		
		}
	}

}

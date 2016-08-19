package com;

import java.util.Scanner;

public class InteractiveVault {

	public static void main(String[] args) {
		// This class has the interactive methods to the console
		
		Scanner scan= new Scanner(System.in);
		String accountName;
		String userName;
		String password;
		int choice;
		System.out.println("Please enter your choices");
		System.out.println("1.Add New Credentials");
		System.out.println("2.Update Credentials");
		System.out.println("3.Delete Credentials");
		System.out.println("4.View All Credentials");
		choice=scan.nextInt();
		if(choice==1)
		{
			
			System.out.println("Please enter the accountname");
			accountName=scan.next();
			System.out.println("Please enter the UserName");
			userName=scan.next();
			System.out.println("Please enter the Password");
			password=scan.next();
			Credential c=new Credential(accountName, userName, password);
			
		}
		if(choice==2)
		{
			
			System.out.println("Please enter the accountname");
			accountName=scan.next();
			System.out.println("Please enter the UserName");
			userName=scan.next();
			System.out.println("Please enter the Password");
			password=scan.next();
			Credential c=new Credential(accountName, userName, password);
		}
		if(choice==3)
		{
			
			System.out.println("Please enter the accountname");
			accountName=scan.next();
			System.out.println("Please enter the UserName");
			userName=scan.next();
			System.out.println("Please enter the Password");
			password=scan.next();
			Credential c=new Credential(accountName, userName, password);
		}
		if(choice==4)
		{
			
			System.out.println("Please enter the accountname");
			accountName=scan.next();
			System.out.println("Please enter the UserName");
			userName=scan.next();
			System.out.println("Please enter the Password");
			password=scan.next();
			Credential c=new Credential(accountName, userName, password);
		}
		

	}

}

package com;

public class Credential {
	
	String accountName;
	String userName;
	String password;
	
	public Credential(String accountName,String userName,String password)
	{
		this.accountName=accountName;
		this.userName=userName;
		this.password=password;
	}
	
	public void getCredentials()
	{
		System.out.println(accountName+" "+userName+" "+password);
	}

}

package com.payment;

import java.util.Scanner;
public class CreditCard extends Payment
{

	Scanner sc = new Scanner(System.in);
	public CreditCard(int amount, String transactionId)
	{
		super(amount, transactionId);
	}
	public void makePayment()
	{
		
		System.out.print("Enter the sending amount : ");
		int tnxAmount=sc.nextInt();
		if(tnxAmount<getAmount())
		{
			System.out.println("Payment done using Credit card");
			setAmount(getAmount()-tnxAmount);//This is the extra functionalites that I had added
			System.out.println("Updated balance : "+getAmount());//This is the extra functionalites that I had added
		}
		else
		{
			System.out.println("Not enough money...");
		}
	}
}

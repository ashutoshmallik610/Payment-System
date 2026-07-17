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
			System.out.println("CreditCard.makePayment(Payment done using CreditCard)");
			setAmount(getAmount()-tnxAmount);
			System.out.println("Updated balance : "+getAmount());
		}
		else
		{
			System.out.println("Not enough money...");
		}
	}
}

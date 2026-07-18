package com.payment;

public class Payment 
{
	private int amount;
	private String transactionId;
	
	public Payment(int amount, String transactionId) 
	{
		setAmount(amount);
		this.transactionId = transactionId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) 
	{
		if(amount>0)
		{
		this.amount = amount;
		}
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
	public void makePayment()
	{
		
	}
}

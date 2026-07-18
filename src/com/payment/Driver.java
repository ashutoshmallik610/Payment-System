package com.payment;

import java.util.Scanner;
public class Driver {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Paymentprocessor paymentprocessor = new Paymentprocessor();
		
		System.out.println("Choose Payment Type");
        System.out.println("1. UPI");
        System.out.println("2. CreditCard");
        System.out.println("3. Netbanking");
        int choice=sc.nextInt();
		
        System.out.println("Enter the amount : ");
        int amount=sc.nextInt();
        
		switch(choice)
        {
            case 1:
            	UPI upi = new UPI(amount,"345SDFGFDDF");
            	paymentprocessor.processPayment(upi);
                break;
            case 2:
            	CreditCard creditcard = new CreditCard(amount,"978DF4545F");
            	paymentprocessor.processPayment(creditcard);
                break;
            case 3:
            	Netbanking netbanking = new Netbanking(amount, "7654345678");
            	paymentprocessor.processPayment(netbanking);
            default:
                System.out.println("Invalid Choice");
        }

	}

}

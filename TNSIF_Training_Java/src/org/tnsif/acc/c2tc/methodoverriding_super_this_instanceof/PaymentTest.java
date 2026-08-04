package org.tnsif.acc.c2tc.methodoverriding_super_this_instanceof;
//parent class
class Payment
{
	void makePayment()
	{
		System.out.println("Processing payment using generic method");
	}
}
class UpiPayment extends Payment
{
	void makePayment()
	{
		System.out.println("Payment made using UPI");
	}
}
class CardPayment extends Payment
{
	void makePayment()
	{
		System.out.println("Payment made using Credit/Debit card");
	}
}
class WalletPayment extends Payment
{
	void makePayment()
	{
		System.out.println("Payment made using WalletPayment ");
	}
}

public class PaymentTest {

	public static void main(String[] args) {
		Payment payment; //reference for parent class
		
		payment=new UpiPayment();
		payment.makePayment();
		
		payment=new CardPayment();
		payment.makePayment();
		
		payment=new WalletPayment();
		payment.makePayment();

	}

}
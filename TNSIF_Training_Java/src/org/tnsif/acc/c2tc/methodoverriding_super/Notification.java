package org.tnsif.acc.c2tc.methodoverriding_super;

class Payment1
{
	void process()
	{
		System.out.println("Processing payment using standard gateway");
	}
}
class GPay extends Payment1
{
	void process()
	{
		System.out.println("Processing payment via google pay");
	}
	void completeTransaction()
	{
		super.process();
		process();
	}
}
public class Notification {

	public static void main(String[] args) {
		GPay obj=new GPay();
		obj.completeTransaction();

	}

}
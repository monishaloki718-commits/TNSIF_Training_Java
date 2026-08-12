package org.tnsif.acc.c2tc.interfacedemo;

@FunctionalInterface
interface NotificationService
{
	void notifyUser(String message);
	
}
class EmailNotification implements NotificationService
{

	@Override
	public void notifyUser(String message) {
		System.out.println("Sending Email : "+message);
		
	}
	
}
class SMSNotification implements NotificationService
{

	@Override
	public void notifyUser(String message) {
		System.out.println("Sending SMS "+message);
	}
	
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		NotificationService email=new EmailNotification();
		email.notifyUser("Meeeting at 10am");

		NotificationService sms=new SMSNotification();
		sms.notifyUser("Assisgnment Upload");
		
		
	}

}
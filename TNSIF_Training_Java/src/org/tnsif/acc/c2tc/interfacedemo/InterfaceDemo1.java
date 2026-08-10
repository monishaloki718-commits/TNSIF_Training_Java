package org.tnsif.acc.c2tc.interfacedemo;

class SmartLight implements SmartDevice
{

	@Override
	public void turnon() {
		System.out.println("SmartLight is on");
		
	}

	@Override
	public void turnoff() {
		System.out.println("SmartLight is off");
		
	}

	@Override
	public void getStatus() {
		System.out.println("SmartLight is on standby mode");
	}
	
}

public class InterfaceDemo1 {

	public static void main(String[] args) {
		SmartDevice smart=new SmartLight();
		smart.turnon();
		smart.turnoff();
		smart.getStatus();

	}

}
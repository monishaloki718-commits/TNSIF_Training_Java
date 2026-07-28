package org.tnsif.acc.c2tc.oops;

abstract class MaheshDemo  //2024
{
	void calling()
	{
		System.out.println("Phone is having calling Feature");
	}
	abstract void AIIntegration();
	abstract void SatelliteComm();
	abstract void HealthMonitoring();
}

abstract class Suresh extends MaheshDemo  //2025
{

	@Override
	void AIIntegration() {
		System.out.println("Phone is integrated with AI");
		
	}

	@Override
	abstract void SatelliteComm(); 

	@Override
	abstract void HealthMonitoring();
	
}
 
 class Hemanth extends Suresh //2026
 {

	@Override
	void SatelliteComm() {
		System.out.println("Phone is having SatelliteComm");
		
	}

	@Override
	void HealthMonitoring() {
		System.out.println("Phone is having HealthMonitoring ");
		
	}
	 
 }
public class AbstractionDemo {

	public static void main(String[] args) {
		Hemanth obj=new Hemanth();
		obj.calling();
		obj.AIIntegration();
		obj.SatelliteComm();
		obj.HealthMonitoring();

	}

}
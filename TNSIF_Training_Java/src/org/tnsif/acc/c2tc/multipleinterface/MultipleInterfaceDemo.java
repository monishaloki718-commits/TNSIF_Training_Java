package org.tnsif.acc.c2tc.multipleinterface;

class SmartPhone implements Camera, MusicPlayer
{

	@Override
	public void playMusic() {
		System.out.println("Playing a music in a smartphone");
		
	}

	@Override
	public void takePhoto() {
		System.out.println("Taking photo using smartphone");
		
	}
	
}

public class MultipleInterfaceDemo 
{

	public static void main(String[] args) {
		SmartPhone smartphone=new SmartPhone();
		smartphone.playMusic();
		smartphone.takePhoto();
	}

}
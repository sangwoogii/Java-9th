package day0603;

public class RemoteControlMain {

	public static void main(String[] args) {
		
		Television t1 = new Television();
		Audio a1 = new Audio();
		
		t1.turnOn();
		t1.setVolume(5);
		t1.turnOff();
		
		System.out.println();
		
		a1.turnOn();
		a1.setVolume(7);
		a1.turnOff();

	}

}

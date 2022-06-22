package day0603;

// 두번째 방법 
// 하나는 클래스로 상속받고 하나는 인터페이스로 구현

interface Flyable2 {
	void fly();
}


class Car  {
	int speed;
	void setSpeed(int speed) {
		this.speed = speed;
	}
}


public class FlyingCar2 extends Car implements Flyable2 {
	
	public void fly() {
		System.out.println("하늘을 날아요");
	}
	
	
	public static void main(String[] args) {
		
		FlyingCar2 fc2 = new FlyingCar2();
		
		fc2.fly();
		fc2.setSpeed(300);

	}
}

package day0603;

// 익명클래스에 대한 내용

interface RemoteControler {
	void turnOn();
	void turnOff();
}

class Power implements RemoteControler {
	public void turnOn() {
		System.out.println("TV on");
	}
	
	public void turnOff() {
		System.out.println("TV off");
	}
}



public class AnonymousMain {

	public static void main(String[] args) {
		
		RemoteControler rc = new RemoteControler() {
			// 부모이름을 그대로 가져와 객체 생성
			public void turnOn() {
				System.out.println("TV on");
			}
			
			public void turnOff() {
				System.out.println("TV off");
			}
		};
		
		rc.turnOn();
		rc.turnOff();

	}

}

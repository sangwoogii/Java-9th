package day0603;

public class SmartTelevisionMain {

	public static void main(String[] args) {
	
		SmartTelevision st = new SmartTelevision();
		RemoteControl rc1 = st;
//		Searchable sa = st;
		
		
		st.turnOn();
		st.setVolume(5);
		st.serach("JAVA");
		st.turnOff();
		
		System.out.println();
		
		rc1.turnOn();
		rc1.setVolume(5);
//		rc1.serach("JAVA");
//		-> RemoteControl에서 search의 메서드가 없기때문에 사용불가
		rc1.turnOff();
	}

}

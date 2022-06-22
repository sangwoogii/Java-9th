package day0603;

public class SmartTelevision implements Searchable, RemoteControl { // 다중상속 가능

	private int volume;
	
	@Override
	public void serach(String url) {
		System.out.println(url + "를 검색합니다.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("스마트 TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("스마트 TV를 끕니다.");
	}

	@Override
	public void setVolume (int a) {
		
		this.volume = a;
		if (this.volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if (this.volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		}
		
		System.out.println("현재 스마트 TV 볼륨 : " + this.volume);
	}	
}
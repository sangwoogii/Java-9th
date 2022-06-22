package day0603;

public class Audio implements RemoteControl {
	
	int volume;
		
		@Override
		public void turnOn() {
			System.out.println("Audio를 켭니다.");
			
		}
	
		@Override
		public void turnOff() {
			System.out.println("Audio를 끕니다.");
			
		}
	
		@Override
		public void setVolume (int a) {
				this.volume = a;
				if(this.volume > MAX_VOLUME) {
					this.volume = MAX_VOLUME;
				}else if (this.volume < MIN_VOLUME) {
					this.volume = MIN_VOLUME;
				}
		
				System.out.println("현재 Audio의 볼륨 : " + this.volume);
			
		}
}

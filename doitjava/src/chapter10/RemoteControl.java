package chapter10;

public interface RemoteControl {
	public int MAX_VOLUME = 10;		//인터페이스는...필드는 상수 필드, 생성자는 없다 , 기본은 추상메소드, 디폴트 메소드,스태틱 메소드
	public int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("음소거 상태로 설정");
		}else {
			System.out.println("음소거 상태를 해지");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지 교환");
	}

}

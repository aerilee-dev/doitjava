package chapter10;

public interface RemoteControl {
	public int MAX_VOLUME = 10;		//�������̽���...�ʵ�� ��� �ʵ�, �����ڴ� ���� , �⺻�� �߻�޼ҵ�, ����Ʈ �޼ҵ�,����ƽ �޼ҵ�
	public int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���Ұ� ���·� ����");
		}else {
			System.out.println("���Ұ� ���¸� ����");
		}
	}
	
	static void changeBattery() {
		System.out.println("������ ��ȯ");
	}

}

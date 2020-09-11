package chapter08;

public class DmbCellPhone extends CellPhone {

	int channel = 0;
	
	DmbCellPhone(String model, String color, int channel){
		
	this.model = model;
	this.color = color;
	this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널 " + channel );
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널변경 " + channel+"번 으로");
	}
	void turnOffDmb() {
		System.out.println("종료");
	}
}

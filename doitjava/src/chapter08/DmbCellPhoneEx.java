package chapter08;

public class DmbCellPhoneEx {
	
//DmbCellPhone 객체 생성
	public static void main(String[] args) {
		
//CellPhone 으로부터 상속받은 필드	
	DmbCellPhone dmbcellphone = new DmbCellPhone("자바폰","검정",100);
	System.out.print("모델"+dmbcellphone.model);
	System.out.println("색상" + dmbcellphone.color);
	
//DmbCellPhone의 필드	
	System.out.println("채널"+dmbcellphone.channel);
	
//CellPhone	으로부터 상속받은 메소드
	dmbcellphone.powerOn();
	dmbcellphone.bell();
	dmbcellphone.sendVoice("여보세요");
	dmbcellphone.recieveVoice("안녕, 나는 홍길동");
	dmbcellphone.sendVoice("나님 바빠, 나중에");
	dmbcellphone.hangUp();
	
//DmbCellPhone의 메소드	
	dmbcellphone.turnOnDmb();
	dmbcellphone.changeChannelDmb(10);
	dmbcellphone.turnOffDmb();
	}
}

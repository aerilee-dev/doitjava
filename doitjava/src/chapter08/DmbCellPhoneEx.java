package chapter08;

public class DmbCellPhoneEx {
	
//DmbCellPhone ��ü ����
	public static void main(String[] args) {
		
//CellPhone ���κ��� ��ӹ��� �ʵ�	
	DmbCellPhone dmbcellphone = new DmbCellPhone("�ڹ���","����",100);
	System.out.print("��"+dmbcellphone.model);
	System.out.println("����" + dmbcellphone.color);
	
//DmbCellPhone�� �ʵ�	
	System.out.println("ä��"+dmbcellphone.channel);
	
//CellPhone	���κ��� ��ӹ��� �޼ҵ�
	dmbcellphone.powerOn();
	dmbcellphone.bell();
	dmbcellphone.sendVoice("��������");
	dmbcellphone.recieveVoice("�ȳ�, ���� ȫ�浿");
	dmbcellphone.sendVoice("���� �ٺ�, ���߿�");
	dmbcellphone.hangUp();
	
//DmbCellPhone�� �޼ҵ�	
	dmbcellphone.turnOnDmb();
	dmbcellphone.changeChannelDmb(10);
	dmbcellphone.turnOffDmb();
	}
}

package example;

public class ArrayEx01 {

	public static void main(String[] args) {
		char[] carr1 = new char[26];
		carr1[0] = 'a';		//a=97
		carr1[1] = 'b';		//b=98
		carr1[2] = 'c';
		for(int i = 0; i<carr1.length; i++) {
			carr1[i]=(char)('a'+i);
		}
		System.out.print( carr1);
	}

}

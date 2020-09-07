package chapter07;

public class AdvancedFor01 {

	public static void main(String[] args) {
		int[]arr=new int[] {10,20,30,40,50};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
		for(int num:arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		int[][] ary = {{10,20,30},{40,50,60}};
		for(int i=0; i<ary.length;i++) {
			for(int j=0; j<ary[i].length; j++) {
				System.out.print("("+i+")" + ary[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int[] a:ary) {
			for(int n:a) {
				System.out.print(n + " ");
			
			}
			System.out.println();
		}
		System.out.println();
		
		for(int[] a:ary) { //자바에서는 Advanced for 라고 하고 C 언어에서는Range-Based for 라고 합니다.
			for(int i=0; i<a.length; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}

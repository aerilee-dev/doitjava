package chapter07;

public class ArrayEx02 {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int sum1 = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum1 += arr1[i];
		}
		System.out.println(sum1);
		
		int[]arr2=new int [10];
//		arr2 = {1,2,3,4,5}  �迭�� �ѹ� �������� ������ �ȵ�. �߰��� {} �� �ʱ�ȭ �� �� ����
		int sum2=0;
		for(int i =0; i <arr2.length;i++) {
			System.out.print(arr2[i]);		//���ڰ� �� ���� ��ü�� �⺻���� null
		}
		System.out.println();
		int[] arr3 = new int[] {1,2,3,4,5};
		for(int i =0; i <arr3.length;i++) {
			System.out.print(arr3[i]);		
		}
	}

}

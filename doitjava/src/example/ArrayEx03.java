package example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		
		int[] arr1 = new int[5];
		int max = Integer.MAX_VALUE, min = Integer.MIN_VALUE;
		Scanner sc = new Scanner(System.in);
		System.out.println("insert");
		for (int i = 0; i <arr1.length; i++) {
			arr1[i] = sc.nextInt();
			if(arr1[i]>max) {
				max=arr1[i];
			}
			if(arr1[i]<min) {
				min=arr1[i];
			}
			
		}
		
		System.out.println(max);
		System.out.println(min);
		
//		Arrays.parallelSort(arr1);
//		
//		for(int i=0; i<arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}
//		System.out.println("MAX" + arr1[arr1.length-1]);
//		System.out.println("MIN" + arr1[0]);
//		
	
	}

}

package example;

import java.util.Arrays;

public class ArrayEx05 {

	public static void main(String[] args) {
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[i]) {
					i--;
					break;
				}
			}

		}

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}

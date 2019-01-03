package prob1;

import java.util.Arrays;

public class Sort {

	public static void main(String[] arg) {

		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int temp = 0;
		int count = array.length;

		System.out.println("Before sort.");

		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");

		Sort sortInstance = new Sort();
		sortInstance.sort(array);

		
	}

	public void sort(int[] arr) {

		boolean flag = true;
		for (int i = 0; i < arr.length; ++i) {
			flag = true;
			
			for (int j = 0; j < arr.length-1; ++j) {

				if (arr[j] < arr[j + 1]) {

					swap(arr, j, j + 1);
					flag = false;
					
				}

			}
			
			if(flag) {
				System.out.println("After sort");
				printArr(arr);
				return;
			}
			
			
		}

	}
	
	public void swap(int arr[], int a, int b) {
		
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}
	
	public void printArr(int[] arr) {

		for(int i = 0; i<arr.length; ++i) {
			
			System.out.print(arr[i] + " ");
		}

		System.out.println();

	}


}
package org.dsa.sorting;


/**
 * - Algoritham: Merge Sort, Time Complexity: nlogn
 * 
 */
public class MergeSort {
	private static void conquer(int arr[], int left,  int mid, int right) {
		// create merge array in new memory location
		int merged[] = new int[right - left + 1];
		
		// copy elements in temp variable
		int leftIndex = left;
		int rightIndex = mid+1;
		
		int x = 0;
		
		while (leftIndex <= mid && rightIndex <= right) {
			if (arr[leftIndex] <= arr[rightIndex]) {
				merged[x++] = arr[leftIndex++];
			} else
				merged[x++] = arr[rightIndex++];
		}
		while (leftIndex <= mid) {
			merged[x++] = arr[leftIndex++];
			
		}
		while (rightIndex <= right) {
			merged[x++] = arr[rightIndex++];
			
		}
//		copy merge arr in original arr
		for (int i = 0, j = left; i < merged.length; i++, j++) {
			arr[j] = merged[i];
		}
	}
	public static void divide(int arr[], int left, int right) {
		if (left >= right) {
			return;
		}
//		med = (left + right)/2; //space complexity issue
		int mid = left + ( right- left)/2;

		divide(arr, left, mid);
		divide(arr, mid+1, right);
		conquer(arr, left, mid, right);
	}


	public static void main(String[] args) {
		int arr[] = { 6, 3, 9, 5, 2, 8 };
		int arrLength = arr.length;
		
		System.out.print("Before merge short: ");
		for (int i = 0; i < arrLength; i++) {
			System.out.print("arr["+i+"] "+arr[i] + " ");
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	
		
		divide(arr, 0, arrLength-1);

		System.out.print("\nAfter merge short: ");
		for (int i = 0; i < arrLength; i++) {
//			System.out.print("arr["+i+"] "+arr[i] + " ");
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}

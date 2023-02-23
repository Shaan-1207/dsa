package org.dsa.sorting;

public class QuickSort {
//	Sorting approch pivot & Partition
	public static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = low-1;//track how much space required to fill small element
		
		for(int j=low; j<high; j++) {
			if(arr[j]< pivot) {
				i++;
				
//				swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i]=pivot;
		arr[high] = temp;
		return i; //pivot index
				
	}
	public static void quickSort(int arr[], int low, int high) {
		//Make sure low should be less then high
		if(low < high) {
			int pivotidx = partition(arr, low, high);
			
			quickSort(arr, low, pivotidx-1);
			quickSort(arr, pivotidx+1, high);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = { 6, 3, 9, 5, 2, 8 };
		int arrLength = arr.length;
		
		System.out.print("Before quick short: ");
		for (int i = 0; i < arrLength; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//call quick short method
		quickSort(arr, 0, arrLength-1);
	

		System.out.print("\nAfter quick short: ");
		for (int i = 0; i < arrLength; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}

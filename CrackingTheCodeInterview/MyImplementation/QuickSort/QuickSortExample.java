package QuickSort;

import java.util.Arrays;

public class QuickSortExample {
	static int[] array = {18, 20, 28, 0, 38, 8, 2, 16, 10, 14, 24, 30, 34, 12, 32, 22, 6, 4, 36, 26};
	public static void main(String[]args) {
		quickSort(0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}
	
	static void quickSort(int left, int right) {
		if(left < right) {
			int pivot = partition(left, right);
			quickSort(left, pivot - 1);
			quickSort(pivot + 1, right);
		}
	}
	
	static int partition(int left, int right) {
		int x = array[right];
		int pos = left;
		for(int i = left; i < right; i++) {
			if(array[i] < x) {
				swap(i, pos);
				pos++;
			}
		}
		swap(right, pos);
		return pos;
	}
	
	static void swap(int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
}

package Practice_code;

import java.util.*;

//In this class two sorted arrays combine them to form a larger sorted array
public class ArraySorting {
//
	int[] arr1;
	int[] arr2;

	public ArraySorting() {
	}

	public int[] mergerArrayWithSorting(int[] arr1, int[] arr2) {
		// Here we use Optional class to check either the array contains null value
		Optional<int[]> op1 = Optional.ofNullable(arr1);
		Optional<int[]> op2 = Optional.ofNullable(arr2);

		// if array can not contain null values then we perform further operations on it
		if (op1.isPresent() && op2.isPresent()) {
			int length = arr1.length + arr2.length;
			int[] array = new int[length];
			int j = 0, k = 0;
			for (int i = 0; i < array.length; i++) {
				/*
				 * in this loop we check that both the arrays has some element if both arrays
				 * has element the we add elements in final array depending on the condition
				 */
				if (j < arr1.length && k < arr2.length) {
					if (arr1[j] < arr2[k]) {

						array[i] = arr1[j];
						j++;
					} else if (arr2[k] < arr1[j]) {
						array[i] = arr2[k];
						k++;
					} else if (arr1[j] == arr2[k]) {
						array[i] = arr1[j];
						j++;
					}
				} else {
					// If arr1 is empty the we add all the elements of arr2 in final array
					if (j == arr1.length) {
						array[i] = arr2[k];
						k++;
					}
					// If arr1 is empty the we add all the elements of arr2 in final array
					else {
						array[i] = arr1[j];
						j++;
					}
				}
			}
			return array;
		} else {
			System.out.println("Array contain null value");
			return arr1 = new int[0];
		}

	}

}

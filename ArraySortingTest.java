package Practice_code;

import static org.junit.Assert.assertArrayEquals;

//import static org.junit.Assert.*;

import org.junit.Test;



public class ArraySortingTest {

	@Test
	public void test() {
		ArraySorting test=new ArraySorting();
		int[] arr1=new int[]{1,2,3,4,5};
		int[] arr2=new int[]{6,7,8,9,10,11};
	   
		int[] array=test.mergerArrayWithSorting(arr1,arr2);
		int[] array1=new int[] {1,2,3,4,5,6,7,8,9,10,11};
	
		assertArrayEquals(array, array1);
	}

	@Test
	public void test1() {
		ArraySorting test=new ArraySorting();
		int[] arr1=new int[]{1,2,3,4,5};
		int[] arr2=new int[]{1,7,8,9,10,11};
	   
		int[] array=test.mergerArrayWithSorting(arr1,arr2);
		int[] array1=new int[] {1,1,2,3,4,5,7,8,9,10,11};
	
		assertArrayEquals(array, array1);
	}
	
	@Test
	public void test2() {
		ArraySorting test=new ArraySorting();
		int[] arr1=new int[0];
		int[] arr2=new int[]{1,7,8,9,10,11};
	   
		int[] array=test.mergerArrayWithSorting(arr1,arr2);
		int[] array1=new int[] {1,7,8,9,10,11};
	
		assertArrayEquals(array, array1);
	}
	
	@Test
	public void test3() {
		ArraySorting test=new ArraySorting();
		int[] arr1=new int[]{1,7,8,9,10,11};
		int[] arr2=new int[0];
	   
		int[] array=test.mergerArrayWithSorting(arr1,arr2);
		int[] array1=new int[] {1,7,8,9,10,11};
	
		assertArrayEquals(array, array1);
	}
	
	@Test
	public void test4() {
		ArraySorting test=new ArraySorting();
		int[] arr1=new int[]{1,7,8,9,10,11};
		int[] arr2=null;
	   
		int[] array=test.mergerArrayWithSorting(arr1,arr2);
		int[] array1=new int[0];
	
		assertArrayEquals(array, array1);
	}
	
	@Test
	public void test5() {
		ArraySorting test=new ArraySorting();
		int[] arr1=new int[]{-1,1,3,4};
		int[] arr2=new int[]{6,7,8,9,10,11};
	   
		int[] array=test.mergerArrayWithSorting(arr1,arr2);
		int[] array1=new int[]{-1,1,3,4,6,7,8,9,10,11};
	
		assertArrayEquals(array, array1);
	}
	
}

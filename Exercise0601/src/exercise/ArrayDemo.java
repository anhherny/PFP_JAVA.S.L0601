package exercise;

/**
 *@author AnhNT241
 */

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declare an array
		int[] arrayInt = new int[5];
		// set value for each element of array.
		arrayInt[0] = 1;
		arrayInt[1] = 2;
		arrayInt[2] = 3;
		arrayInt[3] = 4;
		arrayInt[4] = 5;
		// get array lenght
		System.out.println("Array lenght: " + arrayInt.length);
		// access array element at a given index to get value.
		System.out.println("Element at index 3 is: "+ arrayInt[3]);
	}

}

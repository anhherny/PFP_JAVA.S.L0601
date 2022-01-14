package exercise;

/**
 *@author AnhNT241
 */
public class MultiDimensionArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = new int[2][2]; // create a multi dimension array that has rows and 2 columns.
		matrix[0][0]= 1; // row 1, column 1
		matrix[0][1]= 2; // row 1, column 2
		matrix[1][0]= 3; // row 2, column 1
		matrix[1][1]= 4; // row 2, column 2
		System.out.println("Element at second row and first column is: "+matrix[1][0]);
		System.out.println("Number of row: "+matrix.length);
		System.out.println("Number of column: "+matrix[0].length);
	}

}

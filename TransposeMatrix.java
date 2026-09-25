package day7;

import java.util.Arrays;

public class TransposeMatrix {

	public static void main(String[] args) {
		// Declaring and initializing 2-dimensional array
		int matrix[][]= {
				{10,4,12}, {5, 10, 30}
		};
		//Array rows/columns before transpose:
		System.out.println("Original Array");
		
		/*
		 * for(int i=0; i<matrix.length;i++) { for(int j=0;j<matrix[0].length;j++) {
		 * System.out.print(matrix[i][j]+" "); } System.out.println(); }
		 */
		System.out.println(Arrays.deepToString(matrix));
		int rows=matrix.length;
		int cols=matrix[0].length;
		int transposeMatrix[][]=new int[cols][rows];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				transposeMatrix[j][i]=matrix[i][j];
			}
		}
		
		//Array after transpose
		System.out.println("Transposed Array");
		System.out.println(Arrays.deepToString(transposeMatrix));
		
		}

	}



package Applied_Linear_Algebra;

import java.util.Scanner;
public class pr1_Introduction_to_matrix 
{
	private static void print2dArray(int[][] matrix)
	{
		for (int r=0; r<matrix.length; r++)
		{
			for (int c=0; c<matrix[0].length; c++)
			{
				System.out.print("{"+matrix[r][c]+"}"+"\t");
			}
			System.out.println();
		}
	}
	
	@SuppressWarnings({"resource"})
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = sc.nextInt();
		System.out.print("Enter column: ");
		int column = sc.nextInt();
		int[][] yourMatrix = new int[row][column];
		
		for (int r=0; r<row; r++)
		{
			for (int c=0; r<column; c++)
			{
				System.out.print(String.format("Enter the [%d][%d]th value of the matrix: ", r,c));
				yourMatrix[r][c] = sc.nextInt();
			}
		}
		
		System.out.println("• The matrix is →");
		print2dArray(yourMatrix);
	}
}
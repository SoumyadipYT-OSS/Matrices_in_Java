import java.util.Scanner;
public class pr3_Adding_two_matrices 
{
	private static void print2dArray(int[][] matrix)
	{
		for (int r=0; r<=matrix.length-1; r++)
		{
			for (int c=0; c<=matrix.length-1; c++)
			{
				System.out.print(matrix[r][c]+"\t");
			}
			System.out.println();
		}
	}
	private static void summation_of_matrix(int[][] first, int[][] second, int row, int column)
	{
		int r, c;
		int addition[][] = new int[row][column];
		for (r=0; r<row; r++)
		{
			for (c=0; c<column; c++)
			{
				addition[r][c] = first[r][c]+second[r][c];
			}
		}
		print2dArray(addition);
	}
	
	
	@SuppressWarnings({"resource"})
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row: ");
		int row = sc.nextInt();
		System.out.print("Enter column: ");
		int column = sc.nextInt();
		int[][] firstMatrix = new int[row][column];
		int[][] secondMatrix = new int[row][column];
		System.out.println("• Enter values of first matrix");
		for (int r=0; r<row; r++)
		{
			for(int c=0; c<column; c++)
			{
				System.out.print(String.format("Enter [%d][%d]th element: ", r,c));
				firstMatrix[r][c] = sc.nextInt();
			}
		}
		System.out.println("• Enter values of second matrix");
		for (int r=0; r<row; r++)
		{
			for(int c=0; c<column; c++)
			{
				System.out.print(String.format("Enter [%d][%d]th element: ", r,c));
				secondMatrix[r][c] = sc.nextInt();
			}
		}
		
		System.out.println("• The first matrix");
		print2dArray(firstMatrix);
		System.out.println("• The second matrix");
		print2dArray(secondMatrix);
		System.out.println("• The summation of these two matrices →");
		summation_of_matrix(firstMatrix, secondMatrix,row, column);
	}
}

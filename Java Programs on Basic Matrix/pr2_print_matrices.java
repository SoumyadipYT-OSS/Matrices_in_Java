import java.util.Scanner;
public class pr2_print_matrices 
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
		int column  = sc.nextInt();
		int[][] firstMatrix=new int[row][column];
		int[][] secondMatrix=new int[row][column];
		System.out.println("• Enter first matrix element: ");
		for (int r=0; r<=row-1; r++)
		{
			for (int c=0; c<=column-1; c++)
			{
				System.out.println(String.format("Enter first[%d][%d] integer", r, c));
				firstMatrix[r][c] = sc.nextInt();
			}
		}
		System.out.println("• Enter second matrix element: ");
		for (int r=0; r<=row-1; r++)
		{
			for (int c=0; c<=column-1; c++)
			{
				System.out.println(String.format("Enter second[%d][%d] integer", r, c));
				secondMatrix[r][c] = sc.nextInt();
			}
		}
		
		System.out.println("The first matrix is →");
		print2dArray(firstMatrix);
		System.out.println("The second matrix is →");
		print2dArray(secondMatrix);
	}
}

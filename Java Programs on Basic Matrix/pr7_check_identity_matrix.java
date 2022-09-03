package Applied_Linear_Algebra;

import java.util.Scanner;
public class pr7_check_identity_matrix 
{
	public static void print2DArray(int[][] MATRIX)
	{
		System.out.println("\n▬▬Your matrix▬▬");
		for (int r=0; r<MATRIX.length; r++)
		{
			for (int c=0; c<MATRIX.length; c++)
			{
				System.out.print("{"+MATRIX[r][c]+"}"+"\t");
			}
			System.out.println();
		}
	}
	
	
	@SuppressWarnings({"resource"})
	static void inputMatrix()
	{
		Scanner sc  =  new Scanner(System.in);
		System.out.print("• Enter an integer for square matrix: ");
		int num = sc.nextInt();
		if (num==0){System.out.println("Invalid Input!");return;}
		else if (num==1) {System.out.println("It is "+num+"st order matrix");}
		else if (num==2) {System.out.println("It is "+num+"nd order matrix");}
		else if (num==3) {System.out.println("It is "+num+"rd order matrix");}
		else {System.out.println("It is "+num+"th order matrix");}
		int row=0, column=0;
		int[][] matrix = new int[num][num];
		for (row=0; row<num; row++)
		{
			for (column=0; column<num; column++)
			{
				System.out.print(String.format(" →Input [%d][%d]th element: ", row,column));
				matrix[row][column]=sc.nextInt();
			}
		}
		print2DArray(matrix);
		checkIdentityMatrix(matrix);
	}
	
	
	private static void checkIdentityMatrix(int[][] check_TheMatrix)
	{
		int row=0, col=0;
		boolean flag=true;
		row=check_TheMatrix.length;
		col=check_TheMatrix[0].length;
		if (row!=col) 
		{
			System.out.println("Matrix should be a square matrix");
		}
		else
		{
			for (int i=0; i<row; i++)
			{
				for (int j=0; j<col; j++)
				{
					if (i==j && check_TheMatrix[i][j]!=1)
					{
						flag=false;
						break;
					}
					if (i!=j && check_TheMatrix[i][j]!=0)
					{
						flag=false;
						break;
					}
				}
			}
		}
		if (flag)
		{
			System.out.println("Given matrix is an identity matrix");
		}
		else
		{
			System.out.println("It is not an identity matrix");
		}
	}
	
	
	@SuppressWarnings({"static-access"})
	public static void main(String[] args) 
	{
		pr7_check_identity_matrix p = new pr7_check_identity_matrix();
		p.inputMatrix();
	}
}
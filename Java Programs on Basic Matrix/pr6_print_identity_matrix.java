package Applied_Linear_Algebra;

import java.util.Scanner;
public class pr6_print_identity_matrix 
{
	private static int identityMatrix(int num)
	{
		int row=0, column=0;
		for (row=0; row<num; row++)
		{
			for (column=0; column<num; column++)
			{
				if (row==column)
					System.out.print(1+" ");
				else
					System.out.print(0+" ");
			}
			System.out.println();
		}
		return 0;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number to see its identity matrix: ");
		int num = sc.nextInt();
		identityMatrix(num);
		sc.close();
	}
}
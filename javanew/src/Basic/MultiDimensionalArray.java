package Basic;

import java.util.Scanner;

public class MultiDimensionalArray 
{

	public static void main(String[] args) 
	{
		Scanner scr = new Scanner(System.in); 
			System.out.println("please enter row size");
			int rowsize=scr.nextInt();
			System.out.println("please enter column size");
			int columnsize=scr.nextInt();
			int[][] f = new int[rowsize][columnsize];
			int a=100;
			
			
		for(int row = 0; row <rowsize; row++)
		{
			for(int column = 0; column <columnsize; column++)
			{
		
				f[row][column] = ++a;
				System.out.println("f["+row+"]["+column+"] = "+f[row][column]);
			}
        }
    }
}



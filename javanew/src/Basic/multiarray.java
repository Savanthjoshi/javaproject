package Basic;

import java.util.Scanner;

public class multiarray
{

	public static void main(String[] args) 
    {
        Scanner scr = new Scanner(System.in);
        
        System.out.print("Enter number of rows in Matrix-1  ");
        int rows1 = scr.nextInt();
        
        System.out.print("Enter number of columns in Matrix-1 ");
        int columns1 = scr.nextInt();
        
        System.out.println("Enter number of rows in Matrix-2 ");
        int rows2 = scr.nextInt();
        
        System.out.print("Enter number of columns in Matrix-2 ");
        int columns2 = scr.nextInt();
        
        int[][] m1 = new int[rows1][columns1];
        int[][] m2 = new int[rows2][columns2]; 
        
        //matrice 1 start
        System.out.println("Enter the Matrix-1 elements :");
        for (int i = 0; i < rows1; i++)
        {
            for (int j = 0; j < columns1; j++)
            {
                m1[i][j] = scr.nextInt();
            }
        }
        
        //matrix 2 start
        System.out.println("Enter the Matrix-2 elements:");
        for (int i = 0; i < rows2; i++)
        {
            for (int j = 0; j < columns2; j++) 
            {
                m2[i][j] = scr.nextInt();
            }
        }
        
     //matrix multiplication code
        int[][] M  = new int[rows1][columns2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) 
                { 
                    M[i][j] = M[i][j] + m1[i][k] * m2[k][j];
                }
            }
        }
 
        
           //matrix 1 print
                  System.out.println("Matrix-1: ");
                  for (int i = 0; i < rows1; i++) {
                        for (int j = 0; j < columns1; j++) {
                               System.out.print(m1[i][j] + " ");
                        }
                        System.out.println();
                  }
                  
            
            // matrix 2 print
                  System.out.println("Matrix-2: ");
                  for (int i = 0; i < rows2; i++) {
                        for (int j = 0; j < columns2; j++) {
                               System.out.print(m2[i][j] + " ");
                        }
                        System.out.println();
                  }
 
        // output          
        System.out.println("Output Matrix is: ");
        for (int i = 0; i < rows1; i++)
        {
            for (int j = 0; j < columns2; j++)
            {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }		

	}

}

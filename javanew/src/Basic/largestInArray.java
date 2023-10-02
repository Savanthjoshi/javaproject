package Basic;

import java.util.Scanner;

public class largestInArray 
{

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
Scanner scr = new Scanner(System.in);
        
        System.out.print("Enter number of elements in array  ");
        int input = scr.nextInt();
        int a[] = new int[input];
        
        System.out.println("Enter the elements :");
        for (int i = 0; i < input ; i++)
        {
                a[i] = scr.nextInt();
        }
        
        
        
        int l = a[0];
        for(int j=0; j<a.length; j++)
        	
        {
        	if(a[j] > l)
        		l = a[j];
        }
        	
        System.out.println("largest number in the array is " +l);
        
	}  
         
}
                 
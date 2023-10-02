package Basic;

import java.util.Scanner;

public class AscendingArray 
{

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
Scanner scr = new Scanner(System.in);
        
        System.out.print("Enter number of elements in array  ");
        int input = scr.nextInt();
        int a[] = new int[input];
        
        System.out.println("Enter the elements :");
        for (int k = 0; k < input ; k++)
        {
                a[k] = scr.nextInt();
        }
         int s;
        for (int i = 0; i < a.length; i++) 
        {     
            for (int j = i+1; j < a.length; j++) 
            {     
               if(a[i] > a[j]) 
               {    
                   s = a[i];    
                   a[i] = a[j];    
                   a[j] = s;    
               }     
            }  
            
            System.out.println("Elements of array in ascending order: ");    
            for (int p = 0; i < a.length; i++) {     
                System.out.print(a[i] + " ");    
            }    
	    }
  }

}
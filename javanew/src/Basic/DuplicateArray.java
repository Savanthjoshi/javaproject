package Basic;

import java.util.Scanner;

public class DuplicateArray 
{
	
public static void main(String[] args)
	
	{
		
Scanner scr = new Scanner(System.in);
        
        System.out.print("Enter number of elements in array: ");
        int input = scr.nextInt();
        int a[] = new int[input];
        
        System.out.println("Enter the elements: ");
        for (int b = 0; b < input ; b++)
        {
                a[b] = scr.nextInt();
        }
        
        for(int i = 0; i < a.length; i++)
        {  
            for(int j = i + 1; j < a.length; j++) 
            
              if(a[i] == a[j]) 
              {   	
                   System.out.println("Duplicate elements in the array are: " +a[j]); 
                
              } 	   
                 	
            

        }
        
	}	

}

             package Practice;

import java.util.Scanner;

public class Array {

	public static void main(String1[] args) {
		// TODO Auto-generated method stub

	/*	// single dimension array
		int pk[] = {1,2,3}; nh
		for (int i:pk) //using for each loop;
		System.out.println(i);
		*/
		
		/*Scanner pk = new Scanner (System.in);
		System.out.print("enter no of rows : ");
		int rows = pk.nextInt();
		System.out.print("enter value : ");
		int r_value = pk.nextInt();
		System.out.print("enter no of columns : ");
		int columns = pk.nextInt();
		System.out.print("enter value : ");
		int c_value= pk.nextInt();
		int array [] [] = new int [rows][columns];
		
	//	System.out.println(array[i][j]);
		for(int i=0;i<=rows;i++)
		{
			for(int j=0; j<=column;j++)
			{
				System.out.print(["+i+"]["+j+"]);
			array = pk.nextInt();
			}
		}
	}*/  
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Row length of an array : ");
		int row=sc.nextInt();
		System.out.print("Enter column length of an array : ");
		int column=sc.nextInt();
		int a[][]=new int[row][column];//declaration    	 
		System.out.print("Enter " + row*column + " Elements to Store in Array :\t");
	        for (int i = 0; i < row; i++)
		{
		    for(int j = 0; j < column; j++)
		    {
	           	a[i][j] = sc.nextInt();
	           	
		    }
		}   
	       System.out.print("Elements in Array are :\n");
	        for (int i = 0; i < row; i++)
		{
		    for(int j = 0; j < column; j++)
		    {
		       System.out.println("Row ["+i+"]:  Column ["+j+"] :"+a[i][j]);
	 	    }
		}  

		   }
	
}

package Practice;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String1[] args) {
		// TODO Auto-generated method stub
		Scanner pk = new Scanner(System.in);
		System.out.println("Enetr the array size");
		int size = pk.nextInt();
		int[] arr = new int[size]; 
		System.out.println("Enetr "+size+" array elements");
		 
		for(int k=0;k<=size-1;k++) {
			 arr[k]= pk.nextInt();
		}  
	      System.out.println("Original array: ");  
	        for (int i = 0; i < arr.length; i++) {  
	        	System.out.print(arr[i]+" ");
	        }  
	        System.out.println(" ");
	        System.out.println("your reversed array (odd number only) : "); 
	        for(int j= arr.length-1;0<=j;j--) {
	        	{
	        		if (arr[j]%2!=0)
	        			System.out.print(arr[j]+" ");
	        			
	        	}
	        }
	   

	}

}

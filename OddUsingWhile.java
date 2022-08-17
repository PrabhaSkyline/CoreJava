package Practice;
import java.util.Scanner;  
public class OddUsingWhile {  
	public static void main(String1[] args)   
	{  
	int number, i;  
	Scanner sc=new Scanner(System.in);  
	System.out.print("Enter the limit: ");  
	number = sc.nextInt();    
	i=1;   
	System.out.print("List of odd numbers: ");  
	//the while loop executes until the cond\ition become false  
	 
	do{  
	//prints the odd number  
		System.out.print(i +" ");
	//increments the variable i by 2  
	i=i+2;  
	
	} while(i<=number); 
	
	}  
	}  

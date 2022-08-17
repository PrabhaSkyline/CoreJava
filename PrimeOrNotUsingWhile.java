package Practice;

import java.util.Scanner;

public class PrimeOrNotUsingWhile {

	public static void main(String1[] args) {
		// TODO Auto-generated method stub
		//int num= 8,
		int i=1,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number you want to check : ");
		int num = sc.nextInt();
		do {
			if(num%i==0) {
				count++;
			}
			i++;
		}while(num>=i);
		if (count==2)
		{
			System.out.println("its a prime number");
		}
		else {
			System.out.println("its not a prime number");
		}
	}

}

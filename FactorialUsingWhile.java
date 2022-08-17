package Practice;

import java.util.Scanner;

public class FactorialUsingWhile {

	public static void main(String1[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the factorial number: ");  
	int	number = sc.nextInt();
	
		//int number = 6;
        long factorial = 1;
        int i = 1;
        do
        {
            factorial = factorial * i;
            i++;
        } while (i <= number);

        System.out.println("Factorial of " + number + " is: " + factorial);
       }

	}



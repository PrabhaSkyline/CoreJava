package Practice;

import java.util.Scanner;

public class ReverseUsingWhile {

	public static void main(String1[] args) {
		// TODO Auto-generated method stub
		//int num=123;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number which you wnat to reverse : ");
		int num = sc.nextInt();
		int reversed = 0;
		System.out.println("Original number : = "+num);
		do {
			int digit = num%10;
			reversed = (reversed*10)+digit;
			num=num/10;
		}while(num!=0);
		System.out.println("Reversed number : "+reversed);

	}

}

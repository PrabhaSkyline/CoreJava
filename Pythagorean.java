package Practice;

import java.util.Scanner;

public class Pythagorean {

	public static void main(String1[] args) {
		// TODO Auto-generated method stub
		double x ;
		double y;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the one side value : ");
		x=sc.nextDouble();
		System.out.print("Enter the another side value : ");
		y=sc.nextDouble();
		double z =Math.sqrt((x*x)+(y*y));
		System.out.print("The Hypotenuse value is : "+z);
		sc.close();
	}

}

package Practice;

import java.util.Scanner;
import java.lang.String;

public class LogicalOperator {
	static int age;
	static String name;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ELIGIBILITY TEST BY AGE :)");
		System.out.println("--------------------------");
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter your name : ");
		 name = sc.nextLine();
	
		while(name.isBlank()) {
			System.out.print("Enter your name : ");
			name = sc.nextLine();
		}
		System.out.print("Enter your age : ");
		age = sc.nextInt();
		System.out.println("--------------------------");

		System.out.println("Hello "+name+" Your age is "+age);
		
		if(age!=0 && age<18) // NOT operator
		{  
			System.out.println("Not eligible for ***** ");
		}
		else if(age>18 && age<20)  // AND operator 
		{
			System.out.println("you are teenage boy");
		}
		else if(age==60 || age<61) // OR operator
		{  
			System.out.println("eligible for **** ");
		}
		else {
			System.out.println("your death time still exist ");
		}
		

	}
}

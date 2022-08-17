package Practice;

public class MethodOverloading {

	public static void main(String[] args) {

		
		// int z = add(1,3); System.out.println(z);

		double x = add(1, 3); // depending upon data type
		System.out.println(x);

	}

	static int add(int a, int b) {
		System.out.println("No 1");
		return a + b;

	}

	static double add(double a, double b) // method overloading
	{
		System.out.println("No 2");
		return a + b;

	}

}

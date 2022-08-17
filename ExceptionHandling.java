package Practice;

public class ExceptionHandling {

	public static void main(String[] args) {
// exception is an problem that arise when the program in run time. this can be handled by try catch blocks...
		try{
			int a = 10;
		int b = 0;
		int c = a/b;
		System.out.println(c);
		}
		
		catch(ArithmeticException e) {
		System.out.println("divisible by zero");
		}
		
		catch (Exception e) {
			System.out.println("all type of exception");
		}
		finally{
			System.out.println("Always excecute");
		}
	}
}

package Practice;

public class ToStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cars c = new cars();
System.out.println(c); // usually it will print address of the class
System.out.println(c.toString()); // here we used toString method for geting textual representation
	}

}
class cars{
	String name = "BMW";
	String model = "3rd Gen" ;
	int year = 2022;
	public String toString() {
		System.out.println(" ");
		return name+"\n"+model+"\n"+year;
	}
	
	
}
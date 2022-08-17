package Practice;

public class MethodOverRiding {

	public static void main(String[] args) {
		// method overriding
		
		animals ani = new animals();
		ani.speak(); //overriding output
		 
		human h = new human();
		h.speak();

	}

}
class human{
	void speak() // same method 
	{
		System.out.println("Now speaking");
	}
}
class animals extends human{
	void speak()// method overriding
	{
		System.out.println("Animals only have gratitude");
	}
}
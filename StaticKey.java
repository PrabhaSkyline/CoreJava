package Practice;

public class StaticKey {

	// static its a modifier. It is used in method/variable
	
	public static void main(String[] args) {
	
		Items obj = new Items("Gagets");
	//	Items obj1 = new Items("mobiles");
			
		System.out.println(Items.count);
		
		//obj.No_of_Product();
		
	}
}
class Items{
	static int count;
	String name;
	Items(String name)
	{
		this.name=name;
		System.out.println(this.name);
		count++;
	}
	static void No_of_Product() {
		System.out.println(count);
	}	
}

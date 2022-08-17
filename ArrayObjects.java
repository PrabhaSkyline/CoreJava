package Practice;

public class ArrayObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		object1[] obj = new object1[3];
		
		object1 f1 = new object1("poori");
		object1 f2 = new object1("Chicken rice");
		object1 f3 = new object1("Biriyani");
		
		
		obj[0]=f1;
		obj[1]=f2;
		obj[2]=f3;
		System.out.println(obj[0].name);
		System.out.println(obj[1].name);
		System.out.println(obj[2].name);

	}

}
class object1 {
	String name;
	object1(String name)
	{
		this.name = name;
	}
}

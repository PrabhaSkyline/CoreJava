package Practice;

public class SuperKeyword {

	public static void main(String[] args) {
		// super keyword and methods. its almost similar to "this" keyword.
		spiderman spidy =new spiderman("peter",21,"spidy sence");

		System.out.println(spidy.toString());
	}

}


class person{
	String name;
	int age;
	person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return this.name+"\n"+this.age;
	}
}


class spiderman extends person{
	String power;
		spiderman(String name,int age,String power){
		super(name,age);
		this.power = power;
//		System.out.println("\n"+this.power);
	}
		public String toString() {
			return super.toString()+"\n"+this.power;
		}
}
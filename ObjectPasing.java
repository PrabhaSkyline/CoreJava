package Practice;

public class ObjectPasing {

	public static void main(String[] args) {

		School Scl = new School();
		
		student stu = new student();
		
		stu.name("prabha");
		Scl.run("Sakthi");

	}

}
class School{
	void run(String name) {
		System.out.println( name+" is entered into college");
	}
}
class student{
	String name;
	void name(String name)
	{
		System.out.println(name+" is introvert");
	}
	
}
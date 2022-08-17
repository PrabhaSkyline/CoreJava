package Practice;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "PRABHA";
		hello();
		int a=23;
		int b=32 ;
		int z = add(a,b);
		System.out.println(z);

	}
	static void hello() {
		System.out.println("hello world ");
	}
	static int add(int a,int b) {
	int z = a+b;
		return z;
	}

}

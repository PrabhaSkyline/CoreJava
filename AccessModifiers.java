package Practice;

public class AccessModifiers {

	public static void main(String[] args) {
		/*
		 *  There are 4 types of Access modifiers in java namely,
		 *   public ,private , protected , default/ no modifier
		 */
		
		public String a =" can access everywhere like within the class,package,sub class,world";
		private String b ="can access within the class only";
		protected String c ="can access within the class,package,sub class";
		/* default */ String d ="can access within the class,package";
		System.out.println(d);

	}

}

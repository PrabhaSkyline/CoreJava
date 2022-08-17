package Practice;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = " Prabha ";
		System.out.println("name : "+name+"\n" );
		
		boolean result = name.equals("prabha");
		System.out.println("result : "+result+"\n");
		
		boolean result1 = name.equalsIgnoreCase(" prabha ");
		System.out.println("result 1 : "+result1+"\n");
		
		int result2 = name.length();
		System.out.println("result 2 : "+result2+"\n");
		
		char result3 = name.charAt(4);
		System.out.println("result 3 : "+result3+"\n");
		
		int result4 = name.indexOf('a');
		System.out.println("result 4 : "+result4+"\n");
		
		boolean result5 = name.isEmpty();
		System.out.println("result 5 : "+result5+"\n");
		
		String result6 =name.trim();
		System.out.println("result 6 : "+result6+"\n");
		
		String result7 = name.replace('a', 'e');
		System.out.println("result 7 : "+result7+"\n");
		
		String result8 = name.toLowerCase(); 
		System.out.println("result 8 : "+result8+"\n");
		
		String result9 = name.toUpperCase(); 
		System.out.println("result "
				+ "9 : "+result9+"\n");
	}

}

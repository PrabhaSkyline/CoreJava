package Practice;

import java.util.ArrayList;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> departments = new ArrayList<String>();
		departments.add("CSE");
		departments.add("IT");
		departments.add("EEE");
		departments.add("MECH");
		departments.add("ECE");
		
		System.out.println("The available departments are,");
		for(String i : departments) // for each loop syntax
		{
			System.out.println(i);
		}

	}

}

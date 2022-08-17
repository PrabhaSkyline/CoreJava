package Practice;

import java.util.ArrayList;

public class Two_D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<String>> Hotel = new ArrayList();
		
		ArrayList<String> food = new ArrayList<String>();
		food.add("Biriyani");
		food.add("full meals");
		food.add("poori");
		
		ArrayList<String> RawMaterials = new ArrayList<String>();
		RawMaterials.add("vegitables");
		RawMaterials.add("dhal");
		RawMaterials.add("chicken");
		
		ArrayList<String> drinks = new ArrayList<String>();
		drinks.add("mango");
		drinks.add("batham");
		drinks.add("fruiteMix");
		Hotel.add(food);
		Hotel.add(RawMaterials);
		Hotel.add(drinks);
		
		System.out.println(Hotel);
		System.out.println(Hotel.get(1));
		System.out.println(Hotel.get(2).get(1));
	}

}

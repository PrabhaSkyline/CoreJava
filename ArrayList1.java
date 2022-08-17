package Practice;
import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// Array list ---  its a resizable array 
		ArrayList<String> food = new ArrayList<String>();
		food.add("Biriyani");
		food.add("full meals");
		food.add("poori");
		
		food.remove(2);
		food.set(1,"Dosa");
	//	food.clear();
		
		for(int i=0;i<food.size();i++) {
		System.out.println(food.get(i));
		}
	}

}

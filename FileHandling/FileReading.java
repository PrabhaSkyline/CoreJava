package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f = new File("E:Dumy.txt");
			Scanner sc = new Scanner(f);
			while (sc.hasNext()) { // counting no of lines
				String reading = sc.nextLine(); // executing as per the line
				System.out.println(reading);
			}
			sc.close();
		} catch (IOException e) {
			System.out.println("can't read file");
			e.printStackTrace();
		}
	}
}

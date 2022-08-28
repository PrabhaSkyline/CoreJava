package FileHandling;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) {
		File f2 = new File("E:Dumy.txt");

		if (f2.delete()) {
			System.out.println("successfully deleted");
		}
		else {
			System.out.println("can't delete a file");
		}
	}
}

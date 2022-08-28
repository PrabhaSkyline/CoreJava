package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fWrite = new FileWriter("E:Dumy.txt");
			fWrite.write("A named location used to store related information is referred to as a File");
			fWrite.close();
			System.out.println("successfully written");
	}
		catch(IOException e) {
			System.out.println("error throwd");
			e.printStackTrace();
		}

	}
}

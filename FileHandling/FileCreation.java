package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f = new File("E:Dumy.txt");
			f.createNewFile();
			if (f.exists()) {
				System.out.println("the file is created ");
			} else {
				System.out.println("the file is not created ");
			}
			System.out.println("is it readable : " + f.canRead());
			System.out.println("is it writeable : " + f.canWrite());
			System.out.println("the location of file is : " + f.getAbsolutePath());
			System.out.println("name of the file is : " + f.getName());
			System.out.println("file length is : " + f.length());
			System.out.println("normal path : " + f.getPath());
			System.out.println("usable space for this file : " + f.getUsableSpace());
			System.out.println("total space for this file : " + f.getTotalSpace());
			System.out.println("is the file present : " + f.exists());
			System.out.println("no of files presented : "+f.list());
			System.out.println("wheather its a file? : "+f.isFile());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

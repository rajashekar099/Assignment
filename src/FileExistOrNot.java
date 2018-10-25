package file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExistOrNot {

	public static void main(String[] args) {

		Path p1 = Paths.get("C:/filesConcept.txt");

		if (Files.exists(p1)) {
		  System.out.println("File exists");// file exist
		}else{ 
		 System.out.println("File Doesn't exists"); // file is not exist
		 
		}
	}

}

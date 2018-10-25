package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProfessionalDetails {

	public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("D:/abc/RajaShekar.txt");
        BufferedReader br = new BufferedReader(fr);
        String buffer;
        String fulltext="";
               
        while ((buffer = br.readLine()) != null) {
            System.out.println(buffer);
            fulltext += buffer;
        }
        
        br.close();
        fr.close();
    
        
    }
}

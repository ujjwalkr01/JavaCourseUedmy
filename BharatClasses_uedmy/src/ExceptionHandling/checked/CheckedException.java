package ExceptionHandling.checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	void readFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("");

	}

	public static void main(String[] args) throws Exception {

		CheckedException ce = new CheckedException();
        try {
		ce.readFile();
        }catch(FileNotFoundException e) {
        	System.out.println("found in main mehtod");
        }
		try {
			FileInputStream fis = new FileInputStream("‪ ");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} finally {
			System.out.println("Finally block...");
		}
	}

}

package ioStreams;

import java.io.FileReader;
import java.io.FileWriter;

public class ReaderandWriterDemo {

	public static void main(String[] args) throws Exception {

		FileReader fr = null;
		FileWriter fw = null;

		fr = new FileReader("C:\\Users\\ujjwa\\OneDrive\\Documents\\Demo.txt"); // reads the character
		fw = new FileWriter("C:\\Users\\ujjwa\\OneDrive\\Documents\\Demo2.txt"); 

		int ch;

		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		System.out.println("File copied..");

		fr.close();
		fw.close();
	}

}

package ioStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream(new File("C:\\Users\\ujjwa\\OneDrive\\Documents\\Demo.txt")); //reads the binary form
			System.out.println("File Opened");

			int i;
			while ((i = fis.read()) != -1) {  //reads the data
				System.out.print((char) i);
			}

		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.print("File closed!!!");
		}

	}

}

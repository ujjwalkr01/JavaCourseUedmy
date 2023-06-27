package ioStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("C:\\Users\\ujjwa\\OneDrive\\Documents\\FRONT.JPEG");
			fos = new FileOutputStream("C:\\Users\\ujjwa\\OneDrive\\Documents\\CapfCard.JPEG");

			int data;

			while ((data = fis.read()) != -1) { /// here it reads the data
				fos.write(data); // and now its writing the data in the new folder naming capfCard...
			}
			System.out.println("File copied..");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

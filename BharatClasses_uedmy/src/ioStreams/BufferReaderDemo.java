package ioStreams;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;

public class BufferReaderDemo {

	public static void main(String[] args) {
 //here we used try with resources block. This makes our code handy and we don't have to write the close method as we have to use more try catch block.
  // But using try with resources JVM automatically handles the close method. we need not to worry about close method and our code works fine.  

		try (FileReader fr = new FileReader("C:\\Users\\ujjwa\\OneDrive\\Documents\\Demo.txt");
				BufferedReader br = new BufferedReader(fr);) {  //used for reading and writing the multiple data.

			String line;
			int count = 0;
			while ((line = br.readLine()) != null) {
				StringTokenizer str = new StringTokenizer(line);

				while (str.hasMoreTokens()) {
					System.out.println(str.nextToken());
					count++;
				}
			}
			System.out.println("Number of words: " + count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}

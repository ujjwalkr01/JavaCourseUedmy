package ioStreams_Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {

		FileOutputStream fos;
		ObjectOutputStream oos;

		try {
			fos = new FileOutputStream("C:\\Users\\ujjwa\\OneDrive\\Documents\\Emp.ser"); //(.ser) is a extension used for serialized file...
			oos = new ObjectOutputStream(fos);

			Employee obj = new Employee(1, "Ujjwal", 100000, 1234);
			oos.writeObject(obj); //use to write the object into the stream... 

			System.out.println("Employee class Serialized..");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
//Serialization in Java allows us to convert an Object to stream that we can send over the network or save it as file or store in DB for later usage

}

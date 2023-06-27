package ioStreams_Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("C:\\Users\\ujjwa\\OneDrive\\Documents\\Emp.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Object obj = ois.readObject(); //use to read the object from the stream..
		Employee emp = (Employee) obj; //typeCasting...

		System.out.println("Employee Id: " + emp.id);
		System.out.println("Employee Name: " + emp.name);
		System.out.println("Employee Salary: " + emp.salary);
		System.out.println("Employee SSN: " + emp.ssn);
	}

	//Deserialization is the process of converting Object stream to actual Java Object to be used in our program.
}

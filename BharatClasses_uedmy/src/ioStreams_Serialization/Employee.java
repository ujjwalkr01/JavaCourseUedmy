package ioStreams_Serialization;

import java.io.Serializable;

public class Employee implements Serializable {

	int id;
	String name;
	double salary;
	transient int ssn;  //it will not serialized....

	Employee(int id, String name, double salary, int ssn) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.ssn = ssn;
	}
}

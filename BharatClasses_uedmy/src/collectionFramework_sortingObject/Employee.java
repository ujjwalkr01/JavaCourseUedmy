package collectionFramework_sortingObject;

public class Employee implements Comparable<Employee> {

	int id;
	String name;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	//so when we implement comparable interface then we don't have to pass the class name in the TreeSet constructor....  

	@Override
	public int compareTo(Employee o) {
		int id1 = this.id;
		int id2 = o.id;

		if (id1 < id2)
			return -1;
		else if (id1 > id2)
			return 1;
		else
			return 0;
	}

}

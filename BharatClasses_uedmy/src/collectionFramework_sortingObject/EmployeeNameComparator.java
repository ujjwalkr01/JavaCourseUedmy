package collectionFramework_sortingObject;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {

//but when we implement comparator then we have to pass the class name in the TreeSet constructor.....	
	
	@Override
	public int compare(Employee o1, Employee o2) {

		String s1 = o1.name;
		String s2 = o2.name;
       
		return s1.compareTo(s2);

	}

}

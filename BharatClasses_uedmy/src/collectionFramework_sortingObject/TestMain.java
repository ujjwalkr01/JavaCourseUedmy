package collectionFramework_sortingObject;

import java.util.Set;
import java.util.TreeSet;

public class TestMain {

	public static void main(String[] args) {

		Set<Employee> set = new TreeSet<>(new EmployeeNameComparator());
		set.add(new Employee(110, "Ujjwal"));
		set.add(new Employee(100, "Mitu"));
		set.add(new Employee(300, "Xyz"));
		set.add(new Employee(200, "Abc"));
		
		for(Employee employee: set)
			System.out.println(employee.id+" "+employee.name);

	}

}

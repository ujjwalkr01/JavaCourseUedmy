package collectionFramework_Comparator;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Strings {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<>(new StringComparator());

		set.add("abcdddd");
		set.add("xyzff");
		set.add("def");
		set.add("mnoereeeeeeeeee");

		// System.out.println("Set:" + set);

		for (String obj : set) {       //hence treeSet even prints Strings in ascending order...
			System.out.println(obj);
		}
	}

}

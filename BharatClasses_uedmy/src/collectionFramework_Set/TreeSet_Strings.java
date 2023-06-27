package collectionFramework_Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Strings {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<>();

		set.add("abc");
		set.add("xyz");
		set.add("def");
		set.add("mno");

		// System.out.println("Set:" + set);

		for (String obj : set) {       //hence treeSet even prints Strings in ascending order...
			System.out.println(obj);
		}
	}

}

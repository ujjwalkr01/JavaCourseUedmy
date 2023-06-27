package collectionFramework_Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_StringBuffer {

	public static void main(String[] args) {

		Set<StringBuffer> set=new TreeSet<>();
		
		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("xyz"));
		set.add(new StringBuffer("mno"));
		set.add(new StringBuffer("pqr"));
		
		for (StringBuffer object: set) {
			System.out.println(object);
		}
		
	}

}

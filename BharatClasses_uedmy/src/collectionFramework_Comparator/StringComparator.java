package collectionFramework_Comparator;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int l1 = o1.length();
		int l2 = o2.length();
		System.out.println("l1 " + l1);

		System.out.println("l2 " + l2);
		System.out.println("---------------------------");
		//internally it does sorting ... and arrange it either in the aesc/desc order...

		if (l1 < l2)
			return -1;
		else if (l1 > l2)
			return 1;
		else
			return o1.compareTo(o2);

	}

}

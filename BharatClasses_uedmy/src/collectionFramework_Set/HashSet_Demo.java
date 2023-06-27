package collectionFramework_Set;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class HashSet_Demo {

	public static void main(String[] args) {

		Random obj = new Random(); //to create the random number we use this class...

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			int number = obj.nextInt(5); // it will generate the number under the limit that is 5....
			list.add(number);
		}
		System.out.println("List: " + list);

		Set<Integer> set = new HashSet<>(list);
		System.out.println("Set: " + set);

		Set<Integer> set1 = new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(20);
		set1.add(30);
		set1.addAll(set);
		System.out.println("SET: " + set1);

		set.remove(4);
		System.out.println("After removing the set1:" + set);
		
	}

}

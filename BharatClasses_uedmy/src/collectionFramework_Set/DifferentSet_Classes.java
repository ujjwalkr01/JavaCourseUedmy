package collectionFramework_Set;

import java.util.Random;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class DifferentSet_Classes {

	public static void main(String[] args) {

		Random obj = new Random();

		HashSet<Integer> set = new HashSet<>(); // HashSet prints the output in the random order...

		for (int i = 0; i < 5; i++) {
			int num = obj.nextInt(100);
			set.add(num);
			System.out.println(num);
		}
		System.out.println("HashSet elements are: " + set);
		System.out.println("--------------------------------------------------");

		Set<Integer> set1 = new LinkedHashSet<>(); // LinkedHashSet prints the output same as in the order....

		for (int i = 0; i < 5; i++) {
			int num = obj.nextInt(100);
			set1.add(num);
			System.out.println(num);
		}
		System.out.println("LinkedHashSet elements are: " + set1);
		System.out.println("--------------------------------------------------");

		Set<Integer> set2 = new TreeSet<>(); // TreeSet print the outputs in ascending order..

		for (int i = 0; i < 5; i++) {
			int num = obj.nextInt(100);
			set2.add(num);
			System.out.println(num);
		}
		System.out.println("TreeSet elements are: " + set2);

		

	}

}

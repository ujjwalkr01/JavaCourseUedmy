package collectionFramework_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LikedListDemo {

	public static void main(String[] args) {

		Object objects[] = new Object[5];

		for (int i = 0; i < objects.length; i++) {
			objects[i] = new Object();
		}

		List<Object> list = new LinkedList<>();

		long start = System.currentTimeMillis();
		for (Object object : objects) {
			list.add(object);
		}
		System.out.println("List: " + list);
		long end = System.currentTimeMillis();
		System.out.println("Time taken by linkedList: " + (end - start));
		System.out.println("__________________________________________________");

		List<Object> list1 = new ArrayList<>();

		long start1 = System.currentTimeMillis();
		for (Object object : objects) {
			list1.add(object);
		}
		System.out.println("List: " + list1);
		long end1 = System.currentTimeMillis();
		System.out.println("Time taken by arrayList: " + (end1 - start1));

		List<Integer> list2 = new LinkedList<>();
		list2.add(20);
		list2.add(20);
		list2.add(30);
		System.out.println("List2: " + list2);

		list.addAll(2, list2);
		System.out.println("after adding in the first list: " + list);

		list.set(2, 100);
		System.out.println("List after replacing: " + list);

		list.remove(2);
		System.out.println("List after removing: " + list);
	}

}

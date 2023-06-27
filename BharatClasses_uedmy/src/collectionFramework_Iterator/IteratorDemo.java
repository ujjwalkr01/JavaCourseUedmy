package collectionFramework_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(40);

		Iterator<Integer> itr = list.iterator(); // iterator methods work with all the collection framework....like list,set,queue etc..
													// basically used to traverse the element in the forward direction as well as reverse direction...
		while (itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}
		System.out.println("List: " + list);
        System.out.println("------------------------------------------------------");
		
		Set<Integer> set = new TreeSet<>();
		set.add(20);
		set.add(10);
		set.add(40);
		set.add(50);

		Iterator<Integer> itr1 = set.iterator(); // this method can be used with any collection frameworks...

		while (itr1.hasNext()) {
			System.out.println(itr1.next());
			itr1.remove();                   //this method is used to remove all the element...
		}
		System.out.println("Set after using iterator: " + set);
	}

}

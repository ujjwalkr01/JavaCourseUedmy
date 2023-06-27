package collectionFramework_Iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class List_Iterator {

	public static void main(String[] args) {

		List<String> list = new LinkedList<>();

		list.add("abc");
		list.add("xyz");
		list.add("def");
		

		ListIterator<String> itr = list.listIterator();

		System.out.println("Traverse of list in forward direction...");
		while (itr.hasNext()) { // it prints the element in the forward order....
			System.out.println(itr.next());
		}
		
		System.out.println("Traverse of list in reverse direction...");
		while(itr.hasPrevious()) {  //it prints the element in the previous order....
			System.out.println(itr.previous());
		}
	}

}

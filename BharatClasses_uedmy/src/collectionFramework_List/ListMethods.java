package collectionFramework_List;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(); //we can use runtime polymorphism as List is a parent interface of arrayList and linked list....

		for (int i = 10; i <= 100; i += 10) {
			list.add(i);
		}
		System.out.println("List: " + list);

		list.add(2, 100); // this add() takes specific index and is used to add the new element at that index in the list....
		System.out.println("List after adding new element: " + list);

		list.set(3, 200); // set() takes specific index and is used to replace the current element at that index in the list..
		System.out.println("List after replacing the element: " + list);
		System.out.println("--------------------------------------------------");
		
		List<Integer> secondList = new ArrayList<>();
		secondList.add(111);
		secondList.add(222);
		secondList.add(333);

		System.out.println("Second list: " + secondList);

		list.addAll(4, secondList); // this addAll() uses specific index where we want to merge the elements of second list in the first list...
		System.out.println("Final list after adding the first and second list: " + list);

		list.addAll(secondList); // this addAll() directly merge the elements of second list at the end of the first list...
		System.out.println("list after adding the first and second list: " + list);

		if (list.contains(2221)) { // contains() is used to check that the element is present in the list...
			System.out.println("Element is present in the list");
		} else {
			System.out.println("Element is not present in the list");
		}

		System.out.println("Element in the list are:");
		for (int i = 0; i < list.size(); i++) { //size() indicate the total no. of elements present in it....
			System.out.println(list.get(i));//it prints the elements from the list.
		}

		list.remove(4); //it removes the element of a specific index from the list...
		System.out.println("After removing the specific element in the list: " + list);

	}

}

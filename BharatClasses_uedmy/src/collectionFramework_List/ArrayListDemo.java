package collectionFramework_List;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(10);     //so here we can add any data types to our array , which is not a right way to use arrayList...
		list.add(20.40);   //thats why we are getting warnings!!
		list.add("Hello world");
		
		System.out.println(list);
		
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(10);
		list1.add(20);
//		list1.add(20.40); //so here we will get an error as we have use generic so that we can restrict array list to store only data i.e integer..
		System.out.println(list1);
	}

}

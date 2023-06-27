package collectionFramework_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("Ujjwal", 110);
		map.put("Mitu", 100);
		map.put("Shruti", 200);
		map.put("Ayush", 400);

		Set<String> keySet = map.keySet(); // use to print the key value..
		System.out.println("Key:" + keySet);

		Collection<Integer> values = map.values(); //use to print the values....
		System.out.println("Values:" + values);

		for (String key : keySet) //each key pair has specific value so we can print the value on the basic of key....
			System.out.println("Key:" + key + " Value:" + map.get(key));
	}

}

package collectionFramework_Map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdenityHashMap {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		Integer id1 = new Integer(10);
		Integer id2 = new Integer(10);

		map.put(id1, "Ujjwal");
		map.put(id2, "Kumar");
//if there is a same key multiple times with different value then hashmap overrides with the last key and value....and prints only latest value
		System.out.println(map);
		System.out.println("------------------------------------------");
		
		Map<Integer, String> map1 = new IdentityHashMap<>();
         
		map1.put(id1, "Ujjwal");
		map1.put(id2, "Kumar");
//but in identity hashmap it prints both the key with the value.........		
		System.out.println(map1);

	}

}

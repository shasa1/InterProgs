

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
	
		//ArrayList Demo
		ArrayList<String> name = new ArrayList<String>();
		name.add("sam");
		name.add("sam");
		
		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i));
		}
		
//		//Set Demo
//		Set<String> name1 = new HashSet<String>();
//		name1.add("sam");
//		name1.add("sam");
//		
//		for (int i = 0; i < name1.size(); i++) {
//		//	System.out.println(name1.get(i));
//		}
//		
		
		//HashMapDemo
		HashMap<String, String> names = new HashMap<String, String>();
		names.put("name", "Salman");
		names.put("surname", "Shaikh");

		for (String key : names.keySet()) {
		   System.out.println("------------------------------------------------");
		   System.out.println("Iterating or looping map using java5 foreach loop");
		   System.out.println("key: " + key + " value: " + names.get(key));
		}

		
		HashMap<Object, Object> datatypes = new HashMap<Object, Object>();
		datatypes.put(1, "Salman");
		datatypes.put("second", 123);
		datatypes.put(3, null);
		
		System.out.println("Getting the second value:"+ datatypes.get("second"));
	}
	
	

}

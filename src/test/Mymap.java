package test;

import java.util.*;
import java.util.Map.Entry;

import Student.Student;


public class Mymap {

	/*public static void main(String[] args) {
		 HashMap<String,String> map = new HashMap<String,String>();
		 String p = map.put("zhang", "Yi");
		 String p1 = map.put("zhang", "zhuzhu");
		 String p2 = map.put("yan", "t");
		 
//		 map.clear();
		// String remove = map.remove("zhang");
		 boolean containsKey = map.containsKey("zhang");
		 boolean containsValue = map.containsValue("zhuzhu");
		 boolean empty = map.isEmpty();
		 String string = map.get("zhang");
		 int size = map.size();
		 Set<String> keySet = map.keySet();
		 Collection<String> values = map.values();
		 Set<Entry<String, String>> entrySet = map.entrySet();
		 
		// map.clear();
		
		 System.out.println( entrySet );
	

	}
*/
	
	public static void main(String[] args) {
	Set<String> set1 = new TreeSet<>();
	set1.add("aaa");
	set1.add("aaa");
	set1.add("aab");
	set1.add("baa");
	for (String s : set1) {
		System.out.println(s);
	}
	}
}
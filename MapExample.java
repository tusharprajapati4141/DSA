package javacollection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		//HashMap<String,Integer> map = new HashMap<String,Integer>();
		//LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
		TreeMap<String,Integer> map = new TreeMap<String,Integer>(Comparator.reverseOrder());
		map.put("One",1);
		map.put("Three",3);
		map.put("Eight",8);
		map.put("Four",4);
		map.put("Nine",9);
		map.put("Nine", 19);//replace old value of nine through key
		System.out.println(map);
		
		System.out.println(map.containsKey("Ten"));//find specific value in the map
		System.out.println(map.containsKey("Nine"));
		map.remove("Three");//remove only key
		System.out.println(map);
		System.out.println();
		//key ko bhar nikalne ke liye
		for(String key:map.keySet()) {
			System.out.print(key+" ");
		}
		System.out.println();
		//Value ko  bhar nikalne ke liye
		for(Integer value:map.values()) {
			System.out.print(value+" ");
		}
	}

}

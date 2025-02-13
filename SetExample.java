package javacollection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Integer data[]= {12,11,11,3,3,5,6};
		//LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();//Linkedhashset print value in ordered way but hashset not print value in ordered way.
		TreeSet<Integer> set = new TreeSet<Integer>();//it is used arraysort 
		set.add(12);//displayed elemnet in unordered way and not print duplicate value
		set.add(45);
		set.add(78);
		set.add(34);
		set.add(87);
		set.add(12);
		set.addAll(List.of(data));//duplicate value remove in the array
		System.out.println(set);
		
		//foreach
		for(Integer v:set) {
			System.out.println(v+" ");
		}
		//iterator
		System.out.println();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
	}

}

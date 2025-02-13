package javacollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class ArrayListExample {

	public static void main(String[] args) {
		Integer data[] = {12,34,2,45,67,89};
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(13);
		list.add(24);
		list.add(45);
//		list.addAll(List.of(data));
		list.addAll(Arrays.asList(data));
		System.out.println(list);
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i)+" ");
		}
		System.out.println();
		
		for(Integer v:list) {
			System.out.println(v+" ");
		}
		Iterator<Integer> it = list.iterator();
		System.out.println();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
		System.out.println();
		list.forEach(value->System.out.print(value+" "));
		//list.remove(1);
		//System.out.println(list);
		//list.remove(Integer.valueOf(45));
		//System.out.println(list);
		//list.set(5 , 102);
		System.out.println(list);
		//list.removeAll(List.of(12,34));
		//System.out.println(list);
		//System.out.println(list.contains(102));


	}

}
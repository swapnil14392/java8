package java8.stream;

import java.util.ArrayList;
import java.util.List;

public class ToArrayMethod {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(20);
		list.add(0);
		list.add(3);
		list.add(15);
		
//		This is by lambda Expression
		list.stream().forEach(s->System.out.println(s));
		System.out.println();
		
		Integer array[]=list.stream().toArray(Integer[] :: new);
		
		for(Integer i:array)
		{
			System.out.println(i);
		}
	}

}

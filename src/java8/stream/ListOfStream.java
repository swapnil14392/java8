package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListOfStream {

	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(20);
		list.add(0);
		list.add(3);
		list.add(15);
		list.add(10);
		list.add(3);
		list.add(15);
	   System.out.println("Before sorting--"+list);	
	   
	   List<Integer> ls=list.stream().filter(i->i%2==0).collect(Collectors.toList());
	   
	   System.out.println("After filtering Even numbers--"+ls);
	   
	   List<Integer> lss=list.stream().map(i->i*2).collect(Collectors.toList());
			   
	   System.out.println("Performing Operation on existing values 2 times--"+lss);
	   
	   list.stream().distinct().limit(3).forEach(System.out::println);
	   System.out.println();
	   
	   /*Note:  return parallel Stream collection, for sequential order used sequential explicitly with it*/
	   list.parallelStream().forEach(System.out::println);
	   System.out.println();
	   list.parallelStream().sequential().forEach(System.out::println);
	  

	}

}

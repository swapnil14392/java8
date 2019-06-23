package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectAndCountMethodOfStreamInterface {

	public static void main(String[] args) {

		List<String> list= new ArrayList<>();
		list.add("Dravid");
		list.add("Sachin");
		list.add("Rahul");
		list.add("Dhawan");
		list.add("malinga");
		
		
//	1.	Collect Method
		List<String> list1=list.stream().filter(i->i.length()>6).collect(Collectors.toList());
		System.out.println(list1);
		
		List<String> list2=list.stream().map(s->s.toUpperCase()+" Indian Team".toUpperCase()).collect(Collectors.toList());
		System.out.println(list2);
	
//	2.	Count Method		
		Long count=list.stream().filter(i->i.length()>6).count();
		System.out.println(count);
		

		
		
	}

}

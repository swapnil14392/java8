package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethodOfStreamInterface {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(20);
		list.add(0);
		list.add(3);
		list.add(15);
		
	   System.out.println("Before sorting--"+list);	
	   
	   List<Integer> ls=list.stream().sorted().collect(Collectors.toList());
	   System.out.println("After Acs--"+ls);
	   
	   List<Integer> lss=list.stream().sorted((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0).collect(Collectors.toList());
	   System.out.println("After Dsc-1-"+lss);
	   
	   List<Integer> lsss=list.stream().sorted((I1,I2)->-I1.compareTo(I2)).collect(Collectors.toList());
	   System.out.println("After Dsc-2-"+lsss);
	   
	   

	}

}

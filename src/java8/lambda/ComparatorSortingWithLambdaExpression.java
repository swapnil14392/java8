package java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Integer>
{
	@Override
	public int compare(Integer o1, Integer o2)
	{
		return (o1>o2)?-1:(o1<o2)?1:0;
	}
}

public class ComparatorSortingWithLambdaExpression {

	public static void main(String[] args) 
	{
		Comparator<Integer> comparator = new MyComparator();
		
		Comparator<Integer> comparatorLambda=(o1,o2)->{return (o1>o2)?-1:(o1<o2)?1:0;};
		
		List<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(20);
		list.add(0);
		list.add(3);
		list.add(15);
		
	   System.out.println("Before sorting--"+list);	
	   Collections.sort(list);
	   System.out.println("After sorting--Ascending order--"+list);
	   Collections.sort(list,comparator);
	   System.out.println("After sorting--Descending order--"+list);
	   
//	   Using Lambda Expression
	   Collections.sort(list,comparatorLambda);
	   System.out.println("After sorting--Descending order-Lambda-"+list);
		

	}

}

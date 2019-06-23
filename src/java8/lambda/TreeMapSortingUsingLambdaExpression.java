package java8.lambda;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapSortingUsingLambdaExpression {

	public static void main(String[] args) {
		
		Comparator<Integer> comparatorLambda=(I1,I2)->{return (I1>I2)?-1:(I1<I2)?1:0;};
		
		Map<Integer,String> map = new TreeMap<>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
		map.put(10,"dravid");
		map.put(5,"Dravid");
		map.put(15,"Dhoni");
		map.put(4,"dhawan");
		map.put(20,"Durga");
		map.put(0,"Sachin");
		System.out.println("Before sorting--"+map);	
		
	}

}

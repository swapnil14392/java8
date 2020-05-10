package java8.lambda;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithLambdaExpression {

	public static void main(String[] args) {
		
//		Comparator<Integer> comparatorLambda=(I1,I2)->{return (I1>I2)?-1:(I1<I2)?1:0;};
		
//		More Concise code
		Comparator<Integer> comparatorLambda=(I1,I2)->(I1>I2)?-1:(I1<I2)?1:0;
		
		Set<Integer> treeset= new TreeSet<>(comparatorLambda); //Note: for desc oder sorting pass comparator
		treeset.add(10);
		treeset.add(5);
		treeset.add(3);
		treeset.add(20);
		treeset.add(15);
		treeset.add(30);
		System.out.println("descending sorting--"+treeset);	
		
	}

}

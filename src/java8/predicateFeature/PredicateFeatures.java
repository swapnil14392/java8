package java8.predicateFeature;

import java.util.function.Predicate;

public class PredicateFeatures {

	public static void main(String[] args) {
		
		Predicate<Integer> p1=i->i>10;
		Predicate<Integer> p2=i->i%2==0;
		
		Predicate<Integer> p3=p1.and(p2);
		System.out.println("---Final Result--"+p3.test(12));
		
		Predicate<Integer> p4=p1.or(p2);
		System.out.println("---Final Result--"+p4.test(9));
		
		Predicate<Integer> p5=p1.negate();
		Predicate<Integer> p6=p2.negate();
		
		Predicate<Integer> p7=p5.and(p6);
		System.out.println("---Negate Result--"+p7.test(12));
	}

}

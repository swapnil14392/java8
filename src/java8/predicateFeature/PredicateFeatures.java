package java8.predicateFeature;

import java.util.function.Predicate;

/*Note:A predicate is a function with a single argument and returns boolean value,
 * It’s a functional interface a contain method test().
*/
public class PredicateFeatures {

	public static void main(String[] args) {
		/*Check Length of String*/
		Predicate<String>s1=s->s.length()>5;
		System.out.println("String Length: "+s1.test("swapnil"));
		
		Predicate<Integer> p1=i->i>10;
		Predicate<Integer> p2=i->i%2==0;
		
		/* Predicate joining: and()  or()  negate()  */
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

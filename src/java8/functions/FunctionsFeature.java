package java8.functions;

import java.util.function.Function;

/*Note:  functions can return any type of result but function should (can) return only one value 
 * and that value can be any type as per our requirement.
  It’s a functional interface a contain method apply().*/
public class FunctionsFeature {
	public static void main(String[] args) {
		Function<String, Integer>f=s->s.length();

		System.out.println(f.apply("swapnilRajapkar"));	
	}

}

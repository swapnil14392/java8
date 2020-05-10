package java8.examples;

import java.math.BigInteger;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class PrimeNumber {

	public static void main(String[] args) {
		Stream.iterate(BigInteger.valueOf(2), BigInteger::nextProbablePrime)
		.limit(10)
		.forEach(x->System.out.format("%s ", x));
		System.out.println();
		/*method-2*/
		List<Integer> generate = PrimeNumber.generate(10);
		generate.forEach(x->System.out.format("%s ", x));

	}
	private static List<Integer> generate(int series) {
		 Set<Integer> set = new TreeSet<>();
		 return Stream.iterate(1, i -> ++i)
	                .filter(i -> i %2 != 0)
	                
	                .filter(i -> {
	                    set.add(i);
	                    return 0 == set.stream()
	                            .filter(p -> p != 1)
	                            .filter(p -> !Objects.equals(p, i))
	                            .filter(p -> i % p == 0)
	                            .count();
	                })
	                .limit(series)
	                .collect(Collectors.toList());
	}
	
	/* method -3*/
	/*public static List<Integer> primeNumbersTill(int n) {
		    return IntStream.rangeClosed(2, n)
		      .filter(x -> isPrime(x)).boxed()
		      .collect(Collectors.toList());
		}
		private static boolean isPrime(int number) {
		    return IntStream.rangeClosed(2, (int) (Math.sqrt(number)))
		      .filter(n -> (n & 0X1) != 0)
		      .allMatch(n -> x % n != 0);
		}*/
	
	
	
}

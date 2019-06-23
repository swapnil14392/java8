package java8.stream;

import java.util.stream.Stream;

public class StreamOfMethod {

	public static void main(String[] args) {
		
		Integer arr[]={10,20,30,40,50,};
		
		Stream<Integer> s=Stream.of(arr);
		
		s.forEach(System.out::println);
		

	}

}

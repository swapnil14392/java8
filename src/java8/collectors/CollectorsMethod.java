package java8.collectors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsMethod {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("Rohit", 10, "Economics", 95.9));
		studentList.add(new Student("Virat", 11, "IT", 95.56));
		studentList.add(new Student("KL Rahul", 12, "Maths", 80.55));
		studentList.add(new Student("Shreyash", 13, "Marathi", 78.9));
		studentList.add(new Student("Shikhar", 14, "Data science", 75.9));
		studentList.add(new Student("dhoni", 15, "Data science", 90.9));

		studentList.stream().forEach(System.out::println);
		System.out.println();

		// toList with desc sort
		studentList.stream().sorted(Comparator.comparing(Student::getName).reversed()).collect(Collectors.toList())
				.forEach(System.out::println);
		System.out.println();

		// toSet
		studentList.stream().map(Student::getSubject).collect(Collectors.toSet()).forEach(System.out::println);

		// toMap method
		Map<String, Double> namePercentageMap = studentList.stream()
				.collect(Collectors.toMap(Student::getName, Student::getPercent));
		System.out.println(namePercentageMap);
		System.out.println();

		/*
		 * Note: joining method returns a Collector which concatenates input elements
		 * separated by the specified delimiter
		 */
		String namesJoined = studentList.stream().map(Student::getName).collect(Collectors.joining(", "));
		System.out.println(namesJoined);
		System.out.println();
	}

}

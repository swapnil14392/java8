package java8.collectors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsAggregateMethod {

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

		Long studentCount = studentList.stream().collect(Collectors.counting());

		System.out.println("Student count: " + studentCount);
		Optional<Double> highPercentage = studentList.stream().map(Student::getPercent)
				.collect(Collectors.maxBy(Comparator.naturalOrder()));
		System.out.println("highPercentage: " + highPercentage);

		Optional<Double> lowPercentage = studentList.stream().map(Student::getPercent)
				.collect(Collectors.minBy(Comparator.naturalOrder()));
		System.out.println("lowPercentage: " + lowPercentage);

		Double sumOfPercent = studentList.stream().collect(Collectors.summingDouble(Student::getPercent));
		System.out.println("sumOfPercent: " + sumOfPercent);
		System.out.println();

		/*
		 * Note: summarizingDouble methods return a special class called Int/Long/
		 * DoubleSummaryStatistics which contain statistical information like sum, max,
		 * min, average etc of input elements
		 */
		
		DoubleSummaryStatistics studentStats = studentList.stream()
				.collect(Collectors.summarizingDouble(Student::getPercent));
		System.out.println("Highest Percent: " + studentStats.getMax());
		System.out.println("Lowest Percent: " + studentStats.getMin());
		System.out.println("Average Percent: " + studentStats.getAverage());
		System.out.println("Sum Percent: " + studentStats.getSum());
		System.out.println("Count Percent: " + studentStats.getCount());

	}

}

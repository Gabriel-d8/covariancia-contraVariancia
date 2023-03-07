package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> ints = Arrays.asList(10, 20, 30);
		List<Double> doubles = Arrays.asList(130.00, 210.00);
		
		List<Object> objects = new ArrayList<>();
		
		copy(ints, objects);
		printList(objects);
		copy(doubles, objects);
		printList(objects);
		
	}

	private static void copy(List<? extends Number> source, List<? super Number> target) {
		for (Number number : source) {
			target.add(number);
		}
	}
	
	private static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " | ");
		}
		System.out.println();
	}
	
}
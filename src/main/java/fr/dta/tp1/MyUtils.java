package fr.dta.tp1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class MyUtils {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

	public static int sum(List<Integer> list) {
		int sum = 0;

		for (Integer integer : list) {
			sum += integer;
		}
		return sum;
	}

	public static String emptyToNull(String s) {
		return s.isEmpty() ? null : s;
	}

	public static List<Integer> filterEvenNumbers(List<Integer> integers) {
		return integers.stream().filter(value -> value % 2 == 0).collect(Collectors.toList());

	}

	public static List<Float> transformSquarePlusPointFive(List<Integer> integers) {
		return integers.stream().map(intergers -> ((intergers * intergers) + 0.5F)).collect(Collectors.toList());
	}
}

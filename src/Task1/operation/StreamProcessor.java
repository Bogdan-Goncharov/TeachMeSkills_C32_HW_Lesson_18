package Task1.operation;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StreamProcessor {
    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<Integer> filterEvenNumbersInRange(List<Integer> numbers, int start, int end) {
        return numbers.stream()
                .filter(n -> n % 2 == 0 && n >= start && n <= end)
                .collect(Collectors.toList());
    }

    public static List<Integer> multiplyByTwo(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }

    public static List<Integer> getFirstSortedElements(List<Integer> numbers, int limit) {
        return numbers.stream()
                .sorted()
                .limit(limit)
                .collect(Collectors.toList());
    }

    public static long countElements(List<Integer> numbers) {
        return numbers.stream().count();
    }

    public static OptionalDouble calculateAverage(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .average();
    }
}

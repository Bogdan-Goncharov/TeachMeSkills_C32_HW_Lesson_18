package Task1;

import Task1.operation.RandomNumberGenerator;
import Task1.operation.StreamProcessor;

import java.util.List;

public class ApplicationRunner {
    public static void main(String[] args) {
        // Generate random numbers
        List<Integer> numbers = RandomNumberGenerator.generateRandomNumbers(20, 30);
        System.out.println("Original list: " + numbers);

        // Remove duplicates
        List<Integer> distinctNumbers = StreamProcessor.removeDuplicates(numbers);
        System.out.println("After removing duplicates: " + distinctNumbers);

        // Filter even numbers in the range from 7 to 17
        List<Integer> evenNumbersInRange = StreamProcessor.filterEvenNumbersInRange(distinctNumbers, 7, 17);
        System.out.println("Even numbers in the range from 7 to 17: " + evenNumbersInRange);

        // Multiply each element by 2
        List<Integer> multipliedNumbers = StreamProcessor.multiplyByTwo(evenNumbersInRange);
        System.out.println("Elements multiplied by 2: " + multipliedNumbers);

        // Sort and output the first 4 elements
        List<Integer> sortedNumbers = StreamProcessor.getFirstSortedElements(multipliedNumbers, 4);
        System.out.println("First 4 elements after sorting: " + sortedNumbers);

        // Output the number of elements in the stream
        long count = StreamProcessor.countElements(multipliedNumbers);
        System.out.println("Number of elements in the stream: " + count);

        // Output the average of all numbers in the stream
        double average = StreamProcessor.calculateAverage(multipliedNumbers).orElse(0);
        System.out.println("Average of all numbers in the stream: " + average);
    }
}

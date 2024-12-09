package Task1.operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberGenerator {
    public static List<Integer> generateRandomNumbers(int count, int bound) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt(bound));
        }
        return numbers;
    }
}


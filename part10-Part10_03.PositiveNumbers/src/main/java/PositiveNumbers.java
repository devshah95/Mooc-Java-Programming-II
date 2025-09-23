
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-5);
        numbers.add(3);
        numbers.add(-2);
        numbers.add(8);
        numbers.add(0);
        numbers.add(12);

        System.out.println("Original list: " + numbers);

        // Test the positive method
        List<Integer> positiveNumbers = positive(numbers);

        System.out.println("Positive numbers: " + positiveNumbers);

        // Test with empty list
        List<Integer> empty = new ArrayList<>();
        System.out.println("Empty list result: " + positive(empty));

        // Test with all negative numbers
        List<Integer> allNegative = new ArrayList<>();
        allNegative.add(-1);
        allNegative.add(-5);
        allNegative.add(-10);
        System.out.println("All negative result: " + positive(allNegative));

    }

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
                .filter(s -> s > 0)
                .collect(Collectors.toCollection(ArrayList::new));
    }

}

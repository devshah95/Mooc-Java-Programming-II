
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num < 0) {
                break;
            }
            numbers.add(num);
        }
        numbers.stream()
                .filter(s -> s >= 1 && s <= 5)
                .forEach(s -> System.out.println(s));
    }
}

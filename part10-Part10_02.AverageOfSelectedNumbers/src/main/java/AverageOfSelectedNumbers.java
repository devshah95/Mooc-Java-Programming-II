
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>();

        while (true) {
            String num = scanner.nextLine();
            if (num.equals("end")) {
                break;
            }
            numbers.add(num);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String option = scanner.nextLine();

        if (option.equals("p")) {
            double num = numbers.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(s -> s > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of positive nubmers is: " + num);
        } else if (option.equals("n")) {
            double num = numbers.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(s -> s < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of negative nubmers is: " + num);
        }
    }
}

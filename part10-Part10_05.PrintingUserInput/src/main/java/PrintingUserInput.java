
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stuff = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            stuff.add(input);
        }
        stuff.stream()
                .forEach(s -> System.out.println(s));
    }
}

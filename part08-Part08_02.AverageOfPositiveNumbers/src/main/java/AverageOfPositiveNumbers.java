import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int sum = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            if (input >= 0) {
                nums.add(input);
            }
        }
        if (nums.isEmpty()) {
            System.out.println("Cannot calculate the average");
        } else {
            for (int num : nums) {
                sum += num;
            }
            System.out.println((double) sum / nums.size());
        }
    }
}

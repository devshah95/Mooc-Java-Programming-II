import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList list;

    public UserInterface(Scanner scanner, TodoList list) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            if (input.equals("list")) {
                list.print();
            }
            if (input.equals("add")) {
                System.out.print("To add: ");
                String addition = scanner.nextLine();
                list.add(addition);
            }
            if (input.equals("remove")) {
                System.out.print("Which one to remove? ");
                int remove = Integer.valueOf(scanner.nextLine());
                list.remove(remove);
            }
        }
    }
}

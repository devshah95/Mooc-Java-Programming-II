public class Main {
    public static void main(String[] args) {
        // Create some books and CDs
        Book book1 = new Book("Author1", "Book1", 1.0);
        Book book2 = new Book("Author2", "Book2", 1.5);
        CD cd1 = new CD("Artist1", "Album1", 2020);

        // Create small boxes with items
        Box smallBox1 = new Box(5);
        smallBox1.add(book1);
        smallBox1.add(cd1);

        Box smallBox2 = new Box(3);
        smallBox2.add(book2);

        // Create a big box and add smaller boxes to it
        Box bigBox = new Box(20);
        bigBox.add(smallBox1);
        bigBox.add(smallBox2);
        bigBox.add(new Book("Author3", "Book3", 2.0));

        System.out.println("Small box 1: " + smallBox1);
        System.out.println("Small box 2: " + smallBox2);
        System.out.println("Big box: " + bigBox);

        // Try adding a box to itself
        System.out.println("\nTrying to add box to itself:");
        Box selfBox = new Box(10);
        selfBox.add(new Book("Test", "Test", 1.0));
        System.out.println("Before: " + selfBox);

        selfBox.add(selfBox); // Try adding box to itself
        System.out.println("After: " + selfBox);
    }
}
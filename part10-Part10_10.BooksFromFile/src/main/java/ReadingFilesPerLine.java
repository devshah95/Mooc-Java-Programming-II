import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        List<String> lines = read("book.txt"); // Changed to List<String>
        lines.forEach(line -> System.out.println(line)); // Print strings, not books
    }

    public static List<String> read(String file) {
        try {
            return Files.lines(Paths.get(file))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
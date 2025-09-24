import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<LiteracyData> data = new ArrayList<>();

        try {
            Files.lines(Paths.get("part10-Part10_13.LiteracyComparison/literacy.csv"))
                    .map(l -> l.split(","))
                    .map(x -> new LiteracyData(x[3], Integer.valueOf(x[4]), x[2].replace("(%)", "").trim(),
                            Double.valueOf(x[5])))
                    .forEach(x -> data.add(x));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

        data.stream()
                .sorted((d1, d2) -> Double.compare(d1.getLiteracyRate(), d2.getLiteracyRate()))
                .forEach(d -> System.out.println(d));
    }
}
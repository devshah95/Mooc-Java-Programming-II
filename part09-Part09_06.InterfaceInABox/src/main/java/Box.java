import java.util.ArrayList;

public class Box implements Packable {

    private double maxCapacity;
    private ArrayList<Packable> boxItems;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.boxItems = new ArrayList<>();
    }

    public void add(Packable item) {

        if (item == this) {
            return;
        }
        if (this.weight() + item.weight() <= maxCapacity) {
            boxItems.add(item);
        }
    }

    public double weight() {
        double totalWeight = 0;
        for (Packable item : this.boxItems) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }

    public String toString() {
        return "Box: " + boxItems.size() + " items, total weight " + this.weight() + " kg";
    }
}

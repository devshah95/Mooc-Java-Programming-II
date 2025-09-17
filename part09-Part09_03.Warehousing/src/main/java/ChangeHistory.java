import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public String toString() {
        return this.history.toString();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double max = this.history.get(0);
        for (double amount : history) {
            if (amount > max) {
                max = amount;
            }
        }
        return max;
    }

    public double minValue() {
        double min = 0;
        if (this.history.isEmpty()) {
            return min;
        }
        return Collections.min(this.history);
    }

    public double average() {
        double sum = 0;
        if (this.history.isEmpty()) {
            return 0;
        }
        for (double amount : history) {
            sum += amount;
        }
        return sum / this.history.size();
    }
}

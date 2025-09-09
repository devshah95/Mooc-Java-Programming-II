import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> oweList;

    public IOU() {
        this.oweList = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.oweList.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.oweList.getOrDefault(toWhom, 0.0);
    }
}

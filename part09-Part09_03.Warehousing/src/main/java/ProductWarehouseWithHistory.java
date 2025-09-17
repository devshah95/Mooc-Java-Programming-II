import java.util.ArrayList;

public class ProductWarehouseWithHistory extends ProductWarehouse {
    private double initialBalance;
    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.initialBalance = initialBalance;
        this.changeHistory = new ChangeHistory();

        super.addToWarehouse(initialBalance);
        this.changeHistory.add(initialBalance);
    }

    public String history() {
        return this.changeHistory.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.changeHistory.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double result = super.takeFromWarehouse(amount);
        this.changeHistory.add(super.getBalance());
        return result;
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.changeHistory.toString());
        System.out.println("Largest amount of product: " + changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + changeHistory.minValue());
        System.out.println("Average: " + changeHistory.average());
    }
}

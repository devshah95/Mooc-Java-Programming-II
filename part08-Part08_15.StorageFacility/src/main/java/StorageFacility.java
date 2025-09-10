import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageMap;

    public StorageFacility() {
        this.storageMap = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storageMap.putIfAbsent(unit, new ArrayList<>());
        this.storageMap.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.storageMap.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        if (this.storageMap.containsKey(storageUnit)) {
            ArrayList<String> items = this.storageMap.get(storageUnit);
            items.remove(item);
            if (items.isEmpty()) {
                this.storageMap.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        return new ArrayList<>(this.storageMap.keySet());
    }
}
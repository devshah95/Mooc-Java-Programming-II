import java.util.ArrayList;

public class Pipe<T> {

    private ArrayList<T> item;

    public Pipe() {
        this.item = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        item.add(value);
    }

    public T takeFromPipe() {
        if (isInPipe()) {
            T firstItem = item.get(0);
            item.remove(0);
            return firstItem;
        }
        return null;
    }

    public boolean isInPipe() {
        return !item.isEmpty();
    }
}

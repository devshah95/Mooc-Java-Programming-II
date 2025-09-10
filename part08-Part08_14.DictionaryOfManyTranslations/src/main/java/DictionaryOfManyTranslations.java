import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> wordMap;

    public DictionaryOfManyTranslations() {
        this.wordMap = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.wordMap.putIfAbsent(word, new ArrayList<>());
        this.wordMap.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        return this.wordMap.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word) {
        this.wordMap.remove(word);
    }
}

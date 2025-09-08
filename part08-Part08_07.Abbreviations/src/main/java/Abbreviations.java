import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> abbreviationLibrary;

    public Abbreviations() {
        this.abbreviationLibrary = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviationLibrary.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (abbreviationLibrary.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation) {
        if (hasAbbreviation(abbreviation)) {
            return abbreviationLibrary.get(abbreviation);
        }
        return null;
    }
}

package dictionary;

import java.util.HashMap;
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Set;
import java.util.HashSet;

public class SaveableDictionary {
    private HashMap<String, String> translatorDictionary;
    private String fileName;

    public SaveableDictionary(String file) {
        translatorDictionary = new HashMap<>();
        this.fileName = file;
    }

    public void add(String words, String translation) {
        if (translatorDictionary.containsKey(words)) {
            return;
        }

        translatorDictionary.put(words, translation);
        translatorDictionary.put(translation, words);

    }

    public String translate(String word) {
        if (translatorDictionary.containsKey(word)) {
            return translatorDictionary.get(word);
        }
        return null;
    }

    public void delete(String word) {
        if (translatorDictionary.containsKey(word)) {
            String translation = translatorDictionary.get(word);
            translatorDictionary.remove(translation);
            translatorDictionary.remove(word);
        }
    }

    public boolean load() {
        try (Scanner fileReader = new Scanner(new File(this.fileName))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");

                if (parts.length == 2) {
                    this.add(parts[0], parts[1]);
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        try (PrintWriter writer = new PrintWriter(this.fileName)) {
            Set<String> savedWords = new HashSet<>();

            for (String word : this.translatorDictionary.keySet()) {
                if (!savedWords.contains(word)) {
                    String translation = this.translatorDictionary.get(word);
                    writer.println(word + ":" + translation);
                    savedWords.add(word);
                    savedWords.add(translation);
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

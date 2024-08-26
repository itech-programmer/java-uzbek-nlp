package uz.qubemelon.nlp;

import java.util.HashMap;
import java.util.Map;

public class POSTagging {
    private Map<String, String> posDictionary;

    public POSTagging() {
        // Пример словаря частей речи (для демонстрации)
        posDictionary = new HashMap<>();
        posDictionary.put("run", "verb");
        posDictionary.put("jump", "verb");
    }

    // Метод для определения части речи слова
    public String getPOS(String word) {
        return posDictionary.getOrDefault(word, "unknown");
    }
}
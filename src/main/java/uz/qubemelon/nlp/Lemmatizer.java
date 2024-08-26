package uz.qubemelon.nlp;

import java.util.HashMap;
import java.util.Map;

public class Lemmatizer {
    private Map<String, String> lemmaDictionary;

    public Lemmatizer() {
        // Пример словаря лемм (для демонстрации)
        lemmaDictionary = new HashMap<>();
        lemmaDictionary.put("running", "run");
        lemmaDictionary.put("jumps", "jump");
    }

    // Метод для лемматизации слова
    public String lemmatize(String word) {
        return lemmaDictionary.getOrDefault(word, word);
    }
}
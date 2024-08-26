package uz.qubemelon.nlp;

import java.util.ArrayList;
import java.util.List;

public class Tokenizer {
    // Метод для разделения текста на токены (слова)
    public List<String> tokenize(String text) {
        // Удаляем лишние пробелы и разбиваем строку по пробелам
        String[] tokens = text.trim().split("\\s+");
        List<String> tokenList = new ArrayList<>();
        for (String token : tokens) {
            tokenList.add(token);
        }
        return tokenList;
    }
}
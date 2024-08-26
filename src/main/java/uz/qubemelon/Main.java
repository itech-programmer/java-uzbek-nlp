package uz.qubemelon;

import uz.qubemelon.nlp.*;

public class Main {
    public static void main(String[] args) {
        Tokenizer tokenizer = new Tokenizer();
        Normalizer normalizer = new Normalizer();
        Lemmatizer lemmatizer = new Lemmatizer();
        POSTagging posTagging = new POSTagging();

        String text = "The quick brown fox is running";
        String normalizedText = normalizer.normalize(text);
        System.out.println("Normalized Text: " + normalizedText);

        var tokens = tokenizer.tokenize(normalizedText);
        System.out.println("Tokens: " + tokens);

        for (String token : tokens) {
            String lemma = lemmatizer.lemmatize(token);
            String pos = posTagging.getPOS(lemma);
            System.out.println("Token: " + token + ", Lemma: " + lemma + ", POS: " + pos);
        }
    }
}

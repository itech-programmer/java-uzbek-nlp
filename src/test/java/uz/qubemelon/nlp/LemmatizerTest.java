package uz.qubemelon.nlp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LemmatizerTest {
    @Test
    public void testLemmatizer() {
        Lemmatizer lemmatizer = new Lemmatizer();
        String lemma = lemmatizer.lemmatize("running");
        assertEquals("run", lemma);
    }
}
package uz.qubemelon.nlp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NormalizerTest {
    @Test
    public void testNormalizer() {
        Normalizer normalizer = new Normalizer();
        String normalizedText = normalizer.normalize("Hello World");
        assertEquals("hello world", normalizedText);
    }
}
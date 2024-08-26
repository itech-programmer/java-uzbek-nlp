package uz.qubemelon.nlp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

public class TokenizerTest {
    @Test
    public void testTokenizer() {
        Tokenizer tokenizer = new Tokenizer();
        List<String> tokens = tokenizer.tokenize("Hello World");
        assertEquals(List.of("Hello", "World"), tokens);
    }
}
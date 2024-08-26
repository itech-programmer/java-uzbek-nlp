package uz.qubemelon.nlp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class POSTaggingTest {
    @Test
    public void testPOS_Tagging() {
        POSTagging posTagging = new POSTagging();
        String pos = posTagging.getPOS("run");
        assertEquals("verb", pos);
    }
}
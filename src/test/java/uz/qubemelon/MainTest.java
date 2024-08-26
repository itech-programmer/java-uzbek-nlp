package uz.qubemelon;

import uz.qubemelon.nlp.Normalizer;
import uz.qubemelon.nlp.Tokenizer;
import uz.qubemelon.nlp.Lemmatizer;
import uz.qubemelon.nlp.POSTagging;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @Test
    public void testMainOutput() {
        // Перенаправляем вывод в ByteArrayOutputStream для проверки
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalSystemOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Выполняем основной метод
        Main.main(new String[]{});

        // Восстанавливаем оригинальный System.out
        System.setOut(originalSystemOut);

        // Получаем вывод и проверяем его содержание
        String output = outputStream.toString();
        assertTrue(output.contains("Normalized Text:"));
        assertTrue(output.contains("Tokens:"));
        assertTrue(output.contains("Token:"));
        assertTrue(output.contains("Lemma:"));
        assertTrue(output.contains("POS:"));
    }
}

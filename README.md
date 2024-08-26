# UzbekNLP

Проект для базовой обработки естественного языка на узбекском языке с использованием Java.

## Состав

1. **Tokenizer**: Разделяет текст на токены (слова).
2. **Normalizer**: Приводит текст к нижнему регистру.
3. **Lemmatizer**: Приводит слова к их базовым формам.
4. **POSTagging**: Определяет часть речи для слов.

## Структура проекта

- **`src/main/java/uz/qubemelon/nlp/`**: Содержит реализацию компонентов NLP.
  - `Tokenizer.java`: Класс для токенизации текста.
  - `Normalizer.java`: Класс для нормализации текста.
  - `Lemmatizer.java`: Класс для лемматизации слов.
  - `POSTagging.java`: Класс для определения частей речи.
- **`src/main/java/uz/qubemelon/`**: Содержит основной класс приложения.
  - `Main.java`: Основной класс для запуска и демонстрации работы NLP-компонентов.
- **`src/test/java/uz/qubemelon/nlp/`**: Содержит тесты для NLP-компонентов.
  - `TokenizerTest.java`: Тесты для класса `Tokenizer`.
  - `NormalizerTest.java`: Тесты для класса `Normalizer`.
  - `LemmatizerTest.java`: Тесты для класса `Lemmatizer`.
  - `POSTaggingTest.java`: Тесты для класса `POSTagging`.
  - `MainTest.java`: Тесты для класса `Main`.

## Сборка и запуск

1. Склонируйте репозиторий:

    ```bash
    git clone https://github.com/itech-programmer/java-uzbek-nlp.git
    ```

2. Откройте проект в IntelliJ IDEA или любой другой IDE, поддерживающей Gradle.
3. Убедитесь, что у вас установлен JDK 11 или выше.
4. Выполните команду для сборки проекта:

    ```bash
    ./gradlew build
    ```

5. Выполните команду для запуска проекта:

    ```bash
    ./gradlew run
    ```

## Тестирование

Для запуска тестов используйте JUnit. Все тесты находятся в пакете `uz.qubemelon.nlp`.

```bash
./gradlew test

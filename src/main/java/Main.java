import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1. Генератор словаря");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // final - исключаю Side-эффект
        final Map<String, String> vocabulary = Functions.getVocabulary();

        System.out.println("Введите текст на английском:");

        String ruText = "";
        try {
            // final - исключаю Side-эффект
            final String engText = reader.readLine();

            // Functions.translate зависит только от двух параметров: фраза и словарь
            ruText = Functions.translate(vocabulary, engText);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(ruText);


    }
}

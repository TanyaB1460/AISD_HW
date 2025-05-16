package hw2_1;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static HashMap<String, Integer> countWords(String text) {
        HashMap<String, Integer> wordCount = new HashMap<>();

        String[] words = text.toLowerCase().split("[\\s.,!?;:]+");

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        return wordCount;
    }

    public static void main(String[] args) {
        String text = "Яблоко яблока яблоку, нет в корзине яблока";

        HashMap<String, Integer> result = countWords(text);

        System.out.println("Слово\t\tКоличество");
        System.out.println("-----------------------");
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }
    }
}
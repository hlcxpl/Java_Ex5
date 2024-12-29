import java.util.HashMap;
import java.util.Map;

public class MainWordFrequency {
    public static void main(String[] args) {
        String text = "hello world hello java world";
        Map<String, Integer> wordFrequency = calculateWordFrequency(text);
        
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> calculateWordFrequency(String text) {
        String[] words = text.split("\\s+");
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        return frequencyMap;
    }
}
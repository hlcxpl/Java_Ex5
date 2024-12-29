import java.util.HashSet;

public class MainUniqueWords {
    public static void main(String[] args) {
        String text = "Este es un ejemplo de texto con algunas palabras repetidas. Este texto es solo un ejemplo.";
        HashSet<String> uniqueWords = new HashSet<>();

        String[] words = text.split("\\W+");
        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }

        System.out.println("Palabras únicas:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}
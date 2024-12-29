import java.util.HashMap;
import java.util.Map;

public class MainInvertMap {
    public static void main(String[] args) {
        HashMap<String, Integer> originalMap = new HashMap<>();
        originalMap.put("apple", 1);
        originalMap.put("banana", 2);
        originalMap.put("orange", 3);

        HashMap<Integer, String> invertedMap = invertMap(originalMap);

        System.out.println("Original Map: " + originalMap);
        System.out.println("Inverted Map: " + invertedMap);
    }

    public static <K, V> HashMap<V, K> invertMap(HashMap<K, V> map) {
        HashMap<V, K> invertedMap = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            invertedMap.put(entry.getValue(), entry.getKey());
        }
        return invertedMap;
    }
}
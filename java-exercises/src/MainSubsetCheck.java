import java.util.HashSet;

public class MainSubsetCheck {
    public static void main(String[] args) {
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);

        setB.add(2);
        setB.add(3);

        if (setA.containsAll(setB)) {
            System.out.println("Set B es un subconjunto del Conjunto A.");
        } else {
            System.out.println("Set B no es un subconjunto del Conjunto A.");
        }
    }
}
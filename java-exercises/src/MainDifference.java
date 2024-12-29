import java.util.HashSet;

public class MainDifference {
    public static void main(String[] args) {

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);

        setB.add(3);
        setB.add(4);
        setB.add(5);
        setB.add(6);

        HashSet<Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB);

        System.out.println("Difference: " + difference);
    }
}
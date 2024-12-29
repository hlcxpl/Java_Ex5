import java.util.HashSet;
import java.util.Set;

public class MainIntersection {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);

        setB.add(3);
        setB.add(4);
        setB.add(5);
        setB.add(6);

        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);

        System.out.println("Intersection of set A and set B: " + intersection);
    }
}
import java.util.ArrayList;
import java.util.List;

public class MainGenerateNeighbors {
    public static void main(String[] args) {
        int node = 5;
        List<Integer> neighbors = generateNeighbors(node);
        System.out.println("Vecinos del nodo " + node + ": " + neighbors);
    }

    public static List<Integer> generateNeighbors(int node) {
        List<Integer> neighbors = new ArrayList<>();
        neighbors.add(node - 1);
        neighbors.add(node + 1);
        return neighbors;
    }
}
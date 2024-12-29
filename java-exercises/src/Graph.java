import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Graph {
    private Map<Integer, Set<Integer>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    public void addEdge(int node1, int node2) {
        adjacencyList.computeIfAbsent(node1, k -> new HashSet<>()).add(node2);
        adjacencyList.computeIfAbsent(node2, k -> new HashSet<>()).add(node1);
    }

    public Set<Integer> getNeighbors(int node) {
        return adjacencyList.getOrDefault(node, new HashSet<>());
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);

        System.out.println("Neighbors of node 1: " + graph.getNeighbors(1));
        System.out.println("Neighbors of node 2: " + graph.getNeighbors(2));
        System.out.println("Neighbors of node 3: " + graph.getNeighbors(3));
        System.out.println("Neighbors of node 4: " + graph.getNeighbors(4));
    }
}
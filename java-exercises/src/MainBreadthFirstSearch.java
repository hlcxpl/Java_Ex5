

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class MainBreadthFirstSearch {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);

        breadthFirstSearch(graph, 1);
    }

    public static void breadthFirstSearch(Graph graph, int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (!visited.contains(node)) {
                visited.add(node);
                System.out.println("Visited node: " + node);
                for (int neighbor : graph.getNeighbors(node)) {
                    queue.add(neighbor);
                }
            }
        }
    }
}
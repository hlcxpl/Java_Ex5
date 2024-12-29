

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class MainDepthFirstSearch {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);

        depthFirstSearch(graph, 1);
    }

    public static void depthFirstSearch(Graph graph, int start) {
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visited.contains(node)) {
                visited.add(node);
                System.out.println("Visited node: " + node);
                for (int neighbor : graph.getNeighbors(node)) {
                    stack.push(neighbor);
                }
            }
        }
    }
}
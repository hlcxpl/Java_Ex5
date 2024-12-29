public class GraphUtils {

    // Method for Breadth-First Search (BFS) traversal
    public static void bfs(int start, boolean[][] adjacencyMatrix) {
        boolean[] visited = new boolean[adjacencyMatrix.length];
        java.util.Queue<Integer> queue = new java.util.LinkedList<>();
        
        visited[start] = true;
        queue.add(start);
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            
            for (int i = 0; i < adjacencyMatrix[node].length; i++) {
                if (adjacencyMatrix[node][i] && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    // Method for Depth-First Search (DFS) traversal
    public static void dfs(int node, boolean[][] adjacencyMatrix, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");
        
        for (int i = 0; i < adjacencyMatrix[node].length; i++) {
            if (adjacencyMatrix[node][i] && !visited[i]) {
                dfs(i, adjacencyMatrix, visited);
            }
        }
    }

    // Method to perform DFS and initiate the traversal
    public static void dfsTraversal(int start, boolean[][] adjacencyMatrix) {
        boolean[] visited = new boolean[adjacencyMatrix.length];
        dfs(start, adjacencyMatrix, visited);
    }

    // Method to represent a graph using an adjacency list
    public static java.util.List<java.util.List<Integer>> createAdjacencyList(int numberOfVertices, int[][] edges) {
        java.util.List<java.util.List<Integer>> adjacencyList = new java.util.ArrayList<>();
        
        for (int i = 0; i < numberOfVertices; i++) {
            adjacencyList.add(new java.util.ArrayList<>());
        }
        
        for (int[] edge : edges) {
            adjacencyList.get(edge[0]).add(edge[1]);
            adjacencyList.get(edge[1]).add(edge[0]); // For undirected graph
        }
        
        return adjacencyList;
    }
}
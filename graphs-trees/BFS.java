import java.util.*;

class Graph {
    int vertices;
    LinkedList<Integer> adjList[];

    Graph(int v) {
        vertices = v;
        adjList = new LinkedList[v];
        for (int i = 0; i <= v; i++) {
            adjList[i] = new LinkedList<Integer>();
        }
    }

    void addEdge(int src, int dest) {
        adjList[src].add(dest);
        adjList[dest].add(src);
    }

    void BFS(int start) {
        boolean visited[] = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (queue.size() > 0) {
            int node = queue.poll();
            System.out.println("Visited: " + node);

            for (int i = 0; i <= adjList[node].size(); i++) {
                int neighbor = adjList[node].get(i);
                if (visited[neighbor] = false) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String args[]) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);

        g.BFS(0);
    }
}

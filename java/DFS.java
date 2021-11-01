import java.util.LinkedList;

class DFS {
    private final LinkedList[] adjLists;
    private final boolean[] visited;

    // Graph creation
    DFS(int vertices) {
        adjLists = new LinkedList[vertices];
        visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++)
            adjLists[i] = new LinkedList<>();
    }

    // Add edges
    void addEdge(int src, int dest) {
        adjLists[src].add(dest);
    }

    // DFS algorithm
    void DFSAlgo(int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int adj : (Iterable<Integer>) adjLists[vertex]) {
            if (!visited[adj])
                DFSAlgo(adj);
        }
    }

    public static void main(String[] args) {
        DFS g = new DFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);

        System.out.println("Following is Depth First Traversal");

        g.DFSAlgo(2);
    }
}
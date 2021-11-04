import java.util.LinkedList;

class FordFulkerson {
    static final int V = 6;

    // Using BFS as a searching algorithm
    boolean bfs(int[][] Graph, int[] p) {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; ++i)
            visited[i] = false;

        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;
        p[0] = -1;

        while (queue.size() != 0) {
            int u = queue.poll();

            for (int v = 0; v < V; v++) {
                if (!visited[v] && Graph[u][v] > 0) {
                    queue.add(v);
                    p[v] = u;
                    visited[v] = true;
                }
            }
        }

        return (visited[5]);
    }

    // Applying fordfulkerson algorithm
    int fordFulkerson(int[][] graph) {
        int u, v;
        int[][] Graph = new int[V][V];

        for (u = 0; u < V; u++)
            for (v = 0; v < V; v++)
                Graph[u][v] = graph[u][v];

        int[] p = new int[V];

        int max_flow = 0;

        while (bfs(Graph, p)) {
            int path_flow = Integer.MAX_VALUE;
            for (v = 5; v != 0; v = p[v]) {
                u = p[v];
                path_flow = Math.min(path_flow, Graph[u][v]);
            }

            for (v = 5; v != 0; v = p[v]) {
                u = p[v];
                Graph[u][v] -= path_flow;
                Graph[v][u] += path_flow;
            }

            // Adding the path flows
            max_flow += path_flow;
        }

        return max_flow;
    }

    public static void main(String[] args) throws java.lang.Exception {
        int[][] graph = new int[][]{{0, 8, 0, 0, 3, 0}, {0, 0, 9, 0, 0, 0}, {0, 0, 0, 0, 7, 2},
                {0, 0, 0, 0, 0, 5}, {0, 0, 7, 4, 0, 0}, {0, 0, 0, 0, 0, 0}};
        FordFulkerson m = new FordFulkerson();

        System.out.println("Max Flow: " + m.fordFulkerson(graph));

    }
}

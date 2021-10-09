import java.util.LinkedList;
import java.util.Stack;

public class TopologicalSort {
    public static class Graph {
        private final int n;
        private final LinkedList<Integer>[] adj;

        @SuppressWarnings("unchecked")
        public Graph(int n) {
            this.n = n;
            adj = new LinkedList[n];
            for (int i = 0; i < n; i++)
                adj[i] = new LinkedList<>();
        }

        public void addEdge(int v, int w) {
            adj[v].add(w);
        }

        public void topologicalSort() {
            Stack<Integer> stack = new Stack<>();
            boolean[] visited = new boolean[n];
            for (int i = 0; i < n; i++)
                visited[i] = false;
            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    topologicalSortUtil(i, visited, stack);
                }
            }
            while (!stack.isEmpty())
                System.out.print(stack.pop() + " ");
        }

        public void topologicalSortUtil(int v, boolean[] visited, Stack<Integer> stack) {
            visited[v] = true;
            Integer i;
            for (Integer integer : adj[v]) {
                i = integer;
                if (!visited[i])
                    topologicalSortUtil(i, visited, stack);
            }
            stack.push(v);
        }

    }

    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        System.out.println("Following is a Topological " +
                "sort of the given graph");
        g.topologicalSort();
    }
}

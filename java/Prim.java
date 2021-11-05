import java.util.Arrays;

public class Prim {
    public void PrimAlgo(int[][] G, int V) {

        int INF = 9999999;

        int no_edge; // number of edge
        boolean[] selected = new boolean[V];

        // set selected false initially
        Arrays.fill(selected, false);

        no_edge = 0;

        // choose 0th vertex and make it true
        selected[0] = true;

        // print for edge and weight
        System.out.println("Edge : Weight");

        while (no_edge < V - 1) {

            int min = INF;
            int x = 0; // row number
            int y = 0; // col number

            for (int i = 0; i < V; i++) {
                if (selected[i]) {
                    for (int j = 0; j < V; j++) {
                        if (!selected[j] && G[i][j] != 0) {
                            if (min > G[i][j]) {
                                min = G[i][j];
                                x = i;
                                y = j;
                            }
                        }
                    }
                }
            }
            System.out.println(x + " - " + y + " :  " + G[x][y]);
            selected[y] = true;
            no_edge++;
        }
    }

    public static void main(String[] args) {
        Prim g = new Prim();

        int V = 5;

        int[][] G = {{0, 9, 75, 0, 0}, {9, 0, 95, 19, 42}, {75, 95, 0, 51, 66}, {0, 19, 51, 0, 31},
                {0, 42, 66, 31, 0}};

        g.PrimAlgo(G, V);
    }
}

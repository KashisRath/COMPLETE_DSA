package S23_GRAPH;
import java.util.*;

public class s17_kosaraju {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 4));
    }

    public static void topsort(ArrayList<Edge> graph[], int curr, boolean[] vis, Stack<Integer> s) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topsort(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }

    public static void Kosaraju(ArrayList<Edge> graph[], int v) {
        // Step 1
        boolean vis[] = new boolean[v];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                topsort(graph, i, vis, s);
            }
        }

        // Step 2
        ArrayList<Edge> transpose[] = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            transpose[i] = new ArrayList<>();
        }

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
        }

        // Step 3
        Arrays.fill(vis, false); // Resetting the vis array
        while (!s.isEmpty()) {
            int curr = s.pop();
            if (!vis[curr]) {
                System.out.print("scc->");
                dfs(transpose, curr, vis);
                System.out.println();
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
        // visit
        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        Kosaraju(graph, v);
    }
}

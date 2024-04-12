package S23_GRAPH;
import java.util.*;

public class s10_bellman {
    static class Edge {
        int src;
        int dest;
        int width;
        public Edge(int src, int dest,int width) {
            this.src = src;
            this.dest = dest;
            this.width=width;
        }
    }
    

    static void createGraph(ArrayList<Edge> graph) {
        graph.add(new Edge(0, 1,2));
        graph.add(new Edge(0, 2,4));
        graph.add(new Edge(1,2,-4));
        
        graph.add(new Edge(2,3,2));
        graph.add(new Edge(3,4,4));
        graph.add(new Edge(4,1,-1)); 
    }

    static void bellmanFord(ArrayList<Edge> graph , int src,int V)
    {
        int[] dis=new int[V];
        for(int i=0;i<dis.length;i++)
        {
            if(i!=src)
            {

                dis[i]=Integer.MAX_VALUE;
            }
        }
        for(int i=0;i<V-1;i++)
        {
            for (int j=0;j<graph.size();j++)
            {
                 Edge e=graph.get(j);

                 int u=e.src;
                 int v=e.dest;
                 int w=e.width;

                 if(dis[u]!=Integer.MAX_VALUE && dis[u]+w<dis[v])
                 {
                    dis[v]=dis[u]+w;
                 }

            }
        }

        //print statement
        for(int i=0;i<dis.length;i++)
        {
            System.out.print(dis[i]+" ");
        }

    }

    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge> graph=new ArrayList<>();
        createGraph(graph);
        bellmanFord(graph, 0, V);
    }

}

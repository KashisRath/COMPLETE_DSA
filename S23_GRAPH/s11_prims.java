package S23_GRAPH;
import java.util.*;

public class s11_prims {
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
    

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>(); // Initialize each ArrayList
        }
        graph[0].add(new Edge(0, 1,10));
        graph[0].add(new Edge(0, 2,15));
        graph[0].add(new Edge(1,3,30));
        
        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));

        graph[2].add(new Edge(2,0,15)); 
        graph[2].add(new Edge(2,3,50)); 

        graph[3].add(new Edge(3,1,40)); 
        graph[3].add(new Edge(3,2,50)); 
    }

    static class pair implements Comparable<pair>{
        int v;
        int cost;

        public pair(int v,int c)
        {
            this.v=v;
            this.cost=c;
        }

        public int compareTo(pair p2)
        {
            return this.cost-p2.cost;
        }
    }
     static void prims(ArrayList<Edge> graph[])
     {
         boolean vis[]=new boolean[graph.length];
         int finalcost=0;
         PriorityQueue<pair> pq=new PriorityQueue<>();
         pq.add(new pair(0, 0));
         while(!pq.isEmpty())
         {
            pair curr=pq.remove();
            if(!vis[curr.v])
            {
                vis[curr.v]=true;
                finalcost+=curr.cost;

                for(int i=0;i<graph[curr.v].size();i++)
                {
                     Edge e=graph[curr.v].get(i);
                     pq.add(new pair(e.dest,e.width));
                }
            }
         }
         System.out.println("the final cost is "+finalcost);
     }

    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);
        prims(graph);
    }


}

package S23_GRAPH;
import java.util.*;

public class s12_cheapest_flight_with_k_stops {
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

    static class Info{
        int v;
        int cost;
        int stops;

        public Info(int v,int cost,int stops)
        {
            this.v=v;
            this.cost=cost;
            this.stops=stops;
        }
    }

    static void createGraph(int flight[][],ArrayList<Edge> graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }

        for(int i=0;i<flight.length;i++)
        {
            int src=flight[i][0];
            int dest=flight[i][1];
            int wid=flight[i][2];

            Edge e=new Edge(src, dest, wid);
            graph[src].add(e);
        }
    }

    static int cheapestFlight(int n,int flight[][],int src,int dest,int k){
        ArrayList<Edge> graph[]=new ArrayList[n];
        createGraph(flight, graph);
        int dis[]=new int[n];
        
        for(int i=0;i<dis.length;i++)
        {
            if(i!=src)
            {
                dis[i]=Integer.MAX_VALUE;
            }
        }

        Queue<Info> q=new LinkedList<>();
        q.add(new Info(0, 0, 0));

        while(!q.isEmpty())
        {
            Info curr=q.remove();
            if(curr.stops>k)
            {
                break;
            }
            else{
                for(int i=0;i<graph[curr.v].size();i++)
                {
                       Edge e=graph[curr.v].get(i);
                       int u=e.src;
                       int v=e.dest;
                       int wt=e.width;

                       if(curr.cost+wt<dis[v] && curr.stops<=k)
                       {
                        dis[v]=curr.cost+wt;
                        q.add(new Info(v, dis[v], curr.stops+1));
                       }
                }
            }
        }

        if(dis[dest]==Integer.MAX_VALUE)
        {
            return -1;
        }
        else{
            return dis[dest];
        }
    }
    public static void main(String[] args) {
        int v=4;
        int flight[][]={{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src=0,k=1,dest=3;
        System.out.println(cheapestFlight(v, flight, src, dest, k));
    }
}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

     static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void createGraph(ArrayList<Edge>Graph[])
    {
        for (int i=0;i<Graph.length;i++)
        {
            Graph[i]=new ArrayList<Edge>();
        }
        Graph[0].add(new Edge(0, 1));        
        Graph[0].add(new Edge(0, 2));

        Graph[1].add(new Edge(1, 0));
        Graph[1].add(new Edge(1, 3));
        
        Graph[2].add(new Edge(2, 0));
        Graph[2].add(new Edge(2, 4));
        
        Graph[3].add(new Edge(3, 1));
        Graph[3].add(new Edge(3, 4));
        Graph[3].add(new Edge(3, 5));
        
        Graph[4].add(new Edge(4, 2));
        Graph[4].add(new Edge(4, 3));
        Graph[4].add(new Edge(4, 4));

        Graph[5].add(new Edge(5, 3));
        Graph[5].add(new Edge(5, 4));
        Graph[5].add(new Edge(5, 6));
        
        Graph[6].add(new Edge(6, 5));
    }

    public static void bfs(ArrayList<Edge> graph[],int V,boolean vis[],int start)
    {
        Queue<Integer> q=new LinkedList<>();
       
        q.add(start);
        while(!q.isEmpty())
        {
            int curr=q.remove();
            if (vis[curr]==false)
            {
                System.out.println(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++)
                {
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }

        }
    }

    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
        System.out.println(curr+" ");
        vis[curr]=true;
        for (int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(vis[e.dest]==false){
                dfs(graph,e.dest,vis);
            }
        }
    }
    public static void main(String arr[])
    {
        int V=7;
        ArrayList<Edge> Graph[]=new ArrayList[V];
        createGraph(Graph);
         boolean vis[]=new boolean[V];
         for (int i=0;i<V;i++)
         {
            if(vis[i]==false)
             dfs(Graph,i,vis);
 
            // bfs(Graph,V,vis,i);
         }
             System.out.println();
    }     
}

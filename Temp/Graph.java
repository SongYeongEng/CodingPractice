import java.util.*;

public class Graph {
    public static void bfs(int[][] graph, int start) {
        //Create a queue
        Queue<Integer> q = new LinkedList();
        //Create a boolean to check visited or not for whole graph length
        boolean visited [] = new boolean [graph.length];
        //initialize ture for the first one, start is the first int.
        visited [start] = true;
        //start adding first element for first one
        q.add(start);
        //while queue is not empty check for rooot using function
        while(!q.isEmpty()){
            //initialize a node current one, use poll to retireve and remove.
            int node = q.poll();
            //print node
            System.out.println(node);
            //Loop whle graph length
                for(int i =0; i < graph.length; i++){
                //graph node =1 check for exist or not
                //if exist and not visited set true and queue
                    if (graph[node][i] == 1 && !visited[i]){
                        //remember to add i
                        visited[i] = true;
                        q.add(i);
                    }

                }
        }
    }
            
    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 1, 0, 0},
            {1, 0, 0, 1, 1},
            {1, 0, 0, 0, 1},
            {0, 1, 0, 0, 0},
            {0, 1, 1, 0, 0}
        };
        
        System.out.println("BFS Traversal starting from node 0:");
        bfs(graph, 0);
    }
}

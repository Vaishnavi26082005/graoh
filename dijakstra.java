

//User function Template for Java

class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    
    
    
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        pq.add(new Pair(S, 0));
        dist[S] = 0 ;
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int curr_node = curr.node ;
            int curr_dist = curr.distance ;
            ArrayList<ArrayList<Integer>> nbrs_List = adj.get(curr_node);
            for(ArrayList<Integer> nbr  : nbrs_List){
                int v = nbr.get(0);
                int wt = nbr.get(1);
                if(dist[v] > curr_dist + wt){
                    dist[v] = curr_dist + wt ;
                    pq.add(new Pair(v, dist[v])) ;
                }
            }
        }
        return dist;
    }
}

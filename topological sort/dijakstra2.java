class Solution {
    // Function to find the shortest distance of all the vertices
    // from the source vertex src.
    ArrayList<Integer> dijkstra(ArrayList<ArrayList<iPair>> adj, int src) {
        
        //[node,distance]
        PriorityQueue<iPair>pq=new PriorityQueue<>(new Comparator<iPair>(){
            public int compare(iPair p1,iPair p2){
                return p1.second-p2.second;
            }
        });
        int dist[]= new int [adj.size()];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        pq.offer(new iPair(src,0));
        while(!pq.isEmpty()){
            iPair p= pq.poll();
            int u=p.first;
            int d=p.second;
            if(d>dist[u])continue;
            for(iPair nbr:adj.get(u)){
                int v=nbr.first;
                int w=nbr.second;
                if(dist[u]+w<dist[v]){
                    dist[v]=dist[u]+w;
                    pq.add(new iPair(v,dist[v]));
                }
            }
            
        }
        ArrayList<Integer>res= new ArrayList<>();
        for(int i=0;i<dist.length;i++){
            res.add(dist[i]);
        }
        return res;
        
        
        // Write your code here
    }
}

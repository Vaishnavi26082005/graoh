

/*Complete the function below*/


class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] inDegree = new int[V];
        
       
        for (int i = 0; i < V; i++) {
            for (int nbr : adj.get(i)) {
                inDegree[nbr]++;
            }
        }
        
       
        Queue<Integer> qq = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) {
               qq.add(i);
            }
        }
        
        int[] topo = new int[V];
        int index = 0;
        
        while (!qq.isEmpty()) {
            int currentNode =qq.poll();
            topo[index++] = currentNode;
            
         
            for (int nbr : adj.get(currentNode)) {
                inDegree[nbr]--;
                if (inDegree[nbr] == 0) {
                  qq.add(nbr);
                }
            }
        }
        
        return topo;
    }
}

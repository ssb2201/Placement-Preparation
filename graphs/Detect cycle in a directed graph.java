class DetectCycle
{
    static boolean isCyclic(ArrayList<ArrayList<Integer>> adj, int V)
    {
        // add your code here
        boolean[] visited = new boolean[V];
        
        boolean[] recSt = new boolean[V];
        
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false && dfsRec(adj,i,visited,recSt))
            {
                return true;
            }
        }
        return false;
    }
    
     static boolean dfsRec(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visited,boolean[] recSt)
     {
         visited[s] = true;
         recSt[s] =true;
         
        for(int u: adj.get(s))
        {
            if(visited[u]==false && dfsRec(adj,u,visited,recSt))
            {
                return true;
            }
            else if(recSt[u]==true)
            {
                return true;
            }
        }
        recSt[s] = false;
        return false;
     }
    
}
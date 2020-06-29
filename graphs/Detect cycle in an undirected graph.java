class DetectCycle
{
    static boolean isCyclic(ArrayList<ArrayList<Integer>> g, int V)
    {
       // add your code here
        boolean[] visited = new boolean[V];
        
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                if(DFSRec(g,i,visited,-1))
                {
                    return true;
                }
            }
        }
        return false;
       
    }
    
    static boolean DFSRec(ArrayList<ArrayList<Integer>> g,int s,boolean[] visited,int parent)
    {
        visited[s]=true;
        
        for(int u: g.get(s))
        {
            if(visited[u]==false)
            {
                if(DFSRec(g,u,visited,s))
                {
                    return true;
                }
                
            }
            else if(u!=parent)
                {
                    return true;
                }
        }
        return false;
    }
}
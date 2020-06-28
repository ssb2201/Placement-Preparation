class Traversal
{
    static ArrayList<Integer> ans; 
    static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> g, int N)
    {
       // add your code here
        boolean[] visited = new boolean[N];
        ans= new ArrayList<>();
        for(int i=0;i<N;i++)
        {
            if(visited[i]==false)
            {
                dfsrec(g,i,visited);
            }
        }
        
        return ans;
    }
    
    
    static void dfsrec(ArrayList<ArrayList<Integer>> g,int s,boolean[] visited)
    {
        visited[s]=true;
        ans.add(s);
        for(int u: g.get(s))
        {
            if(visited[u]==false)
            {
                dfsrec(g,u,visited);
            }
        }
        
    }
    
    
}


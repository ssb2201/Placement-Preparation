lass TopologicalSort {
    static int[] topoSort(ArrayList<ArrayList<Integer>> adj, int N) {
        // add your code here
        int[] in =new int[N];
        for(int i=0;i<N;i++)
        {
        ArrayList<Integer> temp = adj.get(i);
        
        for(int j :temp)
        {
            in[j]++;
        }
        }
        Queue<Integer> q = new LinkedList<Integer>();
        
        for(int i=0;i<N;i++)
        {
            if(in[i]==0)
            {
                q.add(i);
            }
        }
        
        Vector<Integer> v = new Vector<Integer>();
        while(!q.isEmpty())
        {
            int u = q.poll();
            v.add(u);
            
            for(int c : adj.get(u))
            {
                if(--in[c]==0)
                {
                    q.add(c);
                }
            }
        }
       int[] ans = new int[N];
        for(int i =0;i<v.size();i++)
        {
            ans[i] = v.get(i);
        }
        
        return ans;
    }
}

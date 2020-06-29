class Traversal {
    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> g, int N) {
        // add your code here
        boolean[] visited = new boolean[N];
        Queue<Integer> q = new LinkedList<Integer>();
        ArrayList<Integer> a = new ArrayList<>();
        visited[0] = true;
        q.add(0);
        while(!q.isEmpty())
        {
            int u = q.poll();
            a.add(u);
            for(int v:g.get(u))
            {
                if(visited[v]==false)
                {
                    visited[v]=true;
                    q.add(v);
                }
            }
        }
        return a;
        }
        
}

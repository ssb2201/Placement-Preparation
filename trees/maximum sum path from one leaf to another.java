class GfG {

    static int res;
    public static int maxPathSum(Node root) {
        // your code here
        res = Integer.MIN_VALUE;
        int a =solve(root);
        return res;
        
    }
    
    public static int solve(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.left ==null && root.right==null)
        {
            return root.data;
        }
        int x = solve(root.left);
        int y = solve(root.right);
        
        if(root.left!=null && root.right!=null)
        {
            res = Math.max(res,x+y+root.data);
            
            return Math.max(x,y) +root.data;
        }
        
        return (root.left==null)?y+root.data:x+root.data;
    }
    
}
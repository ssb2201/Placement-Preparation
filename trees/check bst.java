
public class Tree
{
    // return true if the given tree is a BST, else return false
    int min =Integer.MIN_VALUE;
    int max =Integer.MAX_VALUE;
    boolean isBST(Node root)
        {
            // code here.
            boolean f = isBst(root,min,max);
            return f;
            
        }
        
    boolean isBst(Node root,int min,int max)
    {
        if(root==null)
        {
            return true;
        }
        if(root.data>=max || root.data<=min)
        {
            return false;
        }
        
        if(!isBst(root.left,min,root.data))
        {
            return false;
        }
         if(!isBst(root.right,root.data,max))
        {
            return false;
        }
        
        return true;
        
    }
        
        
    
}
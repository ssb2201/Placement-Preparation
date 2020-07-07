/*
Given a Binary Tree, Print the corner nodes at each level. The node at the leftmost and the node at the rightmost of each level.

Input:

The first line of input contains the number of test cases T. For each test case, there will be only a single line of input which is a string representing the tree as described below: 

The values in the string are in the order of level order traversal of the tree where, numbers denote node values, and a character “N” denotes NULL child.

For example:

For the above tree, the string will be: 1 2 3 N N 4 6 N 5 N N 7 N

Output:
Print the corner nodes ( nodes at the leftmost and nodes at the rightmost) at each level.

Your Task:
This is a function problem. You don't have to take input. Just complete the function printCorner() that takes a node as parameter and prints the corner. The new line is automatically appended by the driver code.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Number of nodes at any level).

Constraints:
1<=T<=30
1<=data of each node<=105
1<=n<=105

Example:
Input:
2
1 3 2
10 20 30 40 60

Output:
1 3 2
10 20 30 40 60
*/

class Tree
{
    public static void printCorner(Node node)
    {
        Queue<Node> q  = new LinkedList<>();
        q.add(node);
        
        while(!q.isEmpty())
        {
            int n = q.size();
            
            for(int i=0;i<n;i++)
            {
                Node temp = q.peek();
                q.poll();
                
                if(i==0 || i==n-1)
                {
                    System.out.print(temp.data+" ");
                }
                
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
                
            }
        }
    }
    
}
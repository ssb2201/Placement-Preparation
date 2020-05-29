/*

Full binary tree
Given a Binary tree of size N, your task is to check whether the Binary tree is a full binary tree or not.

Input:
First line of input contains the number of test cases T. For each test case, there will be only a single line of input which is a string representing the tree as described below: 

The values in the string are in the order of level order traversal of the tree where, numbers denote node values, and a character “N” denotes NULL child.

For example:

For the above tree, the string will be: 1 2 3 N N 4 6 N 5 N N 7 N

Output:
Single line output, return true if it is a full binary tree else false.

Your Task:
You don't have to take input. Complete the function isFullTree() which accepts root node of the tree as parameter and returns the bool value. The printing is done by the driver code.

Constraints:
1<=T<=1000
1<=N<=1000

Example:
Input:
2
1 2 3 4 5
1 2 3 4 N
Output:
1
0

Explanation:
TestCase 1: 
                 1
             /        \
           2           3
        /       \
     4           5
Every node except leaf node has two children so it is a full tree.

TestCase 2:
                 1
              /       \
            2           3
          /
        4
Node 2 has only one child so this is not a full tree.
*/
class GfG
{
	boolean isFullTree(Node node)
    {
        //add code here.
        if(node==null)
        {
            return true;
        }
        if(node.left==null && node.right==null)
        {
            return true;
        }
        
        if(node.left!=null && node.right!=null)
        {
            return (isFullTree(node.left) && isFullTree(node.right));
        }
        
        return false;
    }
}
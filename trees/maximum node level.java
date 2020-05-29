/*
Maximum Node Level
Given a Binary tree. Find the level in binary tree which has the maximum number of nodes.

Input:
First line of input contains the number of test cases T. For each test case, there will be only a single line of input which is a string representing the tree as described below: 

The values in the string are in the order of level order traversal of the tree where, numbers denotes node values, and a character “N” denotes NULL child.

For example:

For the above tree, the string will be: 1 2 3 N N 4 6 N 5 N N 7 N

Output:
Print the level number with maximum nodes.
Your Task:
You don't need to read input or print anything. Your task is to complete the function maxNodeLevel() that takes root node of the tree as input and returns an integer which is level of the tree with maximum nodes. The root is at level 0. If two or more levels have same number of maximum nodes , then print smallest level.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1<=T<=50
1<=N<=105
Example:
Input:
2
2 1 3 4 6 N 8 N N 5
1 2 
Output:
2
0

Explanation:
Test Case 1: The given Binary Tree is:
      2
    /    \ 
  1      3
 /   \      \
4    6     8
     / 
    5
The level 2 with nodes 4, 6 and 8 is the level with maximum number of nodes. 
*/

class Tree
{
    // Return the level (0-indexed) with maximum number of nodes.
    public static int maxNodeLevel(Node root)
    {
        // add your code here
        if(root == null )
        {
            return -1;
        }
         Queue<Node> q = new LinkedList<Node>();
         
         q.add(root);
         
         int level=0;
         int max = Integer.MIN_VALUE;
         int level_no=0;
         
         while(true)
         {
             int nodecount = q.size();
             if(nodecount==0)
             {
                 break;
             }
             
             if(nodecount>max)
             {
                 max=nodecount;
                 level_no=level;
             }
             
             while(nodecount>0)
             {
                 Node node = q.peek();
                 q.remove();
                 if(node.left!=null)
                 {
                    q.add(node.left);   
                 }
                  if(node.right!=null)
                 {
                    q.add(node.right);   
                 }
                 nodecount--;
             }
             
             
             level++;
         }
         
         return level_no;
        
    }
}
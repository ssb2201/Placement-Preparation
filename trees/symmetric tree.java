/*
Symmetric Tree
Given a Binary Tree. Check whether it is Symmetric or not, i.e. whether the binary tree is a Mirror image of itself or not.

Input:
First line of input contains the number of test cases T. For each test case, there will be only a single line of input which is a string representing the tree as described below: 

The values in the string are in the order of level order traversal of the tree where, numbers denote node values, and a character “N” denotes NULL child.

For example:

For the above tree, the string will be: 1 2 3 N N 4 6 N 5 N N 7 N

Output:
For each test case the function should return a boolean value.

Your Task:
You don't need to read input or print anything. Your task is to complete the function isMirror() which takes the root of the Binary Tree as its input and returns True if the given Binary Tree is a same as the Mirror image of itself. Else, it returns False.

For example:
The following binary tree is symmetric:

        1
      /   \
    2       2
  /   \   /   \
 3     4 4     3
But the following is not:

       1
     /   \
    2      2
     \      \
      3      3
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the Tree).

Constraints:
1<=T<=100
1<=N<=100

Example:
Input:
3
5 1 1 2 N N 2
5 10 20 20 20 N 30
100 10 10 20 20 20 20
Output:
True
False
True
Explanation:
TestCase 1:

             5
           /   \
          1     1
         /       \
        2         2
Tree is mirror image of itself i.e. tree is symmetric

TestCase 2:

             5
          /    \
        10      20
      /    \      \
    20     20      30 
Tree is not mirror image of itself i.e. tree is not symmetric

TestCase 3:

              100
            /     \
          10       10
         /   \    /   \
       20     20 20    20
Tree is mirror image of itself i.e. tree is symmetric

Note:The Input/Ouput format and Example given are used for system's internal purpose, and should be used by a user for Expected Output only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.

*/

class GfG
{
    
    public static boolean isMirror(Node node1,Node node2)
    {
        if(node1 ==null && node2==null)
        {
            return true;
        }
        
        if(node1 != null && node2!=null && node1.data==node2.data)
        {
            return (isMirror(node1.left,node2.right)
                && isMirror(node1.right,node2.left));
        }
        
        return false;
    }
    
    
    public static boolean isSymmetric(Node root)
    {
        // add your code here;
        return isMirror(root,root);
        
    }  
}
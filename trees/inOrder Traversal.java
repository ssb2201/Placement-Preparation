/*
Inorder Traversal
Given a binary tree, the task is to print the nodes in inorder traversal of it. Inorder traversal of below tree is 5 10 1 39

        1
     /      \
   10      39
  /
5

Input:
First line of input contains the number of test cases T. For each test case, there will be only a single line of input which is a string representing the tree as described below: 

The values in the string are in the order of level order traversal of the tree where, numbers denotes node values, and a character “N” denotes NULL child.

For example:
 
For the above tree, the string will be: 1 2 3 N N 4 6 N 5 N N 7 N

Output:
For each test case, in a new line, print the inorder traversal.

Your Task:
This is a function problem. You just need to complete the function inorder() that takes node as parameter and prints the answer. The newline is automatically appended by the driver code.

Constraints:
1 <= T <= 30
1 <= Number of nodes <= 105
1 <= Data of a node <= 105

Example:
Input:
2
1 3 2
10 20 30 40 60 50
Output:
3 1 2
40 20 60 10 50 30

Explanation:
Testcase1: The tree is
        1
     /      \
   3       2
So, the in order would be 3 1 2
Testcase2: The tree is
                           10
                        /        \
                     20         30
                  /       \        /
               40       60    50
So, the inorder would be 40 20 60 10 50 30
*/


class Tree
{
 
    void inOrder(Node root)
    {
        // Code
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    
    
}
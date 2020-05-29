/*
Given a Binary Tree and a sum s, your task is to check whether there is a root to leaf path in that tree with the following sum . You are required to complete the function hasPathSum. You should not read any input from stdin/console. There are multiple test cases. For each test case, this method will be called individually.

Input:
First line of input contains the number of test cases T. For each test case, there will be two lines of input first of which is a string representing the tree as described below: 

The values in the string are in the order of level order traversal of the tree where, numbers denotes node values, and a character “N” denotes NULL child.

For example:



For the above tree, the string will be: 1 2 3 N N 4 6 N 5 N N 7 N
Second line contains an integer s.
There are multiple test cases. For each test case, this method will be called individually.

Output:
The function should return the true if such path exist else return false.

Your Task:
You don't need to take input. Just complete the function hasPathSum() which accepts root node of the tree and target sum as a parameter and return a boolean value according to if we can get the sum or not.
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the Tree).

Constraints:
1 <=T<= 100
1 <=Number of nodes<= 10000
1 <=Data of a node<= 1000
1 <= Sum <= 106

Example:

Input
2
1 2 3
2
1 2 3
4

Output 
0
1

In above example there are two test case where each represents a tree with 3 nodes and 2 edges where root is 1, left child of 1 is 2 and right child of 1 is 3.  
*/

class Tree {
    /*you are required to complete this function */
    boolean hasPathSum(Node node, int sum) {
        // Your code here
        if(node==null)
        {
            return sum==0;
        }
        return hasPathSum(node.left, sum-node.data) ||
                hasPathSum(node.right,sum-node.data);
        
    }
}
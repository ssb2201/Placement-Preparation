/*
Given a binary tree in which each node element contains a number. Find the maximum possible sum from one leaf node to another.

Input Format:
The first line of input contains the number of test cases T. For each test case, there will be only a single line of input which is a string representing the tree as described below: 

The values in the string are in the order of level order traversal of the tree where, numbers denote node values, and a character “N” denotes NULL child.

For example:



For the above tree, the string will be: 1 2 3 N N 4 6 N 5 N N 7 N
There are multiple test cases. For each test case, the function will be called individually.

Output Format:
For each testcase, in a new line, print the maximum possible sum.

Your Task:
This is a function problem. You only need to complete the function maxPathSum that returns the maximum sum from one leaf to another.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(H).
Note: H is the height of the tree and this space is used implicitly for recursion stack.

Constraints:
1 <=T <= 100
3 <= N <= 104
-1000 <= Data on Node <= 1000

Example:
Input:

2
3 4 5 -10 4
-15 5 6 -8 1 3 9 2 -3 N N N N N 0 N N N N 4 -1 N N 10 N

Output:

16
27

 

Explanation:
Testcase 2: The maximum possible sum from one leaf node to another is (3 + 6 + 9 + 0 + -1 + 10 = 27)
*/

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
        int x = solve(root.left);
        int y = solve(root.right);
        
        int temp = Math.max(Math.max(x,y)+root.data,root.data);
        int ans = Math.max(temp,x+y+root.data);
        
        res = Math.max(res,ans);
        return temp;
    }
    
}

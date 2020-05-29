/*
Reverse Level Order Traversal
Given a Binary Tree of size N. You have to print the Reverse Level Order Traversal of the given tree , that is first you have to print nodes of last level of the tree , then nodes of second last and so on. 
For Example: The Reverse Level Order Traversal of the following Tree is 4 5 2 3 1 .                                 
                                           
Input:
First line of input contains the number of test cases T. For each test case, there will be only a single line of input which is a string representing the tree as described below: 

The values in the string are in the order of level order traversal of the tree where, numbers denotes node values, and a character “N” denotes NULL child.

For example:

For the above tree, the string will be: 1 2 3 N N 4 6 N 5 N N 7 N

Output:
For each testcase , print the reverse level order traversal of tree separated by space.

User task:
You don't need to take input. Just complete the function reversePrint() that accepts root node of the tree as parameter and prints the reverse level order traversal of tree .
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= T <= 100
1 <= N <= 104

Example:
Input:
2
1 3 2
10 20 30 40 60

Output:
3 2 1
40 60 20 30 10

Explanation:
Testcase 1: There are total 3 nodes of tree.

Reverse level order traversal of tree is: 3 2 1.
*/
class Tree
{
	public void reversePrint(Node node) 
        {
            // your code here
            
            Queue<Node> queue = new LinkedList();
            Stack<Node> stack = new Stack();
            queue.add(node);
            while(!queue.isEmpty())
            {
                Node rv = queue.peek();
                queue.remove();
                stack.push(rv);
                
                 if(rv.right!=null)
                {
                    queue.add(rv.right);
                }
                if(rv.left!=null)
                {
                    queue.add(rv.left);
                }
               
                
            }
            
            while(!stack.isEmpty())
            {
                Node a = stack.pop();
                System.out.print(a.data+" ");
            }
        }
}      
       

/*
Find length of Loop
Given a linked list of size N. The task is to complete the function countNodesinLoop() that checks whether a given Linked List contains a loop or not and if the loop is present then return the count of nodes in a loop or else return 0.



Input:
The first line of input contains the number of testcases T. For each test case, the first line of input contains the length of a linked list and next line contains data of the linked list, and the third line contains the position of the node from the beginning (0 based indexing) to which the last node will be connected to form a loop.
Note: If the input of the third line is zero then there is no loop.

Output:
For each test case, there will be a single line of output containing the length of the loop in a linked list, else print 0, if the loop is not present in the linked list.

User Task:
The task is to complete the function countNodesinLoop() which contains the only argument as reference to head of linked list.

Challenge : Try to solve the problem with constant Auxilliary space and Linear Time Complexity.

Constraints:
1 <= T <= 100
1 <= N <= 500
0 <= C <= N-1

Example:
Input:
2
10
25 14 19 33 10 21 39 90 58 45
4
2
1 0
1
Output:
6
1

Explanation:
Testcase 1: The loop is 45->10. So length of loop is 10->21->39->90->58->45 = 6. The number 10 is connected to the last node to form the loop because according to the input the 4th node from the beginning(0 based index) will be connected to the last node for the loop.
Testcase2:  The length of the loop is 1.
*/


class Loop
{
   
    int countnode(Node n)
    {
        int res=1;
        Node temp=n;
        while(temp.next!=n)
        {
            res++;
            temp=temp.next;
        }
        return res;
        
    }
    int countNodesinLoop(Node head)
    {
	    //Add your code here.
	    Node slow = head ,fast=head;
	    
	    while(slow!=null && fast!=null && fast.next!=null)
	    {
	        slow = slow.next;
	        fast = fast.next.next;
	        
	        if(slow==fast)
	        {
	            return countnode(slow);
	        }
	    }
	    
	    return 0;
	    
    }
}
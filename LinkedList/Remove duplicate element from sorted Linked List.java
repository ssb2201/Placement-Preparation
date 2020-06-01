/*
Remove duplicate element from sorted Linked List
Given a singly linked list consisting of N nodes. The task is to remove duplicates (nodes with duplicate values) from the given list (if exists).
Note: Try not to use extra space. Expected time complexity is O(N). The nodes are arranged in a sorted way.

Input:
First line of input contains number of testcases T. For each testcase, first line of input contains length of linked list and next line contains the linked list data.

Output:
For each testcase, there will be a single line of output which contains linked list with no duplicates.

User Task:
The task is to complete the function removeDuplicates() which should remove the duplicates from linked list. The printing is done automatically by the driver code.

Constraints:
1 <= T <= 100
1 <= N <= 104

Example:
Input:
2
4
2 2 4 5
5
2 2 2 2 2
Output:
2 4 5
2

Explanation:
Testcase 1: In the given linked list 2 ->2 -> 4-> 5, only 2 occurs more than 1 time.
Testcase 2: In the given linked list 2 ->2 ->2 ->2 ->2, 2 is the only element and is repeated 5 times.
 
*/

class GfG
{
    // head: head node
    Node removeDuplicates(Node head)
    {
	// Your code here	
	   Node tofree;
	   
	   if(head == null)
	   {
	       return null;
	   }
	   
	   if(head.next !=null)
	   {
	       if(head.data == head.next.data)
	       {
	           tofree = head.next;
	           head.next = head.next.next;
	           removeDuplicates(head);
	       }
	       else
	       {
	            removeDuplicates(head.next);
	       }
	   }
	   
	   return head;
	    
    }
}

/*
Reverse a linked list
Given a linked list of N nodes. The task is to reverse this list.

Input: Head of following linked list
1->2->3->4->NULL
Output: Linked list should be changed to,
4->3->2->1->NULL

Input: Head of following linked list
1->2->3->4->5->NULL
Output: Linked list should be changed to,
5->4->3->2->1->NULL

Input: NULL
Output: NULL

Input: 1->NULL
Output: 1->NULL

Input:
First line of input contains number of testcases T. For each testcase, first line contains length of linked list and next line contains the elements of linked list.

Output:
Reverse the linked list and return head of the modified list.

User Task:
The task is to complete the function reverseList() which head reference as the only argument and should return new head after reversing the list.

Constraints:
1 <= T <= 100
1 <= N <= 104

Example:
Input:
2
6
1 2 3 4 5 6
5
2 7 8 9 10
Output:
6 5 4 3 2 1
10 9 8 7 2

Explanation:
Testcase 1: After reversing the list, elements are as 6->5->4->3->2->1.
Testcase 2: After reversing the list, elements are as 10->9->8->7->2.
*/

class ReverseLL
{
    // This function should reverse linked list and return
   // head of the modified linked list.
   Node reverseList(Node head)
   {
        // add code here
        
        Node prev = null;
        Node cur = head;
        
        while(cur!=null)
        {
            Node ahead =  cur.next;
            cur.next =prev;
            prev = cur;
            cur = ahead;
        }
        head = prev;
        return head;
   }
}
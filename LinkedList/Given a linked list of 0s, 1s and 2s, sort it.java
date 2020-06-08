/*
Given a linked list of 0s, 1s and 2s, sort it. 
Given a linked list of N nodes where nodes can contain values 0s, 1s, and 2s only. The task is to segregate 0s, 1s, and 2s linked list such that all zeros segregate to head side, 2s at the end of the linked list, and 1s in the mid of 0s and 2s.

Input:
The first line of input contains the number of test cases T. For each test case, the first line of input contains the length of the linked list and next line contains N elements as the data in the linked list.

Output:
For each test case, segregate the 0s, 1s, and 2s and display the linked list.

Your Task:
The task is to complete the function segregate() which segregates the nodes in the linked list as asked in the problem statement and returns the head of the modified linked list. The printing is done automatically by the driver code.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= T <= 100
1 <= N <= 103

Example:
Input:
2
8
1 2 2 1 2 0 2 2
4
2 2 0 1
Output:
0 1 1 2 2 2 2 2
0 1 2 2

Explanation:
Testcase 1: All the 0s are segregated to the left end of the linked list, 2s to the right end of the list, and 1s in between.
Testcase 2: After arranging all the 0s,1s and 2s in the given format, the output will be 0 1 2 2.

*/

class LinkedList
{
    static Node segregate(Node head)
    {
        // add your code here
        int count[]= {0,0,0};
        Node temp = head;
        
        while( temp!=null)
        {
            count[temp.data]++;
            temp=temp.next;
        }
        
        int i=0;
        temp = head;
        
        while(temp!=null)
        {
            if(count[i]==0)
            {
                i++;
            }
            else
            {
                temp.data =i;
                count[i]--;
                temp=temp.next;
            }
        }
        
        return head;
    }
}



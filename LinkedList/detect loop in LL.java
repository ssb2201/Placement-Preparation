/*
Detect Loop in linked list
Given a linked list of N nodes. The task is to check if the the linked list has a loop. Linked list can contain self loop.

Input:
First line of input contains number of testcases T. For each testcase, first line of input contains length of linked list and next line contains the data of linked list.

Output:
For each testcase, print "True", if linked list contains loop, else print "False".

User Task:
The task is to complete the function detectloop() which contains reference to the head as only argument. This function should return 1 if linked list contains loop, else return 0.

Challenge : Try to solve the problem with constant space and Linear time complexity.

Constraints:
1 <= T <= 100
1 <= N <= 104
1 <= Data on Node <= 103

Example:
Input:
2
3
1 3 4
2
4
1 8 3 4
0
Output:
True
False

Explaination:
Testcase 1: In above test case N = 3. The linked list with nodes N = 3 is given. Then value of x=2 is given which means last node is connected with xth node of linked list. Therefore, there exists a loop. 
Testcase 2: For N = 4 ,x = 0 means then lastNode->next = NULL, then the Linked list does not contains any loop.

*/
//solution 1
class Solution {
    public int detectLoop(Node head) {
        // Add code here
        
        HashSet<Node> s = new HashSet<>();
        while(head!=null)
        {
            if(s.contains(head))
            {
                return 1;
            }
            s.add(head);
            
            head= head.next;
        }
    
        return 0;
    }
}


//solution2 (Floyd's cycle finding solution)

 int detectLoop() 
    { 
        Node slow_p = head, fast_p = head; 
        while (slow_p != null && fast_p != null && fast_p.next != null) { 
            slow_p = slow_p.next; 
            fast_p = fast_p.next.next; 
            if (slow_p == fast_p) { 
                System.out.println("Found loop"); 
                return 1; 
            } 
        } 
        return 0; 
    } 

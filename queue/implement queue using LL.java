/*
Implement Queue using Linked List 
Implement a Queue using Linked List.

Input:
The first line of the input contains an integer 'T' denoting the number of test cases. Then T test cases follow.
The first line of each test case contains an integer Q denoting the number of queries. 
A Query Q is of 2 Types
(i) 1 x   (a query of this type means  pushing 'x' into the queue)
(ii) 2     (a query of this type means to pop an element from the queue and print the poped element)
The second line of each test case contains Q queries separated by space.

Output:
The output for each test case will be space-separated integers having -1 if the queue is empty else the element popped out from the queue. You are required to complete the two methods push which takes one argument an integer 'x' to be pushed into the queue and pop which returns an integer popped out from the queue.

Your Task:
Since this is a function problem, you don't need to take inputs. Just complete the provided functions. The printing is done automatically by the driver code.

Expected Time Complexity: O(1).
Expected Auxiliary Space: O(1).

Constraints:
1 <= T <= 100
1 <= Q <= 100
1 <= x <= 100

Example:
Input:
2
5
1 2 1 3 2 1 4 2
4
1 2 2 2 1 3  
Output:
2 3
2 -1

Explanation:
Testcase1: In the first testcase
1 2    the queue will be {2}
1 3    the queue will be {2 3}
2       poped element will be 2 the queue will be {3}
1 4    the queue will be {3 4}
2       poped element will be 3.
Testcase 2: In the second testcase 
1 2   the queue will be {2}
2      poped element will be {2} then the queue will be empty. 
2      the queue is empty and hence -1
1 3   the queue will be {3}.
*/

class MyQueue
{
    QueueNode front, rear;
    
    // This function should add an item at
    // rear
	void push(int a)
	{
        // Your code here
        
        QueueNode q = new QueueNode(a);
        if(rear== null)
        {
            front = rear =q;
        }
        else
        {
            rear.next = q;
            rear =q;
        }
        
	}
	
    // This function should remove front
    // item from queue and should return
    // the removed item.
	int pop()
	{
        // Your code here
        if(front == null)
        {
            return -1;
        }
        
        int res = front.data;
        front= front.next;
        
        if(front== null)
        {
            rear =null;
        }
        return res;
        
	}
}





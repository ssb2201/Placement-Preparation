/*
Sort a stack
Given a stack, the task is to sort it such that the top of the stack has the greatest element.

Input:
The first line of input will contains an integer T denoting the no of test cases . Then T test cases follow. Each test case contains an integer N denoting the size of the stack. Then in the next line are N space separated values which are pushed to the the stack. 

Output:
For each test case output will be the popped elements from the sorted stack.

Constraints:
1<=T<=100
1<=N<=100

Expected Time Complexity : O(n)
Expected Auixilliary Space : O(n)

Example(To be used only for expected output):
Input:
2
3
3 2 1
5
11 2 32 3 41

Output:
3 2 1
41 32 11 3 2

Explanation:
For first test case stack will be
1
2
3
After sorting 
3
2 
1

When elements  popped : 3 2 1

Note:The Input/Ouput format and Example given are used for system's internal purpose, and should be used by a user for Expected Output only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.
*/

class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		Stack<Integer> temp = new Stack<>();
		
		while(!s.isEmpty())
		{
		    int tmp = s.pop();
		    
		    while(!temp.isEmpty() && temp.peek()<tmp)
		    {
		        s.push(temp.pop());
		    }
		    
		    temp.push(tmp);
		}
		Stack<Integer> tt = new Stack<>();
		while(!temp.isEmpty())
		{
		    tt.push(temp.pop());
		}
		return tt;
		
	}
}